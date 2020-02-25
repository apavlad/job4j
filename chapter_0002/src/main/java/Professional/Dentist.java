package Professional;

public class Dentist extends Doctor {
    private String specialization;
    public Dentist(String name, String surname, String education, String post, String specialization) {
        super("Misha", "Petrov", "high education", "women");
        this.specialization = specialization;
        specialization = "therapist";
    }
}
