import java.util.Scanner;
public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = arr.length - 1 ;
        quick_Sort(arr, low, high);      
    }
    public static void quick_Sort(int[] arr, int low, int high)
    {
        while (low < high)
        {
            int pIndex = partition(arr, low, high);
            quick_Sort(arr, low, pIndex-1);
            quick_Sort(arr, pIndex+1, high);
        }
        System.out.println("Array after quick sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while ( i < j)
        {
            while (arr[i] <= pivot && i < high-1)
            {
                i++;
            }
            while (arr[j] > pivot && j > low +1)
            {
                j--;
            }
            if (i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;
        return j;
    }
}
