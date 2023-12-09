package JavaAPICollection.models;

import java.util.Comparator;

public class User implements Comparable<User> {
    private String name;
    private String lastname;
    private String username;

    public User() {
    }

    public User(String name, String lastname, String username) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User -> {" + '\n' +
                '\t' + "name='" + name + '\'' +
                '\t' + ", lastname='" + lastname + '\'' +
                '\t' + ", username='" + username + '\'' +
                '\t' + '}';
    }

    @Override
    public int compareTo(User a) {
        if(this.name == null) {
            return 0;
        }
        return this.getName().compareTo(a.name);
    }
}
