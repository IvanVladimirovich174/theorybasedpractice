package equalsandhashcode;

import java.util.Objects;

public class User {
    private String login;
    private String name;
    private String city;

    public User(String login, String name, String city) {
        this.login = login;
        this.name = name;
        this.city = city;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        User other = (User) obj;

        return (this.login.equals(other.login)) && (this.name.equals(other.name)) && (this.city.equals(other.city));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.login, this.name, this.city);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}