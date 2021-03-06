/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_jna;

public class App {
    static int rounds = (int)1e7; // run 1e4 times

    public static void run(Filter filter, int rounds) throws Exception {
        for (int i = 0; i < rounds; ++i) {
            String data = String.valueOf(i);
            filter.filter(data);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length >= 1) {
            rounds = Integer.parseInt(args[0]);
        }
        Filter filter = Filter.create("i64_gt");
        assert filter != null;
        filter.init("100"); // set filter to test greater than 100

        long startTime = System.currentTimeMillis();
        run(filter, rounds);
        long endTime = System.currentTimeMillis();

        System.out.println("jna iterations: " + rounds + " execution_time(ms): " + (endTime - startTime));
    }
}
