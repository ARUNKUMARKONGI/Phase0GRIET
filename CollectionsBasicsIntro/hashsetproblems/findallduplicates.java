import java.util.*;

public class findallduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!set.add(arr[i])) {
                duplicate.add(arr[i]);
            }
        }

        System.out.println(duplicate);
    }
}