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
        (java.util.function.Supplier<Object>) () -> ((Object[]) ref)[0];

    public static Object write = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> { ((Object[]) ref)[0] = val; return null; };

    // The { state, value } record of modifyImpl is a Map for untyped records and a
    // generated record class whose accessors are read0/read1 in label order.
    private static Object __recordField(Object record, int index, String label) {
        if (record instanceof java.util.Map) return ((java.util.Map<?, ?>) record).get(label);
        try {
            return record.getClass().getMethod("read" + index, Object.class).invoke(null, record);
        } catch (ReflectiveOperationException error) {
            throw new RuntimeException(error);
        }
    }

    public static Object modifyImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> {
            Object[] cell = (Object[]) ref;
            Object updated = ((java.util.function.Function<Object, Object>) f).apply(cell[0]);
            cell[0] = __recordField(updated, 0, "state");
            return __recordField(updated, 1, "value");
        };
