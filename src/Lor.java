public class Lor extends Doctor{
    private String name;
    private String workplace;
    private int experience;

    public Lor(String name, int age, int experience, String name1, String workplace, int experience1) {
        super(name, age, experience);
        this.name = name1;
        this.workplace = workplace;
        this.experience = experience1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void information() {
        System.out.println("Name: " + name + " Workplace: " + workplace + " Experience: " + experience);
    }
}
