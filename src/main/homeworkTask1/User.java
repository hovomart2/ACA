package homeworkTask1;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public User(User other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.username = other.username;
        this.email = other.email;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public User clone() {
        return new User(this.getFirstName(), this.getLastName(), this.getUsername(), this.getEmail());
    }
}
