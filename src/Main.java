public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work-9");
        System.out.println("Задание №1");
        int[] amountOfMoney = {20000, 30000, 15000, 25000, 60000};
        int sum = 0;
        for (int element : amountOfMoney) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }
}