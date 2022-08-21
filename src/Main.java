public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(1000_000,12));
        System.out.println(calculate(1000_000, 24));
        System.out.println(calculate(1000_000, 36));
    }
    public static int calculate(int sumCredit, int creditTerm) {
        double interestRate = 9.99;
        double monthInterestRate = (interestRate / 12) / 100;
        double authenticityFactor = (monthInterestRate * Math.pow((1 + monthInterestRate), creditTerm)) /
                ((Math.pow((1 + monthInterestRate), creditTerm)) - 1);
        return (int) (sumCredit * authenticityFactor);
    }

}
