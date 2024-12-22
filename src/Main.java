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
        int[] weeklyExpenses = {5000, 35000, 5500, 1000, 2000, 3500, 20000};
        int maxAmount =weeklyExpenses[2];
        int minAmount=weeklyExpenses [1];
        for (final int element : weeklyExpenses) {
            if (element > maxAmount) {
                maxAmount = element;
            }
            if (element < minAmount) {
                minAmount = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей");

        System.out.println();
        System.out.println("Задание №3");
        int[] amountOfMoney1 = {20000, 30000, 15000, 25000, 1};
        int sum1 = 0;
        int numbersOfWeeks=amountOfMoney1.length;
        for (int element : amountOfMoney1) {
            sum1 += element;

        }
        System.out.println("Средняя сумма трат за месяц составила " + (double)sum1/numbersOfWeeks + " рублей");
    }
}