import java.util.HashMap;

public class part3 {
    public static void main(String[] args) {
        int[] inputArray = {2, 14, 33, 25, 36};
        //Creating a hashMap so that we can store large numbers also and 
        //better space complexity

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i : inputArray)
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        
        //queries 
        
        int j = 0;
        while(j < inputArray.length){
            System.out.println("Output of query " + inputArray[j] + " "+ frequencyMap.get(inputArray[j]));
            j++;
        }
        
        
    }
}
