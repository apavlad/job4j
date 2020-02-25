package Professional;

public class Doctor extends Profession {
    private String sex;

    public Doctor(String name, String surname, String education, String sex) {
        super(name, surname, education);
        this.sex = sex;
    }
    String getSex() {
        return sex;
    }
}
