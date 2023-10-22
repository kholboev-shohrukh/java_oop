package mohirdev.interfaces;

public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    @Override
    public String getInfo() {
        return "Guard: " + countOfGuard;
    }
}
