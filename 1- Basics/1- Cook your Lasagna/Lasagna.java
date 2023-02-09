public class Lasagna {
  
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        return numberOfLayers * 2 + minutesInOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3, 20);
    }

}
