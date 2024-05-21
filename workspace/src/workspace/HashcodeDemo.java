package workspace;
/**
 * The HashcodeDemo class is a wrapper for an integer value x.
 * This class implements user-defined hashCode and equals methods
 * based on the integer value of x.
 */
public class HashcodeDemo {
    /**
     * The integer value x.
     */
    private int x;
    /**
     * Constructs a HashcodeDemo object with the specified integer value x.
     *
     * @param x the integer value for the object.
     */
    public HashcodeDemo(int x) {
        this.x = x;
    }

    /**
     * Calculates and returns the hash code value for the HashcodeDemo object
     * based on the value of x.
     *
     * @return int the calculated hash code.
     */
    @Override
    public int hashCode() {
        // Simply returns the hash code based on the value of x.
        return x;
    }
    /**
     * This method ensures the proper equality comparison between two HashcodeDemo objects.
     * It checks whether the x values are equal in the compared objects or not.
     *
     * @param o Object the input object to be compared against the HashcodeDemo object.
     * @return boolean the comparison result.
     */
    @Override
    public boolean equals(Object o) {
        // Casts the input Object (o) to the HashcodeDemo type.
        HashcodeDemo other = (HashcodeDemo) o;

        // Checks whether the x values are equal in the compared objects.
        return x == other.x;
    }

    public static void main(String[] args) {
        // Creates two HashcodeDemo objects, d1 and d2,
        // with different and same integer values respectively.
        HashcodeDemo d1 = new HashcodeDemo(20);
        HashcodeDemo d2 = new HashcodeDemo(10);

        // Prints the hashcodes for both d1 and d2.
        int hc1 = d1.hashCode();
        int hc2 = d2.hashCode();

        System.out.println("First hashcode: " + hc1);
        System.out.println("Second hashcode: " + hc2);

        // Evaluates whether both d1 and d2 objects are equal.
        System.out.println("d1.equals(d2) = " + d1.equals(d2));
    }
}