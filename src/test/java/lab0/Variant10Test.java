package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant10;
import lab0.Variant10.DAY_OF_WEEK;

import java.lang.reflect.Array;

public class Variant10Test {

    public static double EPS = 0.0000001;

    @Test
    public void MassTest(){
        assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test(enabled = false)
    public void loginOld() {

//        assertEquals(new Variant10().booleanTask(3), false);

    }

    @Test(dataProvider = "inputProvider")
    public void inputTest(int p1, long p3) {
        assertEquals(new Variant10().inputOutputTask(p1), p3);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][] { { 2, 4l }, { 6, 36L } };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeInputTest() {
        new Variant10().inputOutputTask(-2);
    }

    ////////////////////////////////////////////////-

    @DataProvider
    public Object[][] intProvider() {
        return new Object[][]{
                {123, 32}
        };
    }

    @Test(dataProvider = "intProvider")
    public void integerTest(int a, int b) {
        int actual = new Variant10().integerNumbersTask(a);
        int expected = b;
        assertEquals(actual, expected);
    }

    ////////////////////////////////////////////////-

    @Test(dataProvider = "ifProvider")
    public void ifTest(int a, int b, int expected1, int expected2) {
        int[] expected;
        expected = new int[2];

        expected[0] = expected1;
        expected[1] = expected2;

        assertEquals(new Variant10().ifTask(a, b), expected);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 3, 2, 5, 5}, { 20, 20, 0, 0} };
    }

    //////////////////////////////////////////////////-

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int a, int b, boolean p3) {
        assertEquals(new Variant10().booleanTask(a, b), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] {
                { 4, 5, true }, { 7, 5, false }, { 101, 103, false }
        };
    }

    //////////////////////////////////////////////////-

    @Test(dataProvider = "caseProvider")
    public void caseTest(String a, int b, String expected) {
        assertEquals(new Variant10().caseTask(a, b), expected);
    }

    @DataProvider
    public Object[][] caseProvider() {
        return new Object[][] {
                { "N", 1, "West" }, { "E", -1, "South" }, { "S", 1, "East" }, { "W", 0, "West" }
        };
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int a, double expected) {
        assertEquals(new Variant10().forTask(a), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {
                { 2, 1.5 }, { 20, 3.597739657143682 }
        };
    }

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int c) {
        assertEquals(new Variant10().whileTask(a), c);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 100, 4 }, { 20, 3 } };
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int[] array, int value, int[] newArray) {
        assertEquals(new Variant10().arrayTask(array, value), newArray);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { new int[] { 10, 2, 3 }, 3, new int[] { 10, 2, 3 } }, { new int[] { 13, 2, 6 }, 3, new int[] { 2, 6, 13 } } };
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int from, int to, int[][] output) {
        assertEquals(new Variant10().twoDimensionArrayTask(input, from, to), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input23 = {{2, 3, 6, 9, -9},
                {-4, 2, 1, 6, 1},
                {34, 98, -9, 2, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input14 = {{-98, 8, 1, 5, 3},
                {-4, 2, 1, 6, 1},
                {34, 98, -9, 2, 1},
                {2, 3, 6, 9, -9}};

        return new Object[][] { {input, 2, 3, input23}, { input, 1,4, input14 } };

    }

}