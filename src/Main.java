public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10000;
        int miles = service.calculate(price);

        System.out.printf("За билет стоимостью %s рублей начислено %d миль", price, miles);
    }
}
