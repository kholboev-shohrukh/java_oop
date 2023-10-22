package mohirdev.interfaces;

public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    @Override
    public String getInfo() {
        return "Sets: " + countOfSets;
    }
}
