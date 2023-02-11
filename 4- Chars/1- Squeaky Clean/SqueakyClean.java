class SqueakyClean {
 
    static String clean(String identifier) {
        String output;
        output = identifier.replace(' ', '_'); //Task 1
        output = output.replaceAll("[\\x00-\\x1F\\x7F]", "CTRL"); //Task 2
        //Begin Task 3
        StringBuilder stringB = new StringBuilder(output);
        for (int i = 0; i < stringB.length(); i += 1) {
            if (stringB.charAt(i) == '-'){
                i = i + 1;
                char newChar = Character.toUpperCase(stringB.charAt(i));
                stringB.setCharAt(i, newChar);
                stringB.deleteCharAt(i - 1);
            }
        }
        return stringB.toString().replaceAll("[0-9]|[\\x{0001f300}-\\x{0001f64f}]|[\\u03B1-\\u03C9]", ""); //Task 4
    }
}
