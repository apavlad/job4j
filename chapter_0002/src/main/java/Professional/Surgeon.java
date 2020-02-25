package Professional;

public class Surgeon extends Doctor {
    private String body;
    public Surgeon(String name, String surname, String education, String post, String body) {
        super("Misha", "Petrov", "high education", "men");
        this.body = body;
        body = "eye";
    }
}
