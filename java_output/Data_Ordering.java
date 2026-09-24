public class Data_Ordering {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Ordering"); }
    };


public static final class LT {
            
            public LT() {
                
            }
        }
public static final class __singleton$LT {
    public static final LT value = new LT();
}
public static final class GT {
            
            public GT() {
                
            }
        }
public static final class __singleton$GT {
    public static final GT value = new GT();
}
public static final class EQ {
            
            public EQ() {
                
            }
        }
public static final class __singleton$EQ {
    public static final EQ value = new EQ();
}
public static final Object LT = Data_Ordering.__singleton$LT.value;
public static final Object GT = Data_Ordering.__singleton$GT.value;
public static final Object EQ = Data_Ordering.__singleton$EQ.value;
public static final Object showOrdering = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return ( ((Boolean) ((v_0 instanceof Data_Ordering.LT))) ? "LT" : ( ((Boolean) ((v_0 instanceof Data_Ordering.GT))) ? "GT" : ( ((Boolean) ((v_0 instanceof Data_Ordering.EQ))) ? "EQ" : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object semigroupOrdering = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (v1_1) -> { return ( ((Boolean) ((v_0 instanceof Data_Ordering.LT))) ? Data_Ordering.__singleton$LT.value : ( ((Boolean) ((v_0 instanceof Data_Ordering.GT))) ? Data_Ordering.__singleton$GT.value : ( ((Boolean) ((v_0 instanceof Data_Ordering.EQ))) ? v1_1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get();
public static final Object invert = (java.util.function.Function<Object, Object>) (v_0) -> { return ( ((Boolean) ((v_0 instanceof Data_Ordering.GT))) ? Data_Ordering.__singleton$LT.value : ( ((Boolean) ((v_0 instanceof Data_Ordering.EQ))) ? Data_Ordering.__singleton$EQ.value : ( ((Boolean) ((v_0 instanceof Data_Ordering.LT))) ? Data_Ordering.__singleton$GT.value : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); };
public static final Object eqOrdering = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (v1_1) -> { return ( ((Boolean) ((v_0 instanceof Data_Ordering.LT))) ? (v1_1 instanceof Data_Ordering.LT) : ( ((Boolean) ((v_0 instanceof Data_Ordering.GT))) ? (v1_1 instanceof Data_Ordering.GT) : (((Boolean) ((v_0 instanceof Data_Ordering.EQ))) && ((Boolean) ((v1_1 instanceof Data_Ordering.EQ)))))); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get();
}
