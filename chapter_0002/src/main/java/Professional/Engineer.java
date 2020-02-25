package Professional;

public class Engineer extends Profession {
    private String post;

    public Engineer(String name, String surname, String education, String post) {
        super(name, surname, education);
        this.post = post;
    }
    String getPost() {
        return post;
    }
}

