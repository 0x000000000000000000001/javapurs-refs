public class Effect_Exception {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Exception"); }
    };
    public static Object catchException = FFI_STUB;
    public static Object catchException(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.catchException"); }
    public static Object error = FFI_STUB;
    public static Object error(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.error"); }
    public static Object errorWithCause = FFI_STUB;
    public static Object errorWithCause(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.errorWithCause"); }
    public static Object errorWithName = FFI_STUB;
    public static Object errorWithName(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.errorWithName"); }
    public static Object message = FFI_STUB;
    public static Object message(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.message"); }
    public static Object name = FFI_STUB;
    public static Object name(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.name"); }
    public static Object showErrorImpl = FFI_STUB;
    public static Object showErrorImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.showErrorImpl"); }
    public static Object stackImpl = FFI_STUB;
    public static Object stackImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.stackImpl"); }
    public static Object throwException = FFI_STUB;
    public static Object throwException(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Exception.throwException"); }

public static final Object $try = (java.util.function.Function<Object, Object>) (action_0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Effect_Exception.catchException)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (Control_Applicative.pure)).apply(Effect.applicativeEffect)))).apply(Data_Either.Left)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Effect.functorEffect).get("map"))).apply(Data_Either.Right))).apply(action_0)); };
public static final Object $throw = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Effect_Exception.throwException))).apply(Effect_Exception.error);
public static final Object stack = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Effect_Exception.stackImpl)).apply(Data_Maybe.Just))).apply(Data_Maybe.__singleton$Nothing.value);
public static final Object showError = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Effect_Exception.showErrorImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
}
