public class part1{
    public static void main(String[] args) {
        int[] inputArray = {1,2,4,5,3,2, 9, 7,2, 3 };
        //find frequency of numbers in array
        int[] hashArray = new int[10];
        //precomputing all the frequency
        for(int i : inputArray)
            hashArray[i]++;

        //queries 
        int[] queries = {1, 3, 2};
        int j = 0;
        while(j < queries.length){
            System.out.println("Output of query " + queries[j] + " "+ hashArray[queries[j]]);
            j++;
        }
    }
}