import java.util.*;
public class rotationarraynew {

    // Utility function to reverse array elements from start to end
    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array to the left (counter-clockwise) by k steps
    void rotateCounterClockwise(int arr[], int k) {
        int n = arr.length;
        k = k % n;  // handle case when k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String Args[]) {
        rotationarraynew ob = new rotationarraynew();
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("ENTER HOW MANY TIMES YOU WANT TO ROTATE (Counter-Clockwise)");
        int k = in.nextInt();

        System.out.println("ENTER THE ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Rotate array counter-clockwise
        ob.rotateCounterClockwise(arr, k);

        // Print rotated array
        for (int val : arr) {
            System.out.print(val + " ");
        }

        in.close();
    }
}

