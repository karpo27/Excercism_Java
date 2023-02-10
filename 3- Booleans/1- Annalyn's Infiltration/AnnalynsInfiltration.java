import java.util.ArrayList;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        ArrayList<Boolean> state = new ArrayList<Boolean>();
        state.add(knightIsAwake);
        state.add(archerIsAwake);
        state.add(prisonerIsAwake);

        int counter = 0;
        for (boolean i : state){
            if (i){
                counter += 1;
            }
        }

        return counter >= 1;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent){
            return !archerIsAwake;
        } 
        else {
            return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
        }
    }
}
