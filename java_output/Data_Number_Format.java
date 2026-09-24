public class Data_Number_Format {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Number.Format"); }
    };
    public static Object toExponentialNative = FFI_STUB;
    public static Object toExponentialNative(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Number.Format.toExponentialNative"); }
    public static Object toFixedNative = FFI_STUB;
    public static Object toFixedNative(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Number.Format.toFixedNative"); }
    public static Object toPrecisionNative = FFI_STUB;
    public static Object toPrecisionNative(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Number.Format.toPrecisionNative"); }
    public static Object toString = FFI_STUB;
    public static Object toString(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Data.Number.Format.toString"); }

public static final class Precision {
            public final int value0;
            public Precision(Object value0) {
                this.value0 = ((int) (value0));
            }
            public Precision(int value0) {
                this.value0 = ((int) (value0));
            }
        }
public static final class Fixed {
            public final int value0;
            public Fixed(Object value0) {
                this.value0 = ((int) (value0));
            }
            public Fixed(int value0) {
                this.value0 = ((int) (value0));
            }
        }
public static final class Exponential {
            public final int value0;
            public Exponential(Object value0) {
                this.value0 = ((int) (value0));
            }
            public Exponential(int value0) {
                this.value0 = ((int) (value0));
            }
        }
public static final Object Precision = (java.util.function.Function<Object, Object>) (value0) -> { return new Data_Number_Format.Precision(value0); };
public static final Object Fixed = (java.util.function.Function<Object, Object>) (value0) -> { return new Data_Number_Format.Fixed(value0); };
public static final Object Exponential = (java.util.function.Function<Object, Object>) (value0) -> { return new Data_Number_Format.Exponential(value0); };
public static final Object toStringWith = (java.util.function.Function<Object, Object>) (v_0) -> { return ( ((Boolean) ((v_0 instanceof Data_Number_Format.Precision))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toPrecisionNative)).apply(((Data_Number_Format.Precision) (Object)(v_0)).value0) : ( ((Boolean) ((v_0 instanceof Data_Number_Format.Fixed))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toFixedNative)).apply(((Data_Number_Format.Fixed) (Object)(v_0)).value0) : ( ((Boolean) ((v_0 instanceof Data_Number_Format.Exponential))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toExponentialNative)).apply(((Data_Number_Format.Exponential) (Object)(v_0)).value0) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); };
public static final Object precision = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Data_Number_Format.Precision))).apply((__IntFn) (x_0) -> { int __local_var_1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(1))).apply(x_0); return ( ((Boolean) ((v_1 instanceof Data_Ordering.LT))) ? x_0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.EQ))) ? 1 : ( ((Boolean) ((v_1 instanceof Data_Ordering.GT))) ? 1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(21))).apply(__local_var_1); return ((int) (( ((Boolean) ((v_2 instanceof Data_Ordering.LT))) ? 21 : ( ((Boolean) ((v_2 instanceof Data_Ordering.EQ))) ? 21 : ( ((Boolean) ((v_2 instanceof Data_Ordering.GT))) ? __local_var_1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); });
public static final Object fixed = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Data_Number_Format.Fixed))).apply((__IntFn) (x_0) -> { int __local_var_1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(0))).apply(x_0); return ( ((Boolean) ((v_1 instanceof Data_Ordering.LT))) ? x_0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.GT))) ? 0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(20))).apply(__local_var_1); return ((int) (( ((Boolean) ((v_2 instanceof Data_Ordering.LT))) ? 20 : ( ((Boolean) ((v_2 instanceof Data_Ordering.EQ))) ? 20 : ( ((Boolean) ((v_2 instanceof Data_Ordering.GT))) ? __local_var_1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); });
public static final Object exponential = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Semigroupoid.compose)).apply(Control_Semigroupoid.semigroupoidFn))).apply(Data_Number_Format.Exponential))).apply((__IntFn) (x_0) -> { int __local_var_1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(0))).apply(x_0); return ( ((Boolean) ((v_1 instanceof Data_Ordering.LT))) ? x_0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((v_1 instanceof Data_Ordering.GT))) ? 0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Data_Ord.ordInt).get("compare"))).apply(20))).apply(__local_var_1); return ((int) (( ((Boolean) ((v_2 instanceof Data_Ordering.LT))) ? 20 : ( ((Boolean) ((v_2 instanceof Data_Ordering.EQ))) ? 20 : ( ((Boolean) ((v_2 instanceof Data_Ordering.GT))) ? __local_var_1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); });
}
