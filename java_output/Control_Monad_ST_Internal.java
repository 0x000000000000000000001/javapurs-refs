public class Control_Monad_ST_Internal {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.ST.Internal"); }
    };
    // FFI provided by ../javapurs-st/src/Control/Monad/ST/Internal.java
    public static Object map_ = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.function.Function<Object, Object>) f).apply(((java.util.function.Supplier<Object>) a).get());

    public static Object pure_ = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> a;

    public static Object bind_ = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.function.Function<Object, Object>) f).apply(((java.util.function.Supplier<Object>) a).get()).get();

    public static Object run = (java.util.function.Function<Object, Object>) (f) ->
        ((java.util.function.Supplier<Object>) f).get();

    public static Object while = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> {
            while ((Boolean) ((java.util.function.Supplier<Object>) f).get()) {
                ((java.util.function.Supplier<Object>) a).get();
            }
            return null;
        };

    public static Object for = (java.util.function.Function<Object, Object>) (lo) ->
        (java.util.function.Function<Object, Object>) (hi) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (int i = (Integer) lo; i < (Integer) hi; i++) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(i)).get();
            }
            return null;
        };

    public static Object foreach = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (Object item : (Object[]) as) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(item)).get();
            }
            return null;
        };

    // A mutable cell is a one-element array.
    public static Object new = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Supplier<Object>) () -> new Object[]{ val };

    public static Object read = (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> ((Object[]) ref)[0];

    public static Object write = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> { ((Object[]) ref)[0] = val; return val; };


public static final Object modifyprime = Control_Monad_ST_Internal.modifyImpl;
public static final Object modify = (java.util.function.Function<Object, Object>) (f_0) -> { return ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_1) -> { Object s_prime__2 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_1); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = s_prime__2; final Object __field1 = s_prime__2; return new __Record$73_74_61_74_65_O$76_61_6c_75_65_O(new String[]{"state", "value"}, __field0, __field1); } }).get(); }); };
public static final Object functorST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Control_Monad_ST_Internal.map_; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
private static Object __lazy_value_monadST;
private static int __lazy_state_monadST;
private static Object __lazy_get_monadST() { if (__lazy_state_monadST == 2) return __lazy_value_monadST; if (__lazy_state_monadST == 1) throw new IllegalStateException("Recursive initialization of monadST"); __lazy_state_monadST = 1; __lazy_value_monadST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.__lazy_get_applicativeST(); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.__lazy_get_bindST(); }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$42_69_6e_64_31_O(new String[]{"Applicative0", "Bind1"}, __field0, __field1); } }).get(); __lazy_state_monadST = 2; return __lazy_value_monadST; }
public static final Object monadST = __lazy_get_monadST();
private static Object __lazy_value_bindST;
private static int __lazy_state_bindST;
private static Object __lazy_get_bindST() { if (__lazy_state_bindST == 2) return __lazy_value_bindST; if (__lazy_state_bindST == 1) throw new IllegalStateException("Recursive initialization of bindST"); __lazy_state_bindST = 1; __lazy_value_bindST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Control_Monad_ST_Internal.bind_; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.__lazy_get_applyST(); }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_bindST = 2; return __lazy_value_bindST; }
public static final Object bindST = __lazy_get_bindST();
private static Object __lazy_value_applyST;
private static int __lazy_state_applyST;
private static Object __lazy_get_applyST() { if (__lazy_state_applyST == 2) return __lazy_value_applyST; if (__lazy_state_applyST == 1) throw new IllegalStateException("Recursive initialization of applyST"); __lazy_state_applyST = 1; __lazy_value_applyST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Control_Monad.ap)).apply(Control_Monad_ST_Internal.__lazy_get_monadST()); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.functorST; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); __lazy_state_applyST = 2; return __lazy_value_applyST; }
public static final Object applyST = __lazy_get_applyST();
private static Object __lazy_value_applicativeST;
private static int __lazy_state_applicativeST;
private static Object __lazy_get_applicativeST() { if (__lazy_state_applicativeST == 2) return __lazy_value_applicativeST; if (__lazy_state_applicativeST == 1) throw new IllegalStateException("Recursive initialization of applicativeST"); __lazy_state_applicativeST = 1; __lazy_value_applicativeST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Control_Monad_ST_Internal.pure_; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.__lazy_get_applyST(); }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_applicativeST = 2; return __lazy_value_applicativeST; }
public static final Object applicativeST = __lazy_get_applicativeST();
public static final Object semigroupST = (java.util.function.Function<Object, Object>) (dictSemigroup_0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (Data_Semigroup.append)).apply(dictSemigroup_0); return (java.util.function.Function<Object, Object>) (a_2) -> { return (java.util.function.Function<Object, Object>) (b_3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad.ap)).apply(Control_Monad_ST_Internal.monadST))).apply((new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_4 = ((java.util.function.Supplier) (Object)(a_2)).get(); return ((java.util.function.Function<Object, Object>) (__local_var_1)).apply(__local_var_4); } })))).apply(b_3); }; }; } }).get(); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); };
public static final Object monadRecST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0) -> { return (java.util.function.Function<Object, Object>) (a_1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Bind.bind)).apply(Control_Monad_ST_Internal.bindST))).apply(((java.util.function.Function<Object, Object>) (f_0)).apply(a_1)))).apply(Control_Monad_ST_Internal.$new); Object r_3 = ((java.util.function.Supplier) (Object)(__local_var_2)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Bind.bind)).apply(Control_Monad_ST_Internal.bindST))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.$while)).apply((new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_4 = null /* TODO: unknown syntax PrimEffect */; return (__local_var_4 instanceof Control_Monad_Rec_Class.Loop); } })))).apply((new java.util.function.Supplier<Object>() { public Object get() { Object v_4 = null /* TODO: unknown syntax PrimEffect */; return ((java.util.function.Supplier) (Object)(( ((Boolean) ((v_4 instanceof Control_Monad_Rec_Class.Loop))) ? (new java.util.function.Supplier<Object>() { public Object get() { Object e_5 = ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (f_0)).apply(((Control_Monad_Rec_Class.Loop) (Object)(v_4)).value0))).get(); Object __local_var_6 = null /* TODO: unknown syntax PrimEffect */; return Data_Unit.unit; } }) : ( ((Boolean) ((v_4 instanceof Control_Monad_Rec_Class.Done))) ? (new java.util.function.Supplier<Object>() { public Object get() { return Data_Unit.unit; } }) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())))).get(); } }))))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_4) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_5 = null /* TODO: unknown syntax PrimEffect */; return ( ((Boolean) ((__local_var_5 instanceof Control_Monad_Rec_Class.Done))) ? ((Control_Monad_Rec_Class.Done) (Object)(__local_var_5)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); } }); }))).get(); } }); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return Control_Monad_ST_Internal.monadST; }; return new __Record$4d_6f_6e_61_64_30_O$74_61_69_6c_52_65_63_4d_O(new String[]{"tailRecM", "Monad0"}, __field1, __field0); } }).get();
public static final Object monoidST = (java.util.function.Function<Object, Object>) (dictMonoid_0) -> { Object semigroupST1_1 = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.semigroupST)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonoid_0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2 = ((java.util.Map<String, Object>) dictMonoid_0).get("mempty"); return __local_var_2; } }); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2) -> { return semigroupST1_1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); };
}
