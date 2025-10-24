import java.util.*;

public class leaderarray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("CHOOSE METHOD:");
        System.out.println("1. Brute Force (Your Code)");
        System.out.println("2. Efficient Method (Right to Left Traversal)");
        int choice = in.nextInt();

        int result[];
        switch (choice) {
            case 1:
                result = leaderBrute(arr);
                System.out.println("LEADERS (Brute Force):");
                for (int nn : result) {
                    if (nn != Integer.MIN_VALUE)  // skip unused slots
                        System.out.print(nn + " ");
                }
                break;

            case 2:
                result = leaderEfficient(arr);
                System.out.println("LEADERS (Efficient):");
                for (int nn : result) {
                    System.out.print(nn + " ");
                }
                break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }

    // ✅ Your original (Brute Force) method
    static int[] leaderBrute(int ar[]) {
        int n = ar.length;
        int leaders[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1, c = 0, r = 0;
            while (j < n) {
                r = n - j;
                if (ar[i] >= ar[j])
                    c++;
                j++;
            }
            if (c == r) {
                leaders[k++] = ar[i];
            }
            if (i == (n - 1)) {
                leaders[k++] = ar[i];
            }
        }

        // fill unused slots with MIN_VALUE so we can skip later
        for (int i = k; i < n; i++) {
            leaders[i] = Integer.MIN_VALUE;
        }
        return leaders;
    }

    // ✅ Efficient method (O(n))
    static int[] leaderEfficient(int ar[]) {
        int n = ar.length;
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = ar[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (ar[i] >= maxFromRight) {
                maxFromRight = ar[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders); // reverse to maintain order

        // convert list to array
        int res[] = new int[leaders.size()];
        for (int i = 0; i < leaders.size(); i++) {
            res[i] = leaders.get(i);
        }
        return res;
    }
}
