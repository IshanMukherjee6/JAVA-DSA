import java.util.*;
public class zeroatend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int ar[] = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        moveZeros(ar);

        System.out.println("NEW ARRAY");
        for (int vv : ar) {
            System.out.print(vv + " ");
        }
        in.close();
    }

    static void moveZeros(int ar[]) {
        int n = ar.length;
        int pos = 0; // position for non-zero

        // move all non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                ar[pos++] = ar[i];
            }
        }

        // fill rest with zeros
        while (pos < n) {
            ar[pos++] = 0;
        }
    }
}
