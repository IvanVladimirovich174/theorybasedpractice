package firstexample;

public class Main {
    public static void main(String[] args) {
        Role[] allRoles = Role.values();

        System.out.println("All constants of Role enum:\n");
        for (Role role : allRoles) {
            System.out.println("Constant of Role enum: " + role + "\n" +
                    "String representation of constant: " + role.getRoleText());
        }
    }
}