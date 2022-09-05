public class Main {
    public static void main(String[] args) {

        int check = 1000; // счет
        int replenishment = 120; // пополнение
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;


        }else {
            bonus = 0;
        }//

        int finalCheck = replenishment + check + bonus;
        System.out.println("Количество начисленных бонусов - " + bonus);
        System.out.println("Итоговая сумма счета - " + finalCheck);
        }

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

}