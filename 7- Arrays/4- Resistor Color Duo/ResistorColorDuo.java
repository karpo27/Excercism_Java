import java.util.LinkedHashMap;

class ResistorColorDuo {
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
    
    int value(String[] colors) {
        String result = "";
        for (int i = 0; i < colors.length; i++) {
            if (i > 1){
                break;
            } else {
                result += RESISTANCE_VALUE.get(colors[i]);
            }
        }

        return Integer.parseInt(result);
    }
}
