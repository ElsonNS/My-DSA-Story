import java.util.Scanner;
public class bubbleSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        input.close();
        bubble_Sort(arr);
    }
    private static void bubble_Sort(int[] arr)
    {
        int n = arr.length;
        for (int i = n-1; i >= 0; i--)
        {
            int didSwap = 0;
            for (int j = 0; j <= i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;  
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
            {
                break;
            }
        }
        System.out.println("Array after bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}