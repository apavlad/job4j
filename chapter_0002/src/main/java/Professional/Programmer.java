package Professional;

public class Programmer extends Engineer {
    private String language;
    public Programmer(String name, String surname, String education, String post, String language) {
        super("Slava", "Sidorov", "high education", "specialist");
        this.language = language;
        language = "java";
    }
}
