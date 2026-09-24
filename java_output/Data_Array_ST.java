public class Data_Array_ST {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.ST"); }
    };
    public static Object cloneImpl = FFI_STUB;
    public static Object cloneImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.cloneImpl"); }
    public static Object freezeImpl = FFI_STUB;
    public static Object freezeImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.freezeImpl"); }
    public static Object lengthImpl = FFI_STUB;
    public static Object lengthImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.lengthImpl"); }
    public static Object $new = FFI_STUB;
    public static Object $new(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.new"); }
    public static Object peekImpl = FFI_STUB;
    public static Object peekImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.peekImpl"); }
    public static Object pokeImpl = FFI_STUB;
    public static Object pokeImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.pokeImpl"); }
    public static Object popImpl = FFI_STUB;
    public static Object popImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.popImpl"); }
    public static Object pushAllImpl = FFI_STUB;
    public static Object pushAllImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.pushAllImpl"); }
    public static Object pushImpl = FFI_STUB;
    public static Object pushImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.pushImpl"); }
    public static Object shiftImpl = FFI_STUB;
    public static Object shiftImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.shiftImpl"); }
    public static Object sortByImpl = FFI_STUB;
    public static Object sortByImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.sortByImpl"); }
    public static Object spliceImpl = FFI_STUB;
    public static Object spliceImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.spliceImpl"); }
    public static Object thawImpl = FFI_STUB;
    public static Object thawImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.thawImpl"); }
    public static Object toAssocArrayImpl = FFI_STUB;
    public static Object toAssocArrayImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.toAssocArrayImpl"); }
    public static Object unsafeFreezeImpl = FFI_STUB;
    public static Object unsafeFreezeImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.unsafeFreezeImpl"); }
    public static Object unsafeThawImpl = FFI_STUB;
    public static Object unsafeThawImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.unsafeThawImpl"); }
    public static Object unshiftAllImpl = FFI_STUB;
    public static Object unshiftAllImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Array.ST.unshiftAllImpl"); }

public static final Object unshiftAll = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.unshiftAllImpl);
public static final Object unshift = (java.util.function.Function<Object, Object>) (a_0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.unshiftAllImpl))).apply(new Object[]{a_0}); };
public static final Object unsafeThaw = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.unsafeThawImpl);
public static final Object unsafeFreeze = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.unsafeFreezeImpl);
public static final Object toAssocArray = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.toAssocArrayImpl);
public static final Object thaw = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.thawImpl);
public static final Object withArray = (java.util.function.Function<Object, Object>) (f_0) -> { return (java.util.function.Function<Object, Object>) (xs_1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2 = ((java.util.function.Function<Object, Object>) (Data_Array_ST.thaw)).apply(xs_1); Object result_3 = ((java.util.function.Supplier) (Object)(__local_var_2)).get(); Object _dollar___unused_4 = ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (f_0)).apply(result_3))).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (Data_Array_ST.unsafeFreeze)).apply(result_3))).get(); } }); }; };
public static final Object splice = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn4)).apply(Data_Array_ST.spliceImpl);
public static final Object sortBy = (java.util.function.Function<Object, Object>) (comp_0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.sortByImpl))).apply(comp_0))).apply((java.util.function.Function<Object, Object>) (v_1) -> { return ( ((Boolean) ((v_1 instanceof Data_Ordering.GT))) ? 1 : ( ((Boolean) ((v_1 instanceof Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.LT))) ? -1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }); };
public static final Object sortWith = (java.util.function.Function<Object, Object>) (dictOrd_0) -> { return (java.util.function.Function<Object, Object>) (f_1) -> { return ((java.util.function.Function<Object, Object>) (Data_Array_ST.sortBy)).apply((java.util.function.Function<Object, Object>) (x_2) -> { return (java.util.function.Function<Object, Object>) (y_3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictOrd_0).get("compare"))).apply(((java.util.function.Function<Object, Object>) (f_1)).apply(x_2)))).apply(((java.util.function.Function<Object, Object>) (f_1)).apply(y_3)); }; }); }; };
public static final Object sort = (java.util.function.Function<Object, Object>) (dictOrd_0) -> { return ((java.util.function.Function<Object, Object>) (Data_Array_ST.sortBy)).apply(((java.util.function.Function<Object, Object>) (Data_Ord.compare)).apply(dictOrd_0)); };
public static final Object shift = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.shiftImpl))).apply(Data_Maybe.Just))).apply(Data_Maybe.__singleton$Nothing.value);
public static final Object run = (java.util.function.Function<Object, Object>) (st_0) -> { return ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.run)).apply((new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1 = ((java.util.function.Supplier) (Object)(st_0)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (Data_Array_ST.unsafeFreeze)).apply(__local_var_1))).get(); } })); };
public static final Object pushAll = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.pushAllImpl);
public static final Object push = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.pushImpl);
public static final Object pop = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.popImpl))).apply(Data_Maybe.Just))).apply(Data_Maybe.__singleton$Nothing.value);
public static final Object poke = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.pokeImpl);
public static final Object peek = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn4)).apply(Data_Array_ST.peekImpl))).apply(Data_Maybe.Just))).apply(Data_Maybe.__singleton$Nothing.value);
public static final Object modify = (java.util.function.Function<Object, Object>) (i_0) -> { return (java.util.function.Function<Object, Object>) (f_1) -> { return (java.util.function.Function<Object, Object>) (xs_2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array_ST.peek)).apply(i_0))).apply(xs_2); Object entry_4 = ((java.util.function.Supplier) (Object)(__local_var_3)).get(); return ((java.util.function.Supplier) (Object)(( ((Boolean) ((entry_4 instanceof Data_Maybe.Just))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array_ST.poke)).apply(i_0))).apply(((java.util.function.Function<Object, Object>) (f_1)).apply(((Data_Maybe.Just) (Object)(entry_4)).value0)))).apply(xs_2) : ( ((Boolean) ((entry_4 instanceof Data_Maybe.Nothing))) ? (new java.util.function.Supplier<Object>() { public Object get() { return false; } }) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())))).get(); } }); }; }; };
public static final Object length = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.lengthImpl);
public static final Object freeze = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.freezeImpl);
public static final Object clone = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.cloneImpl);
}
