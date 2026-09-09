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

## Summary
- Added `id`, `name`, `email`, `active` fields to `UserDTO` via Copilot ghost text, plus a `fromUser(User)` mapper.
- Implemented `getOrderById` and `createOrder` in `OrderController` from TODO stubs using Copilot suggestions, reviewed against the existing `listOrders()` style before accepting.

## Testing
- Compiled and ran `UserDTO` standalone to confirm the mapper output.
- [add: did you re-run `make test` / the JUnit suite after the OrderController changes? If yes, note pass count; if not, do that before merging]

## Notes
- Copilot's first `fromUser` suggestion compiled but left an empty method body — fixed by hand rather than re-prompting, per the exercise's guidance.

## Part E — branch name suggestion
Prompt: Suggest a branch name for this issue: "customer wants to be able to close their account permanently". Format: prefix/short-kebab-slug. Prefix is one of: feat, fix, chore, docs, refactor.

Suggestion: feat/permanent-account-closure