import java.util.Scanner;
public class recursiveApproach {
    public static void main(String[] args) {
        //Taking String input
        Scanner read = new Scanner(System.in);
        String inpuString = read.next();
        read.close();
        int length = inpuString.length();
        int checkPointer = 0;
        boolean result = checkPallindrome(checkPointer,inpuString, length);
        System.out.println(result);
    }

    private static boolean checkPallindrome(int checkPointer, String inputString, int length) {
        
        if (checkPointer >= length/2)
        {
            return true;
        }
        if (inputString.charAt(checkPointer) != inputString.charAt(length - checkPointer-1 ))
        {
            return false;
        }
        return checkPallindrome(checkPointer+1, inputString, length);
    }
}