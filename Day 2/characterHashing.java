import java.util.Scanner;
public class characterHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= input.next();
        //precomputing
        int [] hashArray = new int[256];
        for (int i = 0; i < s.length(); i ++)
        {
            hashArray[s.charAt(i)]++;
        }

        int q = input.nextInt();
        while (q-- > 0)
        {
            char character = input.next().charAt(0);
            //fetching
            System.out.println(hashArray[character]);
        }
    input.close();
    }
    
}
