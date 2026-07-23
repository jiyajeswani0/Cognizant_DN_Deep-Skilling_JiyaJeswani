package forecast;

/**
 * Financial Forecasting utility class.
 * Demonstrates recursive prediction of future values based on growth rate,
 * as well as iterative and formulaic alternative approaches.
 * 
 * Time & Space Complexity Analysis:
 * -----------------------------------
 * 1. Recursive Approach (futureValue):
 *    - Time Complexity: O(N) where N is the number of time periods.
 *      Each call makes 1 recursive step until periods reduces to 0.
 *    - Auxiliary Space Complexity: O(N) due to call stack frames.
 *    - Potential Issue: Risk of StackOverflowError when N is very large
 *      (e.g., thousands of recursive calls) because Java allocates a fixed stack size per thread.
 * 
 * 2. Iterative Approach (futureValueIterative):
 *    - Time Complexity: O(N) for N periods loop.
 *    - Auxiliary Space Complexity: O(1) constant extra space.
 *    - Optimization: Eliminates call stack overhead and prevents StackOverflowError.
 * 
 * 3. Direct Mathematical Formula (futureValueFormula):
 *    - Formula: FV = PV * (1 + r)^n
 *    - Time Complexity: O(1) or O(log N) depending on Math.pow implementation.
 *    - Auxiliary Space Complexity: O(1).
 *    - Optimization: Most efficient approach for practical financial applications.
 */
public class FinancialForecast {

    /**
     * Recursively predicts future value based on present value, growth rate, and time periods.
     * 
     * Base Case:
     *   When periods == 0, no more growth occurs, returns currentValue.
     * 
     * Recursive Step:
     *   Calculates future value for 1 period of growth: currentValue * (1 + growthRate),
     *   and recursively invokes futureValue with remaining periods (periods - 1).
     *
     * @param currentValue The initial or current asset/financial value
     * @param growthRate   The annual or periodic growth rate as a decimal (e.g., 0.05 for 5%)
     * @param periods      The number of time periods (e.g., years)
     * @return The projected future value after specified periods
     */
    public static double futureValue(double currentValue, double growthRate, int periods) {
        // Base Case
        if (periods <= 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    /**
     * Iterative alternative to predict future value without recursive call stack overhead.
     * Time Complexity: O(N), Space Complexity: O(1).
     *
     * @param currentValue The initial financial value
     * @param growthRate   The periodic growth rate (decimal)
     * @param periods      The number of periods
     * @return The projected future value
     */
    public static double futureValueIterative(double currentValue, double growthRate, int periods) {
        double result = currentValue;
        for (int i = 0; i < periods; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    /**
     * Direct calculation using compound growth formula: FV = PV * (1 + r)^n.
     * Time Complexity: O(1), Space Complexity: O(1).
     *
     * @param currentValue The initial financial value
     * @param growthRate   The periodic growth rate (decimal)
     * @param periods      The number of periods
     * @return The projected future value
     */
    public static double futureValueFormula(double currentValue, double growthRate, int periods) {
        return currentValue * Math.pow(1 + growthRate, periods);
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     Financial Forecasting Demonstration");
        System.out.println("==================================================\n");

        double initialInvestment = 10000.00; // $10,000 initial value
        double annualGrowthRate = 0.07;       // 7% annual growth rate
        int[] samplePeriods = { 1, 5, 10, 20, 30 };

        System.out.printf("Initial Present Value (PV): $%.2f%n", initialInvestment);
        System.out.printf("Annual Growth Rate (r):    %.2f%%%n%n", annualGrowthRate * 100);

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-20s | %-20s%n",
                "Periods(Yr)", "Recursive Method", "Iterative Method", "Formula Method");
        System.out.println("----------------------------------------------------------------------");

        for (int period : samplePeriods) {
            double recursiveVal = futureValue(initialInvestment, annualGrowthRate, period);
            double iterativeVal = futureValueIterative(initialInvestment, annualGrowthRate, period);
            double formulaVal = futureValueFormula(initialInvestment, annualGrowthRate, period);

            System.out.printf("%-10d | $%-19.2f | $%-19.2f | $%-19.2f%n",
                    period, recursiveVal, iterativeVal, formulaVal);
        }

        System.out.println("----------------------------------------------------------------------");

        // Stack Overflow Risk Demonstration Discussion
        System.out.println("\n[Note on Recursive Limits and Stack Overflow]");
        System.out.println("Recursive implementation uses call stack frames proportional to period count N.");
        System.out.println("For small values of N (e.g. N <= 1000), recursive calculation works fine.");
        System.out.println("For very large N (e.g. N = 100,000 daily periods), recursion will cause StackOverflowError.");
        System.out.println("In production financial software, iterative or closed-form formula methods are preferred.");
        
        System.out.println("\n==================================================");
        System.out.println("  Financial Forecasting Completed Successfully");
        System.out.println("==================================================");
    }
}
