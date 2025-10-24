import java.util.*;
public class signrearrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int ar[] = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        System.out.println("CHOOSE METHOD:");
        System.out.println("1 - Original Method");
        System.out.println("2 - Efficient Method");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                originalMethod(ar);
                break;
            case 2:
                efficientMethod(ar);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nREARRANGED ARRAY:");
        for (int x : ar) System.out.print(x + " ");
    }

    // Original method with br[0]/cr[0] count trick
    static void originalMethod(int ar[]) {
        int br[] = even(ar);
        int cr[] = odd(ar);
        int k = 1, v = 1;
        int pCount = br[0], nCount = cr[0];

        int i = 0;
        while (k <= pCount && v <= nCount) {
            ar[i++] = br[k++];
            ar[i++] = cr[v++];
        }
        while (k <= pCount) ar[i++] = br[k++];
        while (v <= nCount) ar[i++] = cr[v++];
    }

    static int[] even(int ar[]) {
        int n = ar.length;
        int br[] = new int[n+1];
        int c = 1;
        for (int x : ar) if (x >= 0) br[c++] = x; // include 0
        br[0] = c-1;
        return br;
    }

    static int[] odd(int ar[]) {
        int n = ar.length;
        int br[] = new int[n+1];
        int c = 1;
        for (int x : ar) if (x < 0) br[c++] = x;
        br[0] = c-1;
        return br;
    }

    // Efficient method without count at index 0
    static void efficientMethod(int ar[]) {
        int posCount = 0, negCount = 0;
        for (int x : ar) {
            if (x >= 0) posCount++;
            else negCount++;
        }

        int[] pos = new int[posCount];
        int[] neg = new int[negCount];
        int pi = 0, ni = 0;
        for (int x : ar) {
            if (x >= 0) pos[pi++] = x;
            else neg[ni++] = x;
        }

        int i = 0; pi = 0; ni = 0;
        while (pi < posCount && ni < negCount) {
            ar[i++] = pos[pi++];
            ar[i++] = neg[ni++];
        }
        while (pi < posCount) ar[i++] = pos[pi++];
        while (ni < negCount) ar[i++] = neg[ni++];
    }
}
