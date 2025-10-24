import java.util.*;
public class zeroorone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = in.nextInt();
        int ar[] = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int v = one(ar);
        System.out.println("Longest streak length = " + v);
        in.close();
    }

    static int one(int ar[]) {
        int c = 1, max = 1;  // streak counts at least 1
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                c++;
                if (c > max)
                    max = c;
            } else {
                c = 1;  // reset streak
            }
        }
        return max;
    }
}
