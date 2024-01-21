import java.util.HashMap;

import java.util.Scanner;
public class mapHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }

        //precompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i ++)
        {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) 
            freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); //Inserting into the map
        }

        //Iterate over the map
        /*
           for (Map.Entry<Integr, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
           }
         */

        int q;
        q = sc.nextInt();
        while (q-- > 0)
        {
            int number; 
            number = sc.nextInt();
            //fetch
            if (mp.containsKey(number))
            System.out.println(mp.get(number));
            else
            System.out.println(0);
        }
        sc.close();
    }
}
//It is more space otmized approach and there is no problem with any value of arrays
