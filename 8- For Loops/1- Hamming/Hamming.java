public class Hamming {
  
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == 0 && rightStrand.length() > 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.length() == 0 && leftStrand.length() > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != 0 && rightStrand.length() != 0 && leftStrand.length() - rightStrand.length() != 0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int hammingDistance = 0;
        for (int i = 0; i < this.leftStrand.length(); i += 1) {
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                hammingDistance += 1;
            }
        }
        return hammingDistance;
    }
}
