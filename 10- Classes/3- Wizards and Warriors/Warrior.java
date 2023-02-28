class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()){
            return 10;
        } else {
            return 6;
        }
    }
}
