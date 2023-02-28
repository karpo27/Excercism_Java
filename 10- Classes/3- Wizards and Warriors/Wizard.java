class Wizard extends Fighter {

    private boolean spell;

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spell){
            return 12;
        } else {
            return 3;
        }
    }

    void prepareSpell() {
        spell = true;
    }
}
