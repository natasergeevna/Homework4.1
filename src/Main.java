public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 2
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 3
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 4
        for (int i = 10; i >= - 10; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 5
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("\n");

        //task 6
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 7
        for (int i = 0; i <= 9; i++){
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println("\n");

        //task 8
        int money = 29000;
        for (int i = 1; i <= 12; i++){
            System.out.println("месяц " + i + " сумма накоплений равна " + money * i + " рублей");
        }
        System.out.println("\n");

        //task 9
        for (int i = 1; i <= 12; i++){
            money += money/100;
            System.out.println("месяц " + i + " сумма накоплений равна " + money * i + " рублей");
        }
    }
}