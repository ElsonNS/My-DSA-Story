import java.util.Scanner;

public class lowercaseCharacterHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s= input.next();

        //Hasharray
        int[] hashArray= new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            hashArray[s.charAt(i) - 'a']++;
        }

        int q = input.nextInt();
        while(q-- != 0)
        {
            char character = input.next().charAt(0);
            //fetching
            System.out.println(hashArray[character-'a']);
        }
        input.close();
    }
}
//ASCII VALUE CONCEPT
/*
 * we know that every character has an ASCII value 
 * so we 'f' - 'a' will be 102-97 their ascii values will be substracted 
 * so we will map them in an integer array.
 */