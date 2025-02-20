public class Role {
    private String roleId;
    private String roleName;  // e.g., Receptionist, Manager, Housekeeping


    public Role(String roldId, String roleName) {
        this.roleId = roldId;
        this.roleName = roleName;
    };

    // Getters

        // Role ID
    public String getRoleId() {
        return roleId;
    }

        // Role Name
    public String getRoleName() {
        return roleName;
    }

    // Method


}
