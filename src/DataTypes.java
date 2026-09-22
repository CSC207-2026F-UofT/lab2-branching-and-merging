public class DataTypes {

    public static long sum(int[] numbers) {
        long s = 0;
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
