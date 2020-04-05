import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Map<Integer, Integer> qtyMap = new HashMap();
        list.forEach(val-> {
             qtyMap.putIfAbsent(val, Collections.frequency(list, val));
        });
         
        List<Integer> valueList = qtyMap.values()
                                        .stream()
                                        .collect(Collectors.toList());
        return valueList.stream()
                        .filter(val -> val > 1)
                        .map(val -> val / 2)
                        .reduce(0, Integer::sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
