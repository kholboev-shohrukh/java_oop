package mohirdev.interfaces;

public class BasketballPlayer extends Player{

    private int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public String getInfo() {
        return "Goals: " + numberOfGoals;
    }
}
