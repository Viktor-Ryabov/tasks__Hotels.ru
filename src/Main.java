//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task #1
        System.out.println("task #1:");
        int i = 0;
        while(i <= 100){
            task1.printResult(i);
            i++;
        }
        System.out.println("------------------------");

        System.out.println("task #2:");
        //task #2
        task2.printResult(new int[]{42, 12, 18, 24});

        System.out.println("------------------------");

        System.out.println("task #3:");
        //task #3
        task3.printResult(2, 41);

        System.out.println("------------------------");

        System.out.println("task #4:");
        //task #4
        task4.printResult(10);

    }
}