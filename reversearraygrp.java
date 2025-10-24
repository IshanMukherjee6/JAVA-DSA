import java.util.*;
public class reversearraygrp {
public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,k,i,j,a;
        System.out.println("ENTER THE SIZE OF ARRAY");
        n=in.nextInt();
        int ar[]=new int[n];
        System.out.println("CAPACITY OF EACH GROUP");
        k=in.nextInt();
        System.out.println("ENTER THE ARRAY");
        for(i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        for( i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1); // Handles last smaller group
            while (start < end) {
                int temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
        }

        // Print final array
        System.out.println("ARRAY AFTER REVERSING EACH GROUP:");
        for (int val : ar) {
            System.out.print(val + " ");
        }
        System.out.println();

        in.close();
    }
        }
