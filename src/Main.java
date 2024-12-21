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

        System.out.println();
        System.out.println("Задание №2");
        int[] weeklyExpenses = {5000, 15000, 5500, 4000, 7000, 3500, 20000};
        int maxAmount = -1;
        int minAmount = 0;
        for (final int element : weeklyExpenses) {
            if (element > maxAmount) {
                maxAmount = element;
            }
            if (element < maxAmount) {
                minAmount = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей");

        System.out.println();
        System.out.println("Задание №3");
        int[] amountOfMoney1 = {20000, 30000, 15000, 25000, 60000};
        int sum1 = 0;
        int numbersOfWeeks=5;
        for (int element : amountOfMoney1) {
            sum1 += element/numbersOfWeeks;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рублей");
    }
}