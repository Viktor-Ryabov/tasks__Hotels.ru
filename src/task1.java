import java.lang.reflect.Array;

public class task1 {
    public static String printResult(Integer number){
        String result = number.toString();

        if (number >= 5 && number <= 19){
            result = (result + " компьютеров");
        } else if (result.endsWith("1")) {
            result = (result + " компьютер");
        } else if (result.endsWith("2") || result.endsWith("3") || result.endsWith("4")) {
            result = (result + " компьютера");
        } else if (result.endsWith("5") || result.endsWith("6") || result.endsWith("7") || result.endsWith("8") || result.endsWith("9") || result.endsWith("0")) {
            result = (result + " компьютеров");
        }
        System.out.println(result);
        return result;
    }
}
