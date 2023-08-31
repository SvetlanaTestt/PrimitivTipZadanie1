public class Main {
    public static void main(String[] args) {

        int price = 12700;
        int accrual = 20;
        int bonus = 1;

        int miles = price / accrual * bonus;
        System.out.println("Количество начисленных миль за купленный билет:" + miles);

    }
}
