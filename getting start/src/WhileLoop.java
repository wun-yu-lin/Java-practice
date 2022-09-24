import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int intVal = 0;
        //while loop
        while (intVal<100){
            intVal++;
            System.out.println(intVal);
        }

        intVal = 0;
        //do while
        //一定會執行do, 再進入while的條件式檢查
        do{
            System.out.println("first");
            intVal++;
            System.out.println(intVal);
        }while(intVal<100);


        //do loop with scanner
        //scanner用來監控user輸入的文字
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.println("Exit system?");
            input = scanner.next();
        }while (!input.equals("y"));

        System.out.println("exit system!");

    }
}
