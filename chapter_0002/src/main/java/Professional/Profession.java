package Professional;

public class Profession {
    private String name;
    private String surname;
    private String education;
    public Profession(String name, String surname, String education) {
        this.name = name;
        this.surname = surname;
        this.education = education;
    }
   String getName() {
       return name;
   }
    String getSurname() {
        return surname;
    }
    String getEducation() {
        return education;
    }
}
