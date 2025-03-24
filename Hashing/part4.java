import java.util.HashSet;

public class part4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 66, 44, 32};
        // int[] arr2 = {56, 44};
        int[] arr2 = {3, 4, 66, 44};

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }

        //checking weather, arr2 is subset of arr1
        for(int j : arr2){
            if(!set.contains(j)){
                //element is not present in arr1 so not a subset
                System.out.println("Arr2 is not a subset of arr1");
                return; 
            }
            
        }
        //all elements of arr2 are present in arr1
        System.out.println("Arr2 is a subset of arr1");

    }
}
