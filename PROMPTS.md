## Part A — UserDTO ghost text (before opening User.java)
public record UserDTO(
    String id,
    String name,
    String email
) {}

## Part A — after opening User.java
public record UserDTO( 
    long id, 
    String name, 
    String email, 
    boolean active) {}
