class MicroBlog {
    public String truncate(String input) {
        String result = "";
        int numCodePoints = input.codePointCount(0, input.length());
        
        for (int i = 0; i < numCodePoints; i++) {
            int codePoint = input.codePointAt(input.offsetByCodePoints(0, i));
            String codePointStr = new String(Character.toChars(codePoint));
            result += codePointStr;
            if (i >= 4) {
                break;
            }
        }
        return result;
    }
}
