import java.util.*;

public class FinancialForecasting{

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;   // Initial investment
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;

        double future = futureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + future);

        // Analysis
        System.out.println("\nTime Complexity: O(n)");
        System.out.println("Space Complexity: O(n) (due to recursive call stack)");

        System.out.println("\nOptimization:");
        System.out.println("1. Use Iteration to reduce space complexity to O(1).");
        System.out.println("2. Use Dynamic Programming (Memoization) if recursive calculations overlap.");
    }
}