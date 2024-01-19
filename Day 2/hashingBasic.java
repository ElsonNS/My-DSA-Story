//Hashing --> prestoring and fetching frequencies of an array elements
import java.util.Scanner;
public class hashingBasic{
    public static void main(String[] args)
    {
        //Taking input of nums array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i= 0; i < n;i++)
        {
            nums[i] = input.nextInt();
        }

        // Creating a hash array of size 13 as we assumed that nums can have value 1 to 12only

        int[] hashArray = new int[13];
        //prcomputing frequency of each element in the hashArray
        for (int j = 0; j < n; j++)
        {
            hashArray[nums[j]] += 1;
        }

        //fetching frequenices 
        int q;
        q = input.nextInt();
        while (q-- != 0)
        {
            int number;
            number = input .nextInt();
            System.out.println(hashArray[number]);
        }
        input.close();

    }
}
