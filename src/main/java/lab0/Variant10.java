package lab0;

public class Variant10 {
    /**
     *
     * @param k given 3 digits value
     * @return transformed value
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
     * @param a integral number
     * @param b integral number
     * @return boolean result
     */
    public boolean booleanTask(int a, int b) {
        return ((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0));
    }


    /**
     *
     * @param a
     * @param b
     * @return arr with new values
     */
    public int[] ifTask(int a, int b) {
        int[] arr;
        arr = new int[2];
        int sum = a+b;

        if (a != b) {
            a = sum;
            b = sum;
        }
        else {
            a = 0;
            b = 0;
        }

        arr[0] = a;
        arr[1] = b;
        return arr;
    }


    /**
     *
     * @param direct first direction of the robot
     * @param n digital command
     * @return result of the robot direction
     */
    public String caseTask(String direct, int n) {
        String result = "";
        switch (direct) {
            case "N":
                switch (n) {
                    case 1 -> result = "West";
                    case 0 -> result = "North";
                    case -1 -> result = "East";
                }
                break;
            case "E":
                switch (n) {
                    case 1 -> result = "North";
                    case 0 -> result = "East";
                    case -1 -> result = "South";
                }
                break;
            case "S":
                switch (n) {
                    case 1 -> result = "East";
                    case 0 -> result = "South";
                    case -1 -> result = "West";
                }
                break;
            case "W":
                switch (n) {
                    case 1 -> result = "South";
                    case 0 -> result = "West";
                    case -1 -> result = "North";
                }
                break;
        }

        return result;
    }


    /**
     *
     * @param n given value
     * @return sum result
     */
    public double forTask(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1 / (double)i;

        return sum;
    }


    /**
     *
     * @param n given value
     * @return the biggest K
     */
    public int whileTask(int n) {
        return functionForWhile(n);
    }
    private static int powerForWhile(int k) {
        int res = 3, count = 1;
        while(count < k) {
            count++;
            res *= res;
        }
        return res;
    }
    private static int functionForWhile(int n) {
        int k = 1;
        while (powerForWhile(k) <= n) {
            k++;
        }
        return k;
    }


    /**
     *
     * @param array given array
     * @param n given value of size of the array
     * @return transformed array
     */
    public static int[] arrayTask(int[] array) {

        int n = array.length;
        int[] temporary = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            temporary[i] = array[i];
        }

        int counter = 0;
        for (int i = 0; i <= temporary.length-1; i++) {
            if (temporary[i] % 2 == 0) {
                newArray[counter] = temporary[i];
                counter++;
            }
        }
        for (int i = temporary.length-1; i >= 0; i--) {
            if (temporary[i] % 2 != 0) {
                newArray[counter] = temporary[i];
                counter++;
            }
        }

        return newArray;
    }


    /**
     *
     * @param array - matrix of int's
     * @return matrix of rows with odd's
     */
    public int[][] twoDimensionArrayTask(int[][] array) {
        int[][] newArray = new int[array.length / 2][array[0].length];
        int row = 0;

        for(int i = 0; i < array.length; i+= 2){
            for (int j = 0; j < array[i].length; j++) {
                newArray[row][j] = array[i][j];
            }

            row++;
        }
        return newArray;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}