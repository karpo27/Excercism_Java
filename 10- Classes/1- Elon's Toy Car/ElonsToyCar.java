public class ElonsToyCar {
    int distance = 0;
    int battery = 100;
    
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0){
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (distance <= 1980 || battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
