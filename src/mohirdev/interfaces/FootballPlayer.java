package mohirdev.interfaces;

public class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }

    @Override
    public String getInfo() {
        String result = "Name Player: " + getNameOfPlayer();
        result = result + "\nGoals: " + countOfGoals + " Yellow Card: " + countOfYellowCard + " Red Card: " + countOfRedCard;
        return result;
    }
}
