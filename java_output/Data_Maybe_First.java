public class Data_Maybe_First {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Maybe.First"); }
    };


public static final Object First = (java.util.function.Function<Object, Object>) (x_0) -> { return x_0; };
public static final Object showFirst = (java.util.function.Function<Object, Object>) (dictShow_0) -> { Object showMaybe_1 = ((java.util.function.Function<Object, Object>) (Data_Maybe.showMaybe)).apply(dictShow_0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2) -> { return (((String) ((((String) ("First (")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showMaybe_1).get("show"))).apply(v_2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); };
public static final Object semigroupFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (v1_1) -> { return ( ((Boolean) ((v_0 instanceof Data_Maybe.Just))) ? v_0 : v1_1); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get();
public static final Object ordFirst = (java.util.function.Function<Object, Object>) (dictOrd_0) -> { return ((java.util.function.Function<Object, Object>) (Data_Maybe.ordMaybe)).apply(dictOrd_0); };
public static final Object ord1First = Data_Maybe.ord1Maybe;
public static final Object newtypeFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get();
public static final Object monoidFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Data_Maybe_First.semigroupFirst; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get();
public static final Object monadFirst = Data_Maybe.monadMaybe;
public static final Object invariantFirst = Data_Maybe.invariantMaybe;
public static final Object functorFirst = Data_Maybe.functorMaybe;
public static final Object extendFirst = Data_Maybe.extendMaybe;
public static final Object eqFirst = (java.util.function.Function<Object, Object>) (dictEq_0) -> { return ((java.util.function.Function<Object, Object>) (Data_Maybe.eqMaybe)).apply(dictEq_0); };
public static final Object eq1First = Data_Maybe.eq1Maybe;
public static final Object boundedFirst = (java.util.function.Function<Object, Object>) (dictBounded_0) -> { return ((java.util.function.Function<Object, Object>) (Data_Maybe.boundedMaybe)).apply(dictBounded_0); };
public static final Object bindFirst = Data_Maybe.bindMaybe;
public static final Object applyFirst = Data_Maybe.applyMaybe;
public static final Object applicativeFirst = Data_Maybe.applicativeMaybe;
public static final Object altFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Data_Semigroup.append)).apply(Data_Maybe_First.semigroupFirst); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Data_Maybe.functorMaybe; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get();
public static final Object plusFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Data_Monoid.mempty)).apply(Data_Maybe_First.monoidFirst); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Data_Maybe_First.altFirst; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get();
public static final Object alternativeFirst = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Data_Maybe.applicativeMaybe; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Data_Maybe_First.plusFirst; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get();
}
