public class Data_Monoid_Alternate {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Monoid.Alternate"); }
    };


public static final Object Alternate = (java.util.function.Function<Object, Object>) (x_0) -> { return x_0; };
public static final Object showAlternate = (java.util.function.Function<Object, Object>) (dictShow_0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1) -> { return (((String) ((((String) ("(Alternate ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0).get("show"))).apply(v_1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); };
public static final Object semigroupAlternate = (java.util.function.Function<Object, Object>) (dictAlt_0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1) -> { return (java.util.function.Function<Object, Object>) (v1_2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictAlt_0).get("alt"))).apply(v_1))).apply(v1_2); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); };
public static final Object plusAlternate = (java.util.function.Function<Object, Object>) (dictPlus_0) -> { return dictPlus_0; };
public static final Object ordAlternate = (java.util.function.Function<Object, Object>) (dictOrd_0) -> { return dictOrd_0; };
public static final Object ord1Alternate = (java.util.function.Function<Object, Object>) (dictOrd1_0) -> { return dictOrd1_0; };
public static final Object newtypeAlternate = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get();
public static final Object monoidAlternate = (java.util.function.Function<Object, Object>) (dictPlus_0) -> { Object semigroupAlternate1_1 = ((java.util.function.Function<Object, Object>) (Data_Monoid_Alternate.semigroupAlternate)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictPlus_0).get("Alt0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Control_Plus.empty)).apply(dictPlus_0); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2) -> { return semigroupAlternate1_1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); };
public static final Object monadAlternate = (java.util.function.Function<Object, Object>) (dictMonad_0) -> { return dictMonad_0; };
public static final Object functorAlternate = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> { return dictFunctor_0; };
public static final Object extendAlternate = (java.util.function.Function<Object, Object>) (dictExtend_0) -> { return dictExtend_0; };
public static final Object eqAlternate = (java.util.function.Function<Object, Object>) (dictEq_0) -> { return dictEq_0; };
public static final Object eq1Alternate = (java.util.function.Function<Object, Object>) (dictEq1_0) -> { return dictEq1_0; };
public static final Object comonadAlternate = (java.util.function.Function<Object, Object>) (dictComonad_0) -> { return dictComonad_0; };
public static final Object boundedAlternate = (java.util.function.Function<Object, Object>) (dictBounded_0) -> { return dictBounded_0; };
public static final Object bindAlternate = (java.util.function.Function<Object, Object>) (dictBind_0) -> { return dictBind_0; };
public static final Object applyAlternate = (java.util.function.Function<Object, Object>) (dictApply_0) -> { return dictApply_0; };
public static final Object applicativeAlternate = (java.util.function.Function<Object, Object>) (dictApplicative_0) -> { return dictApplicative_0; };
public static final Object alternativeAlternate = (java.util.function.Function<Object, Object>) (dictAlternative_0) -> { return dictAlternative_0; };
public static final Object altAlternate = (java.util.function.Function<Object, Object>) (dictAlt_0) -> { return dictAlt_0; };
}
