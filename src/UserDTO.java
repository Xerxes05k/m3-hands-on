
public record UserDTO(long id, String name, String email, boolean active) {

    public static UserDTO fromUser(User u) {
    return new UserDTO(u.getId(), u.getName(), u.getEmail(), u.isActive());
}

    // build a test User, call fromUser, and print the result as a main method
    public static void main(String[] args) {
        User testUser = new User(1L, "Alice", "alice@example.com", true);
        UserDTO dto = fromUser(testUser);
        System.out.println(dto);
    }
}