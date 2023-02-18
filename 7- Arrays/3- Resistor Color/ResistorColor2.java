import java.util.LinkedHashMap;

class ResistorColor2 {
    public static LinkedHashMap<String, Integer> RESISTANCE_VALUE = new LinkedHashMap<>() {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};

    static int colorCode(String color) {
        return RESISTANCE_VALUE.get(color);
    }

    static String[] colors() {
        return RESISTANCE_VALUE.keySet().toArray(new String[RESISTANCE_VALUE.size()]);
    }
}
