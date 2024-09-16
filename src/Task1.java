public class Task1 {
    private double n;
    private double m;

    public Task1(double n, double m) {
        this.n = n;
        this.m = m;
    }

    public double calculateResult1() {
        return ((((n + 1) / (m + 2)) + (5 / (n - m))) * (((n + 1) / (m + 2)) + (5 / (n - m)))) * n * m;
    }

    public double calculateResult2() {
        int nInt = (int) n;
        int mInt = (int) m;

        double part1 = (double) (nInt + 1) / (mInt + 2);
        double part2 = 5.0 / (nInt - mInt);
        return ((part1 + part2) * (part1 + part2)) * nInt * mInt;
    }

    public int calculateResult3() {
        return (int) ((((n + 1) / (m + 2)) + (5 / (n - m))) * (((n + 1) / (m + 2)) + (5 / (n - m))) * n * m);
    }
}
