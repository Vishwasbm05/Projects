package in.shopping;

import java.util.ArrayList;
import java.util.List;

class LoginController {
    List<User> users = new ArrayList<>();

    LoginController() {
        users.add(new User("vishwas", "123456", "admin"));
        users.add(new User("muthu", "pass1", "user"));
        users.add(new User("rakesh", "pass2", "user"));
    }

    User login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }
}
