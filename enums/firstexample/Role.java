package firstexample;

public enum Role {
    USER ("User"),
    ADMIN ("Admin"),
    COURIER ("Courier"),
    COOK ("Cook"),
    CASHIER ("Cashier");

    private final String roleText;

    Role(String roleText) {
        this.roleText = roleText;
    }

    public String getRoleText() {
        return roleText;
    }
}