public class Type_Equality {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Type.Equality"); }
    };


public static final Object refl = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a_0) -> { return a_0; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O$70_72_6f_6f_66_O(new String[]{"proof", "Coercible0"}, __field1, __field0); } }).get();
public static final Object proof = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("proof"); };
public static final Object to = (java.util.function.Function<Object, Object>) (dictTypeEquals_0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Type_Equality.proof)).apply(dictTypeEquals_0))).apply((java.util.function.Function<Object, Object>) (a_1) -> { return a_1; }); };
public static final Object from = (java.util.function.Function<Object, Object>) (dictTypeEquals_0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Type_Equality.proof)).apply(dictTypeEquals_0))).apply((java.util.function.Function<Object, Object>) (a_1) -> { return a_1; }); };
}
