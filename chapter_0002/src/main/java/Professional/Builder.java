package Professional;

public class Builder extends Engineer {
    private String materials;

    public Builder(String name, String surname, String education, String post, String materials) {
        super("Ivan", "Ivanov", "high education", "foreman");
        this.materials = materials;
        materials = "wood";
    }
}
