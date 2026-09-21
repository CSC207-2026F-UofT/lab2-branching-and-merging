public class DataTypes {
    //  TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(int[] numbers) {
        int s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        int len = numbers.length;
        for (int number : numbers) {
            s += number;
        }
        return s;
    }
}
