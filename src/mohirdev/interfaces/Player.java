package mohirdev.interfaces;

public abstract class Player implements Information{

    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String getTeamName() {
        return null;
    }
}
