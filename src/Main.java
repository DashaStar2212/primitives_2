//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int topUpAmount = 1100;
        int bonus = 0;

        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
            System.out.printf("Итоговый счёт: %d\nКоличество бонусных рублей: %d", balance + topUpAmount + bonus, bonus);
        } else {
            System.out.printf("Итоговый счёт: %d\nКоличество бонусных рублей: %d", balance + topUpAmount + bonus, bonus);
        }
    }
}