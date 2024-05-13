import java.util.ArrayList;

public class task4 {
    public static void printResult(int number){
        System.out.println("Entered number: " + number);

//        System.out.print("" + "");
        for (int k = 0; k <= number; k++) {

            if(k == 0) {
                System.out.print(" " + "   ");
            } else {
                print(k);
            }
        }
        System.out.println("");

        for (int i = 1; i <= number; i++) {
            print(i);
            for (int j = 1; j <= number; j++) {
                int res = i * j;
                print(res);
            }
            System.out.println("");
        }
    }
    public static void print(int num){
        if(num > 9 || num < -9){
            System.out.print(num + "  ");
        } else if (num <= 9 || num >= - 9) {
            System.out.print(num + "   ");
        }
    }
}
