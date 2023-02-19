class Darts {
    int score(double xOfDart, double yOfDart) {
        double number = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if (number > 100) {
            return 0;
        } else if (number <= 100 && number > 25) {
            return 1;
        } else if (number <= 25 && number > 1) {
            return 5;
        } else {
            return 10;
        }
    }
}
