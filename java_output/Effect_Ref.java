public class Effect_Ref {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Ref"); }
    };
    // FFI provided by src/Effect/Ref.java
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


public static final Object $new = Effect_Ref._new;
public static final Object modifyprime = Effect_Ref.modifyImpl;
public static final Object modify = (java.util.function.Function<Object, Object>) (f_0) -> { return ((java.util.function.Function<Object, Object>) (Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_1) -> { Object s_prime__2 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_1); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = s_prime__2; final Object __field1 = s_prime__2; return new __Record$73_74_61_74_65_O$76_61_6c_75_65_O(new String[]{"state", "value"}, __field0, __field1); } }).get(); }); };
public static final Object modify_ = (java.util.function.Function<Object, Object>) (f_0) -> { return (java.util.function.Function<Object, Object>) (s_1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Functor.$void)).apply(Effect.functorEffect))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_2) -> { Object s_prime__3 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_2); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = s_prime__3; final Object __field1 = s_prime__3; return new __Record$73_74_61_74_65_O$76_61_6c_75_65_O(new String[]{"state", "value"}, __field0, __field1); } }).get(); }))).apply(s_1)); }; };
}
