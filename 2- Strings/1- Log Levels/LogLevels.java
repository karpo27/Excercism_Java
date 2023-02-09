public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        String logLineTrans = "";
        
        for (int i = index + 1; i < logLine.length(); i++){
            char c = logLine.charAt(i);
            logLineTrans += c;
        }
        
        return logLineTrans.trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf("[");
        String logLineTrans = "";

        for (int i = index + 1; i < logLine.length(); i++){
            char c = logLine.charAt(i);
            if (c == ']') {
                break;
            } else {
                logLineTrans += c;
            }
        }
        
        return logLineTrans.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
