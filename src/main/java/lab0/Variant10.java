package lab0;

public class Variant10 {

    public enum DAY_OF_WEEK{
        MONDAY, TUESDAY, WEDNESDAY
    }

    /**
     *
     * @param k is square side
     * @return perimeter
     */
    public int inputOutputTask(int k) {
        assert k > 0: "Parameter k should be more than 0";
        return 0;
    }

    /**
     *
     */

    public int integerNumbersTask(int k) {
        String digits = String.valueOf(k);
        String firstDigit = String.valueOf(digits.charAt(2));
        String secondDigit = String.valueOf(digits.charAt(1));
        String stringDigit = firstDigit + secondDigit;
        int integerNumber = Integer.parseInt(stringDigit);
        return integerNumber;
    }

    /**
     *
     * @param number
     * @return true, if number is possitive
     */
    public boolean booleanTask(int number) {
        return number > 0;
    }


    /**
     *
     * @param parameter is integer number
     * @return transformed number
     */
    public int ifTask(int parameter) {
        return 0;
    }


    /**
     *
     * @param number1
     * @return day of week day represented number1
     */
    public DAY_OF_WEEK switchTask(int number1) {
        return DAY_OF_WEEK.MONDAY;
    }


    /**
     *
     * @param n is integer number
     * @return approximated value of exp(1)
     */
    public double forTask(int n) {
        assert n >0: "Argument should be more than zero";
        return 0;
    }


    public int whileTask(int a, int b) {
        assert (a >0 && b > 0): "Argument should be more than zero";
        return 0;
    }

    public double arrayTask(double[] array) {
        return 0;
    }

    /**
     *
     * @param array
     * @param k1
     * @param k2
     * @return transformed array where row with indexes k1 and k2 was changed
     */
    public int[][]  twoDimensionArrayTask(int[][] array, int k1, int k2) {
        //return null;
        return array;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}