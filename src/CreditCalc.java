public class CreditCalc {
    private static final int COUNT_MONTH = 12;

    public static void main(String[] args) {

        double creditSum = 15_000;
        int yearPeriod = 4;
        double yearPercent = 10;
        creditCount(creditSum, yearPercent, yearPeriod);
    }
    public static void creditCount(double creditSum, double yearPercent, int yearPeriod) {
        double monthPayment = getMonthPayment(creditSum, yearPeriod);
        double percentSum = getPercentSum(yearPercent);
        int sumMonthPeriod = getSumMonthPeriod(yearPeriod);
        for (int month = 0; month <= sumMonthPeriod; month++) {
            System.out.println(" Month " + month + " = " + creditSum + " monthPayment = " + monthPayment + " percent " + percentSum * creditSum);
            creditSum = creditSum - monthPayment;
        }
    }
    public static double getMonthPayment(double creditSum, int yearPeriod) {
        double monthPayment = creditSum / (yearPeriod * COUNT_MONTH);
        return monthPayment;
    }

    public static double getPercentSum(double yearPercent) {
        double percentSum = yearPercent / COUNT_MONTH;
        return percentSum;
    }

    public static int getSumMonthPeriod(int yearPeriod) {
        int sumMonthPeriod = yearPeriod * COUNT_MONTH;
        return sumMonthPeriod;
    }
}


