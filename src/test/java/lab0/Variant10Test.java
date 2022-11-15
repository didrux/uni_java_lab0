package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Variant10Test {

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
    public void arrayTest(int[] array, int[] newArray) {
        assertEquals(new Variant10().arrayTask(array), newArray);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { new int[] { 10, 2, 3 }, new int[] { 10, 2, 3 } }, { new int[] { 13, 2, 6 }, new int[] { 2, 6, 13 } }, { new int[] { 1, 3, 4, 2 }, new int[] { 4, 2, 3, 1 } } };
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int[][] res) {
        assertEquals(new Variant10().twoDimensionArrayTask(input), res);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{4, 6, 12, 18, -18},
                {68, 196, -18, 4, 2},
                {-8, 4, 2, 12, 2},
                {-196, 16, 2, 10, 6}};

        int[][] input2 = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 19},
                {20, 22, 24}};

        return new Object[][] {{input, new int[][]{ {4, 6, 12, 18, -18}, {-8, 4, 2, 12, 2}}}, {input2, new int[][]{{2, 4, 6}, {14, 16, 19}}}};
    }

}