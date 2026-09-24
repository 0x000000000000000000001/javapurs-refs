public class Data_Symbol {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Symbol"); }
    };
    public static Object unsafeCoerce = FFI_STUB;
    public static Object unsafeCoerce(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Symbol.unsafeCoerce"); }

public static final Object reifySymbol = (java.util.function.Function<Object, Object>) (s_0) -> { return (java.util.function.Function<Object, Object>) (f_1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Symbol.unsafeCoerce)).apply((java.util.function.Function<Object, Object>) (dictIsSymbol_2) -> { return ((java.util.function.Function<Object, Object>) (f_1)).apply(dictIsSymbol_2); }))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2) -> { return s_0; }; return new __Record$72_65_66_6c_65_63_74_53_79_6d_62_6f_6c_O(new String[]{"reflectSymbol"}, __field0); } }).get()))).apply(Type_Proxy.__singleton$Proxy.value); }; };
public static final Object reflectSymbol = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("reflectSymbol"); };
}
