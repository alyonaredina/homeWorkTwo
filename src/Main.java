//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price = 50_482;     // стоимость билета
        int oneMile = 20;       // руб за 1 бонусную милю

        int bonus = price / oneMile;
        System.out.println("Начислено бонусных миль:" + bonus);

    }
}