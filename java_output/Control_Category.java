public class Control_Category {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Category"); }
    };


public static final Object identity = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("identity"); };
public static final Object categoryFn = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0) -> { return x_0; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Semigroupoid.semigroupoidFn; }; return new __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O(new String[]{"identity", "Semigroupoid0"}, __field1, __field0); } }).get();
}
