class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
         while (car.distanceDriven() < this.distance) {
            if (car.batteryDrained()){
                return false;
            } else {
                car.drive();
            }
        }
        return true;
    }
}
