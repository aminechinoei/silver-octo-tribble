import java.util.ArrayList;

public class Profile {

    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double length;

    public Profile(String firstName, String lastName, int age, double weight, double length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculatorBmi(){
        return 10000 * (getWeight() / getLength() / getLength());
    }

    Profile() {
        ArrayList<Profile> patients = new ArrayList<Profile>();
        patients.add(new Profile("Amine", "Scheunhage", 28, 100, 180));
        patients.add(new Profile("Oumaima", "Scheunhage", 27, 60, 154));
        patients.add(new Profile("Jaouad", "Schreefel", 13, 80, 165));
        patients.add(new Profile("Yvette", "Schreefel", 58, 70, 160));
        patients.add(new Profile("Peter", "Scheunhage", 59, 100, 193));
        patients.add(new Profile("Karima", "Talbi", 57, 70, 165));
    }


}
