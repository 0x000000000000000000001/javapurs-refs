public class Effect_Exception_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Exception.Unsafe"); }
    };


public static final Object unsafeThrowException = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Effect_Unsafe.unsafePerformEffect))).apply(Effect_Exception.throwException);
public static final Object unsafeThrow = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Effect_Exception_Unsafe.unsafeThrowException))).apply(Effect_Exception.error);
}
