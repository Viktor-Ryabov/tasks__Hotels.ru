import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static ArrayList printResult(int firstNumb, int secondNumb){
        ArrayList result = new ArrayList<>();
        for (int i = firstNumb; i <= secondNumb; i++) {
            result.add(i);
        }
        var startArr = result.clone();
        for (int i = 0; i < result.size(); i++) {
            for (int j = i+1; j < result.size(); j++) {
                if((int) result.get(j) % (int) result.get(i) == 0){
                    result.remove(j);
                }
            }
        }
        System.out.println("startArr: " + startArr.toString());
        System.out.println("prime numbers arr:" + result.toString());
        return result;
    }
}
