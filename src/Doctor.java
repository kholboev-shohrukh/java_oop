public class Doctor {

    private String name;
    private int age;
    private int experience;

    public Doctor() {
    }

    public Doctor(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void information(){
        System.out.println("Name: " + name + "Age: " + age + "Experience: " + experience);
    }
}
