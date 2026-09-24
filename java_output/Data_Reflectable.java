public class Data_Reflectable {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Reflectable"); }
    };
    public static Object unsafeCoerce = FFI_STUB;
    public static Object unsafeCoerce(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Reflectable.unsafeCoerce"); }

public static final Object reifiableString = (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get();
public static final Object reifiableOrdering = (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get();
public static final Object reifiableInt = (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get();
public static final Object reifiableBoolean = (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get();
public static final Object reifyType = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (s_1) -> { return (java.util.function.Function<Object, Object>) (f_2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Reflectable.unsafeCoerce)).apply((java.util.function.Function<Object, Object>) (dictReflectable_3) -> { return ((java.util.function.Function<Object, Object>) (f_2)).apply(dictReflectable_3); }))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_3) -> { return s_1; }; return new __Record$72_65_66_6c_65_63_74_54_79_70_65_O(new String[]{"reflectType"}, __field0); } }).get()))).apply(Type_Proxy.__singleton$Proxy.value); }; }; };
public static final Object reflectType = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("reflectType"); };
}
