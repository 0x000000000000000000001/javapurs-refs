    // A mutable cell is a one-element array.
    public static Object _new = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Supplier<Object>) () -> new Object[]{ val };

    public static Object newWithSelf = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            Object[] cell = new Object[]{ null };
            cell[0] = ((java.util.function.Function<Object, Object>) f).apply(cell);
            return cell;
        };

    public static Object read = (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> {
            synchronized (ref) { return ((Object[]) ref)[0]; }
        };

    public static Object write = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> {
            synchronized (ref) { ((Object[]) ref)[0] = val; }
            return null;
        };

    // Current typed records and untyped records both implement Map. The
    // reflective fallback retains compatibility with older read0/read1 layouts.
    private static Object __recordField(Object record, int index, String label) {
        if (record instanceof java.util.Map) return ((java.util.Map<?, ?>) record).get(label);
        try {
            return record.getClass().getMethod("read" + index, Object.class).invoke(null, record);
        } catch (ReflectiveOperationException error) {
            throw new RuntimeException(error);
        }
    }

    // The JVM runs Aff fibers on real threads, so the read-apply-write cycle
    // must hold a lock on the cell; otherwise concurrent `modify'` calls lose
    // updates. The callback runs once under the monitor; a thrown callback
    // leaves the old state intact. This lock protects the cell, not its contents.
    public static Object modifyImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> {
            Object[] cell = (Object[]) ref;
            synchronized (cell) {
                Object updated = ((java.util.function.Function<Object, Object>) f).apply(cell[0]);
                cell[0] = __recordField(updated, 0, "state");
                return __recordField(updated, 1, "value");
            }
        };
