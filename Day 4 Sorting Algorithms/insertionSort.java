import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();     
        }
        sc.close();
        insertion_Sort(arr);
    }
    public static void insertion_Sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("Array after sorting is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
