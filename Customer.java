package InfoTiket;

public class Customer {

    private String username;
    private String password;
    private boolean isLogin = false;
    private User user;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        user = new User();
    }

    public boolean login(String username, String password) {
        isLogin = this.username.equals(username) && this.password.equals(password);
        return isLogin;
    }

    private boolean cekLogin() {
        return isLogin;
    }

    public User getUser() {
        return user;
    }

    public void logout() {
        isLogin = false;
    }

}
