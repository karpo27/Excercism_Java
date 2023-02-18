import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int modifier;

    public DnDCharacter(){
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    static int ability() {
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        ArrayList<Integer> diceRoll = new ArrayList<>();

        for (int i = 0; i < 4; i ++){
            Random random = new Random();
            int randomNumber = random.nextInt(range) + min;
            diceRoll.add(randomNumber);
        }

        Collections.sort(diceRoll);
        diceRoll.remove(0);

        int sum = 0;
        for (int diceValue : diceRoll){
            sum += diceValue;
        }
        return sum;
    }

    int modifier(int input) {
        modifier = (int) Math.floor((input - 10.0) / 2.0);

        return modifier;
    }

    int getStrength(){
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(this.constitution);
    }
}
