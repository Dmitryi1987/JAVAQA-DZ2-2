public class Main {
    public static void main(String[] args) {
        int score = 132; // начальный счет
        int amount = 1080; // сумма пополнения

        int bonus = amount / 100; // бонусные рубли
        if (amount > 1000) ;

        int result = score + amount + bonus;

        System.out.println("Итоговый счет: " + result);
        System.out.println(" Бонусные рубли: " + bonus);
    }
}