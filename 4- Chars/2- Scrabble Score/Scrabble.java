class Scrabble {
    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        char[] set1 = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
        char[] set2 = {'D', 'G'};
        char[] set3 = {'B', 'C', 'M', 'P'};
        char[] set4 = {'F', 'H', 'V', 'W', 'Y'};
        char[] set5 = {'K'};
        char[] set6 = {'J', 'X'};
        char[] set7 = {'Q', 'Z'};


        String standardWord = this.word.toUpperCase();
        int score = 0;
        for (int i = 0; i < standardWord.length(); i += 1) {
            for (char letter : set1) {
                if (letter == standardWord.charAt(i)) {
                    score += 1;
                }
            }
            for (char letter2 : set2) {
                if (letter2 == standardWord.charAt(i)) {
                    score += 2;
                }
            }
            for (char letter3 : set3) {
                if (letter3 == standardWord.charAt(i)) {
                    score += 3;
                }
            }
          
            for (char letter4 : set4) {
                if (letter4 == standardWord.charAt(i)) {
                    score += 4;
                }
            }
            for (char letter5 : set5) {
                if (letter5 == standardWord.charAt(i)) {
                    score += 5;
                }
            }
            for (char letter6 : set6) {
                if (letter6 == standardWord.charAt(i)) {
                    score += 8;
                }
            }
            for (char letter7 : set7) {
                if (letter7 == standardWord.charAt(i)) {
                    score += 10;
                }
            }
        }
        return score;
    }

}
