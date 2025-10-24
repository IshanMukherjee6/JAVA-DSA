import java.util.*;
public class subarraysum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, n;
        System.out.println("ENTER THE SIZE OF ARRAY");
        n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS IN THE ARRAY");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int totalSum = 0; // this will hold the sum of all subarrays

        // l = length of subarray
        for (int l = 1; l <= n; l++) {
            // r = starting index of subarray
            for (int r = 0; r <= n - l; r++) {
                int sub[] = subarray(arr, r, l); // create subarray
                int s = 0;
                for (int x = 0; x < sub.length; x++) {
                    s += sub[x];
                }
                totalSum += s;

                // show the subarray
                System.out.print("Subarray: ");
                for (int x = 0; x < sub.length; x++) {
                    System.out.print(sub[x] + " ");
                }
                System.out.println(" | Sum = " + s);
            }
        }

        System.out.println("\nTotal Sum of all subarrays = " + totalSum);
        in.close();
    }

    // your subarray creator idea, fixed
    static int[] subarray(int ar[], int start, int len) {
        int sub[] = new int[len];
        for (int i = 0; i < len; i++) {
            sub[i] = ar[start + i];
        }
        return sub;
    }
}
