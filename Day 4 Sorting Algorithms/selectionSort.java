import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the test array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the arrray");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr , n);
        sc.close();
    }    
    private static void selectionSort(int arr[], int n)
    {
        for (int i = 0; i < n -1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }
        System.out.println("After selection sort:" );
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+" ");
        }
        System.out.println();
    }
}

