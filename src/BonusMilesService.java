public class BonusMilesService {
    private static final int DIVIDER = 20;

    public int calculate(int cost){

        int resultMiles = cost / DIVIDER;

        return resultMiles;
    }
}
