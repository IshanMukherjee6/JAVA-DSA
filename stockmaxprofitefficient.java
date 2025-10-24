import java.util.*;
public class stockmaxprofitefficient {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.println("ENTER THE SIZE OF ARRAY");
        N = in.nextInt();
        int prices[] = new int[N];
        System.out.println("ENTER THE PRICES");
        for (int i = 0; i < N; i++) {
            prices[i] = in.nextInt();
        }
        int maxprofit = profit(prices);
        System.out.println(maxprofit);
    }

    static int profit(int ar[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : ar) {
            minPrice = Math.min(minPrice, price); // update min price so far
            maxProfit = Math.max(maxProfit, price - minPrice); // possible profit
        }

        return maxProfit;
    }
}
