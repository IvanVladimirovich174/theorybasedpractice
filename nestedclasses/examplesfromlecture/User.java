package nestedclasses.examplesfromlecture;

public class User {
    private String id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String phone;
    private String role;
    private int age;

    public static Builder builder() {
        return new Builder();
    }

    // Static class
    public static class Builder {
        private User user = new User();

        public Builder setId(String id) {
            user.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public Builder setSecondName(String secondName) {
            user.secondName = secondName;
            return this;
        }

        public Builder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public Builder setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public Builder setRole(String role) {
            user.role = role;
            return this;
        }

        public Builder setAge(int age) {
            user.age = age;
            return this;
        }

        public User build() {
            if (user.firstName == null || user.lastName == null) {
                throw new IllegalArgumentException("First name or last name are required");
            }
            return user;
        }

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
