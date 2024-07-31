package ff;

public class FinancialForecasting {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        if (periods == 0) {
            return initialValue;
        }
        // ( Recursive call: Future Value = Present Value * (1 + growth rate) )
        return (1 + growthRate) * calculateFutureValue(initialValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0; // Initial investment or value
        double growthRate = 0.05;      // 5% annual growth rate
        int periods = 10;              // Forecast for 10 years

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future value after " + periods + " years: " + futureValue);
    }
}
