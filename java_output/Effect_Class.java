public class Effect_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Class"); }
    };


public static final Object monadEffectEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Control_Category.identity)).apply(Control_Category.categoryFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Effect.monadEffect; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_45_66_66_65_63_74_O(new String[]{"liftEffect", "Monad0"}, __field1, __field0); } }).get();
public static final Object liftEffect = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("liftEffect"); };
}
