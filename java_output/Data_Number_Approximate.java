public class Data_Number_Approximate {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Number.Approximate"); }
    };


public static final Object Tolerance = (java.util.function.Function<Object, Object>) (x_0) -> { return x_0; };
public static final Object Fraction = (java.util.function.Function<Object, Object>) (x_0) -> { return x_0; };
public static final Object eqRelative = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (v1_1) -> { return (java.util.function.Function<Object, Object>) (v2_2) -> { return Data_Number_Approximate.__direct$2(v_0, v1_1, v2_2); }; }; };
private static Object __direct$2(Object v_0, Object v1_1, Object v2_2) { return ( ((Boolean) ((((double) (v1_1)) == ((double) (0.0))))) ? (((Double) (((java.util.function.Function<Object, Object>) (Data_Number.abs)).apply(v2_2))) <= ((Double) (v_0))) : ( ((Boolean) ((((double) (v2_2)) == ((double) (0.0))))) ? (((Double) (((java.util.function.Function<Object, Object>) (Data_Number.abs)).apply(v1_1))) <= ((Double) (v_0))) : (((Double) (((java.util.function.Function<Object, Object>) (Data_Number.abs)).apply((((Double) (v1_1)) - ((Double) (v2_2)))))) <= ((Double) ((((Double) ((((Double) (v_0)) * ((Double) (((java.util.function.Function<Object, Object>) (Data_Number.abs)).apply((((Double) (v1_1)) + ((Double) (v2_2))))))))) / ((Double) (2.0)))))))); }
public static final Object eqApproximate = ((java.util.function.Function<Object, Object>) (Data_Number_Approximate.eqRelative)).apply(0.000001);
public static final Object neqApproximate = (java.util.function.Function<Object, Object>) (x_0) -> { return (java.util.function.Function<Object, Object>) (y_1) -> { return (!(((Boolean) (( ((Boolean) ((Data_Number_Approximate.eqRelative == null))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Number_Approximate.eqRelative)).apply(0.000001))).apply(x_0))).apply(y_1) : Data_Number_Approximate.__direct$2(0.000001, x_0, y_1)))))); }; };
public static final Object eqAbsolute = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (x_1) -> { return (java.util.function.Function<Object, Object>) (y_2) -> { return (((Double) (((java.util.function.Function<Object, Object>) (Data_Number.abs)).apply((((Double) (x_1)) - ((Double) (y_2)))))) <= ((Double) (v_0))); }; }; };
}
