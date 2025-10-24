import java.util.*;

public class missingrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS (sorted)");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("ENTER THE LOWER LIMIT");
        int l = in.nextInt();
        System.out.println("ENTER THE UPPER LIMIT");
        int u = in.nextInt();

        // Max possible missing ranges = n+1
        int[][] missingRanges = new int[n + 1][2];
        int rangeCount = 0;

        // Lower edge
        if (l < arr[0]) {
            missingRanges[rangeCount][0] = l;
            missingRanges[rangeCount][1] = arr[0] - 1;
            rangeCount++;
        }

        // Gaps between consecutive elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                missingRanges[rangeCount] = rangeprovider(arr[i], arr[i + 1]);
                rangeCount++;
            }
        }

        // Upper edge
        if (u > arr[n - 1]) {
            missingRanges[rangeCount][0] = arr[n - 1] + 1;
            missingRanges[rangeCount][1] = u;
            rangeCount++;
        }

        // Print all missing ranges
        System.out.println("Missing ranges:");
        for (int i = 0; i < rangeCount; i++) {
            System.out.print(Arrays.toString(missingRanges[i]));
        }

        in.close();
    }

    // Helper to generate range between two numbers
    static int[] rangeprovider(int a, int b) {
        int[] br = new int[2];
        br[0] = a + 1;
        br[1] = b - 1;
        return br;
    }
}
