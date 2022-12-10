public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; // счет клиента
        int replenishment = 1100; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int check = initialAccount + replenishment + bonus; // итого на счете клиента
        System.out.println("У клиента на счету:" + initialAccount + "рублей");
        System.out.println("Сумма пополнения:" + replenishment + "рублей");
        System.out.println("Итого на счете клиента:" + check + "рублей");
        System.out.println("Итого бонусов:" + bonus);
    }
}
