public class Control_Semigroupoid {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Semigroupoid"); }
    };


public static final Object semigroupoidFn = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0) -> { return (java.util.function.Function<Object, Object>) (g_1) -> { return (java.util.function.Function<Object, Object>) (x_2) -> { return ((java.util.function.Function<Object, Object>) (f_0)).apply(((java.util.function.Function<Object, Object>) (g_1)).apply(x_2)); }; }; }; return new __Record$63_6f_6d_70_6f_73_65_O(new String[]{"compose"}, __field0); } }).get();
public static final Object compose = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("compose"); };
public static final Object composeFlipped = (java.util.function.Function<Object, Object>) (dictSemigroupoid_0) -> { return (java.util.function.Function<Object, Object>) (f_1) -> { return (java.util.function.Function<Object, Object>) (g_2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(dictSemigroupoid_0))).apply(g_2))).apply(f_1); }; }; };
}
