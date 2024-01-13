import java.util.Scanner;
public class recursiveApproach {
    public static void main(String[] args) {
        //Taking String input
        Scanner read = new Scanner(System.in);
        String inpuString = read.next();
        read.close();
        //fetching the length of the string
        int length = inpuString.length();
        int checkPointer = 0;
        boolean result = checkPallindrome(checkPointer,inpuString, length);
        System.out.println(result);
    }

    private static boolean checkPallindrome(int checkPointer, String inputString, int length) {
        //checking weather we reach till half of the string or not
        //base condition for recursion
        if (checkPointer >= length/2)
        {
            return true;
        }
        //checking characters from the starting and the end of the string
        if (inputString.charAt(checkPointer) != inputString.charAt(length - checkPointer-1 ))
        {
            return false;
        }
        //again calling same function => recursion
        return checkPallindrome(checkPointer+1, inputString, length);
    }
}
//Time Complexity
//O(n) we are actually checking till half of the string length.

