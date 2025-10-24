import java.util.*;
public class stockmultiple {
    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE DURATION");
        n = in.nextInt();
        int prices[] = new int[n];
        System.out.println("ENTER THE PRICES");
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        int ss = maxxprofit(prices);
        System.out.println("TOTAL PROFIT = " + ss);
    }

    static int maxxprofit(int ar[]) {
        int n = ar.length;
        int totalProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            int j = i;

            // find local upward trend
            while (j < n - 1 && ar[j] < ar[j + 1]) {
                j++;
            }

            if (j > i) {  // means we found an increasing segment
                totalProfit += ar[j] - ar[i];
                i = j - 1;  // move i to last sell day
            }
        }

        return totalProfit;
    }
}
