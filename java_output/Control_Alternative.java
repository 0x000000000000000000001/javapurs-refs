public class Control_Alternative {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Alternative"); }
    };


public static final Object guard = (java.util.function.Function<Object, Object>) (dictAlternative_0) -> { Object Applicative0_1 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictAlternative_0).get("Applicative0"))).apply(null /* TODO: PrimUndefined */); Object empty_2 = ((java.util.function.Function<Object, Object>) (Control_Plus.empty)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictAlternative_0).get("Plus1"))).apply(null /* TODO: PrimUndefined */)); return (java.util.function.Function<Object, Object>) (v_3) -> { return ( ((Boolean) (v_3)) ? ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Applicative0_1).get("pure"))).apply(Data_Unit.unit) : empty_2); }; };
public static final Object alternativeArray = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Applicative.applicativeArray; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Plus.plusArray; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get();
}
