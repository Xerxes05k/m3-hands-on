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




## Part D — AI commit message (original)
Add initial project structure with .gitignore, Makefile, and basic classes

- Created .gitignore to exclude build artifacts and libraries
- Added Makefile for build, test, and dependency management
- Implemented OrderController with methods for order management
- Introduced User and UserDTO classes for user representation
- Added README with project instructions
- Included tests for OrderController functionality