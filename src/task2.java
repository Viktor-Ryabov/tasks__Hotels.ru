import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task2 {
    public static ArrayList printResult(int[] arr){
        Arrays.sort(arr);
        ArrayList result = new ArrayList<>();
        int max = arr[arr.length - 1];
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i <= max; i++) {
            int j = 0;

            while(j < arr.length){
                if(arr[j] % i == 0){
                    if(j == arr.length - 1){
                        result.add(i);
                    }
                    j++;
                } else {
                    break;
                }
            }
        }

        System.out.println(result.toString());
        return result;
    }
}
