public class Data_Array_Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.Partial"); }
    };


public static final Object tail = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (xs_1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array.sliceImpl)).apply(1))).apply(((Object[]) (Object)(xs_1)).length))).apply(xs_1); }; };
public static final Object last = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (xs_1) -> { return ((Object[]) (xs_1))[((int) ((((int) (((Object[]) (Object)(xs_1)).length)) - ((int) (1)))))]; }; };
public static final Object init = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (xs_1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array.sliceImpl)).apply(0))).apply((((int) (((Object[]) (Object)(xs_1)).length)) - ((int) (1)))))).apply(xs_1); }; };
public static final Object head = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (xs_1) -> { return ((Object[]) (xs_1))[((int) (0))]; }; };
}
