class RaindropConverter {

    static String convert(int number) {
        String result = "";
        int[] factors = {3, 5, 7};

        for (int i = 0; i < factors.length; i += 1){
            if (number % factors[i] == 0){
                if (i == 0) {
                    result += "Pling";
                } else if (i == 1) {
                    result += "Plang";
                } else {
                    result += "Plong";
                }
            }
        }
        if (result.isEmpty()){
            return String.valueOf(number);
        } else {
            return result;
        }
    }
}
