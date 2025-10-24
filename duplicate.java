import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Old method (crod)");
        System.out.println("2. Efficient single-pass method");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                crod(arr);
                System.out.println("Result using old method:");
                for (int num : arr) {
                    if (num != Integer.MIN_VALUE)
                        System.out.print(num + " ");
                }
                System.out.println();
                break;

            case 2:
                int[] result = findDuplicateAndMissing(arr);
                System.out.println("Result using efficient method:");
                System.out.println("Duplicate: " + result[0]);
                System.out.println("Missing: " + result[1]);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        in.close();
    }

    // Your original method
    static int[] crod(int[] ar) {
        int q = ar.length;
        Arrays.sort(ar);
        int duplicate = 0, missing = 0;
        int v = ar[0];

        for (int i = 0; i < q - 1; i++) {
            if (ar[i] == ar[i + 1])  // duplicate check
                duplicate = ar[i];

            if (v != ar[i])          // missing check
                missing = v;
            else
                v++;
        }

        // Final check for missing number (if it's at the end)
        if (v <= q) missing = v;

        ar[0] = duplicate;
        ar[1] = missing;
        for (int i = 2; i < q; i++)
            ar[i] = Integer.MIN_VALUE;

        return ar;
    }

    // Efficient single-pass method
    static int[] findDuplicateAndMissing(int[] arr) {
        int n = arr.length;
        int duplicate = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}
