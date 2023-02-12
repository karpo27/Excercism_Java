class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length > 0){
            return birdsPerDay[birdsPerDay.length - 1];
        } else {
            return 0;
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount : birdsPerDay){
            if (birdCount == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        
        if (numberOfDays > 7){
            numberOfDays = 7;
        }
        
        for (int i = 0; i < numberOfDays; i += 1){
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdCount : birdsPerDay){
            if (birdCount >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
