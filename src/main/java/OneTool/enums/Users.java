package OneTool.enums;


import lombok.*;

@Getter
@AllArgsConstructor
public enum Users {

    OneToolUser(new User("AutoTest", "****"));


    public String getUsername() {
        return user.getUsername();
    }

    public String getPassword() {
        return user.getPassword();
    }

    @Value
    @Builder(toBuilder = true)
    @Getter
    static public class User {
        String username;
        String password;
    }

    @NonNull
    private final User user;

}
