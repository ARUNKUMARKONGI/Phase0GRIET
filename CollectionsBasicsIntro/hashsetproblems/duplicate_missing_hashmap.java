import java.util.*;
public class duplicate_missing_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int dup = -1, missing = -1;
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i)) missing = i;
            if(map.getOrDefault(i,0) == 2) dup = i;
        }

        System.out.println("Duplicate: " + dup + ", Missing: " + missing);
    }
}

//sample test case
//input: 5 1 2 3 3 5
//output: Duplicate: 3, Missing: 4