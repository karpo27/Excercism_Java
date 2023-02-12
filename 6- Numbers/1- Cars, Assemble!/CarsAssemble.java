import java.util.HashMap;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsProduced = 221;
        HashMap<Integer, Double> successRate = new HashMap<Integer, Double>();

        successRate.put(0, 0.0);
        successRate.put(1, 1.0);
        successRate.put(2, 1.0);
        successRate.put(3, 1.0);
        successRate.put(4, 1.0);
        successRate.put(5, 0.9);
        successRate.put(6, 0.9);
        successRate.put(7, 0.9);
        successRate.put(8, 0.9);
        successRate.put(9, 0.8);
        successRate.put(10, 0.77);

        return speed * successRate.get(speed) * carsProduced;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed == 0){
            return 0;
        } else {
            return (int) productionRatePerHour(speed) / 60;
        }
    }
}
