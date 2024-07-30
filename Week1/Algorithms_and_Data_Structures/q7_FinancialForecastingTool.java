import java.util.HashMap;
import java.util.Map;

public class q7_FinancialForecastingTool {

    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, return the present value
        if (years == 0) {
            return presentValue;
        }

        // Check if we've already calculated this value
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        // Recursive case: calculate the future value
        double futureValue = calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);

        // Store the calculated value in our memoization map
        memo.put(years, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10;

        System.out.println("Initial Value: $" + initialValue);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Forecast Period: " + years + " years");

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted Future Value: $%.2f%n", futureValue);

        // Demonstrate the effect of memoization
        System.out.println("\nDemonstrating memoization effect:");
        long startTime = System.nanoTime();
        calculateFutureValue(initialValue, growthRate, 20);
        long endTime = System.nanoTime();
        System.out.println("Time taken for first calculation of 20 years: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        calculateFutureValue(initialValue, growthRate, 20);
        endTime = System.nanoTime();
        System.out.println("Time taken for second calculation of 20 years: " + (endTime - startTime) + " ns");
    }
}