package lab0;
import java.util.Scanner;

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
     * @return true, if number is possitive
     */
    public boolean booleanTask(int a, int b) {
        boolean res1 = ((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0));
        System.out.println(res1);
        return res1;
    }


    /**
     *
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
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        return arr;
    }


    /**
     *
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
        System.out.println("My Direction will be: " + result);
        return result;
    }


    /**
     *
     * @param n is integer number
     * @return approximated value of exp(1)
     */
    public double forTask(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1 / (double)i;
        System.out.print("Sum=" + sum);
        return sum;
    }


    public int whileTask(int n) {
        return functionForWhile(n);
    }
    public static int powerForWhile(int k) {
        int res = 3, count = 1;
        while(count < k) {
            count++;
            res *= res;
        }
        return res;
    }
    public static int functionForWhile(int n) {
        int k = 1;
        while (powerForWhile(k) <= n) {
            k++;
        }
        return k;
    }

    public static int[] arrayTask(int[] array, int n) {

        int counter = 0;
        int[] a = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = array[i];
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] % 2 == 0) {
                newArray[counter] = a[i];
                counter++;
            }
        }
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                newArray[counter] = a[i];
                counter++;
            }
        }
        System.out.print(newArray[0] + " ");
        System.out.print(newArray[1] + " ");
        System.out.print(newArray[2] + " ");
        return newArray;
    }


    /**
     *
     * @param array - matrix of integers
     * @return matrix of rows with even indices
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

    public static void kek() {
        System.out.println("fuck you!!!");
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
        System.out.println(arrayTask(new int[] { 13, 2, 6 }, 3));
    }

}