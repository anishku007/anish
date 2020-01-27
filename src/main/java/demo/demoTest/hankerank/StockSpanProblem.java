package demo.demoTest.hankerank;

public class StockSpanProblem {

    public static void calculateSpan(int price[], int n, int S[]) {
        S[0] = 1;
        for (int i = 0; i < n; i++) {
            S[i] = 1;
            for (int j = i - 1; (j >= 0) && (price[j] < price[i]); j--) {
                S[i]++;
            }
        }

    }

    public static void printSpan(int S[]) {
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]);
        }
    }

    public static void main(String[] arg) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int S[] = new int[n];
        calculateSpan(price, n, S);
        printSpan(S);
    }
}
