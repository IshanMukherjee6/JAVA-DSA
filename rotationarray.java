import java.util.*;
public class rotationarray {
    
    // Rotate array by 1 position to the left
    int[] rotate(int ar[], int n) {
        int br[] = new int[n];
        br[n-1] = ar[0]; // move first element to last
        for(int i = 1; i < n; i++) {
            br[i-1] = ar[i]; // shift remaining elements
        }
        return br;
    }

    public static void main(String Args[]) {
        rotationarray ob = new rotationarray();
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int ar[] = new int[n];
        int br[] = new int[n];

        System.out.println("ENTER HOW MANY TIMES YOU WANT TO ROTATE");
        int v = in.nextInt();

        System.out.println("ENTER THE ARRAY");
        for(int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        // Rotate v times
        while(v > 0) {
            br = ob.rotate(ar, n);
            ar = br.clone(); // update ar for next rotation
            v--;
        }

        // Print rotated array
        for(int val : br) {
            System.out.print(val + " ");
        }

        in.close();
    }
}
