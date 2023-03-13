public class Main {
    public static void main(String[] args) {
        int score = 100; // начальный счет
        int amount = 1100; // сумма пополнения
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int result = score + amount + bonus;

        System.out.println("Итоговый счет: " + result);
        System.out.println(" Бонусные рубли: " + bonus);
    }
}