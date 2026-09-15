import java.util.*;

public class findalldupasperarrayinsertionorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!hset1.add(arr[i])) {
                hset2.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (hset2.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                hset2.remove(arr[i]);
            }
        }
    }
}