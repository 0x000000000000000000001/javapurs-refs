public class Data_Show {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Show"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Show.java
    public static final Object showIntImpl = (java.util.function.Function<Object, Object>) (value) -> ((Integer) value).toString();

    public static final Object showNumberImpl = (java.util.function.Function<Object, Object>) (value) -> {
        double number = ((Number) value).doubleValue();
        if (!Double.isFinite(number)) return Double.toString(number);
        if (number == 0.0) return "0.0";
        java.math.BigDecimal decimal = java.math.BigDecimal.valueOf(number).stripTrailingZeros();
        double magnitude = Math.abs(number);
        if (magnitude >= 1e-6 && magnitude < 1e21) {
            String result = decimal.toPlainString();
            return decimal.scale() <= 0 ? result + ".0" : result;
        }
        return decimal.toString().replace('E', 'e');
    };

    public static final Object showCharImpl = (java.util.function.Function<Object, Object>) (value) -> {
        char code = value instanceof Character ? (Character) value : ((String) value).charAt(0);
        return "'" + (code == '\'' ? "\\'" : showEscape(code, false)) + "'";
    };

    public static final Object showStringImpl = (java.util.function.Function<Object, Object>) (value) -> {
        String string = (String) value;
        StringBuilder result = new StringBuilder("\"");
        for (int i = 0; i < string.length(); i++) {
            char code = string.charAt(i);
            String escaped = showEscape(code, true);
            result.append(escaped);
            if (escaped.length() > 1 && Character.isDigit(escaped.charAt(1)) && i + 1 < string.length()) {
                char next = string.charAt(i + 1);
                if (next >= '0' && next <= '9') result.append("\\&");
            }
        }
        return result.append('"').toString();
    };

    private static String showEscape(char code, boolean string) {
        switch (code) {
            case '\\': return "\\\\";
            case '"': return string ? "\\\"" : "\"";
            case 7: return "\\a";
            case '\b': return "\\b";
            case '\f': return "\\f";
            case '\n': return "\\n";
            case '\r': return "\\r";
            case '\t': return "\\t";
            case 11: return "\\v";
            default: return code < 0x20 || code == 0x7f ? "\\" + (int) code : String.valueOf(code);
        }
    }

    public static final Object showArrayImpl = (java.util.function.Function<Object, Object>) (show) -> (java.util.function.Function<Object, Object>) (value) -> {
        Object[] array = (Object[]) value;
        java.util.function.Function<Object, Object> showElement = (java.util.function.Function<Object, Object>) show;
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) result.append(',');
            result.append((String) showElement.apply(array[i]));
        }
        return result.append(']').toString();
    };


public static final Object showVoid = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Void.absurd; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showUnit = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return "unit"; }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showString = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Show.showStringImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showRecordFieldsNil = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return (java.util.function.Function<Object, Object>) (v1_1) -> { return ""; }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get();
public static final Object showRecordFields = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("showRecordFields"); };
public static final Object showRecord = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1) -> { return (java.util.function.Function<Object, Object>) (dictShowRecordFields_2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (record_3) -> { return (((String) ((((String) ("{")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShowRecordFields_2).get("showRecordFields"))).apply(Type_Proxy.__singleton$Proxy.value))).apply(record_3)))))) + ((String) ("}"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }; };
public static final Object showProxy = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return "Proxy"; }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showNumber = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Show.showNumberImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showInt = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Show.showIntImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showChar = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = Data_Show.showCharImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showBoolean = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0) -> { return ( ((Boolean) (v_0)) ? "true" : "false"); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object show = (java.util.function.Function<Object, Object>) (dict_0) -> { return ((java.util.Map<String, Object>) dict_0).get("show"); };
public static final Object showArray = (java.util.function.Function<Object, Object>) (dictShow_0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (Data_Show.showArrayImpl)).apply(((java.util.function.Function<Object, Object>) (Data_Show.show)).apply(dictShow_0)); return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); };
public static final Object showRecordFieldsCons = (java.util.function.Function<Object, Object>) (dictIsSymbol_0) -> { return (java.util.function.Function<Object, Object>) (dictShowRecordFields_1) -> { return (java.util.function.Function<Object, Object>) (dictShow_2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_3) -> { return (java.util.function.Function<Object, Object>) (record_4) -> { Object key_5 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0).get("reflectSymbol"))).apply(Type_Proxy.__singleton$Proxy.value); return (((String) ((((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_5))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_2).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Record_Unsafe.unsafeGet)).apply(key_5))).apply(record_4))))))) + ((String) (","))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShowRecordFields_1).get("showRecordFields"))).apply(Type_Proxy.__singleton$Proxy.value))).apply(record_4)))); }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get(); }; }; };
public static final Object showRecordFieldsConsNil = (java.util.function.Function<Object, Object>) (dictIsSymbol_0) -> { return (java.util.function.Function<Object, Object>) (dictShow_1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2) -> { return (java.util.function.Function<Object, Object>) (record_3) -> { Object key_4 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0).get("reflectSymbol"))).apply(Type_Proxy.__singleton$Proxy.value); return (((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_4))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_1).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Record_Unsafe.unsafeGet)).apply(key_4))).apply(record_3))))))) + ((String) (" "))); }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get(); }; };
}
