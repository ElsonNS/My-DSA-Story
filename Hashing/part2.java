import java.util.HashSet;

public class part2 {
    public static void main(String[] args) {
        int[] inputArray = {2, 14, 33, 25, 36};
        //Creating a hashSet so that we can store large numbers also and 
        //better space complexity

        HashSet<Integer> frequencySet = new HashSet<>();
        for(int i : inputArray)
            frequencySet.add(i);
        
        //queries to check weather the element is present in the array or not 
        int[] queries = {14, 15, 25, 36, 44};
        int j = 0;
        while(j < queries.length){
            if(frequencySet.contains(queries[j]))
                System.out.println("Element "+ queries[j] + " is present");
            else
            System.out.println("Element "+ queries[j] + " not present");
            j++;
        }
    }
}
