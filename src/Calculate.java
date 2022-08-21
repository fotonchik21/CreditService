public class Calculate {


    public static int calculate(int sumCredit) {
        int creditTerm = 12;
        double interestRate = 9.99;
        double monthInterestRate = (interestRate / creditTerm) / 100;
        double authenticityFactor = (monthInterestRate * Math.pow((1 + monthInterestRate), creditTerm)) /
                ((Math.pow((1 + monthInterestRate), creditTerm)) - 1);
        return (int) (sumCredit * authenticityFactor);
    }
}

