import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("CHOOSE METHOD:");
        System.out.println("1. Using extra array (your method)");
        System.out.println("2. In-place efficient method");
        int choice = in.nextInt();

        switch (choice) {
            case 1: {
                int[] br = duplicateWithExtraArray(arr);
                System.out.println("DISTINCT ARRAY:");
                for (int x : br) {
                    if (x != 0) // skip unused 0s
                        System.out.print(x + " ");
                }
                System.out.println();
                break;
            }
            case 2: {
                int newLen = removeDuplicatesInPlace(arr, n);
                System.out.println("DISTINCT ARRAY:");
                for (int i = 0; i < newLen; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("\nLength = " + newLen);
                break;
            }
            default:
                System.out.println("Invalid choice!");
        }
        in.close();
    }

    // Your original method (extra array)
    static int[] duplicateWithExtraArray(int ar[]) {
        int c = 0;
        int q = ar.length;
        int br[] = new int[q];
        br[c] = ar[0];
        for (int i = 1; i < q; i++) {
            if (ar[i] != br[c]) {
                c++;
                br[c] = ar[i];
            }
        }
        return br;
    }

    // Efficient in-place method
    static int removeDuplicatesInPlace(int ar[], int n) {
        if (n == 0) 
        return 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (ar[i] != ar[j]) {
                j++;
                ar[j] = ar[i];
            }
        }
        return j + 1;
    }
}
 