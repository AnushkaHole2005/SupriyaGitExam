public class username {
    public boolean login(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }

        if ("admin_user".equals(username)) {
            return true;
        }

        return false;
    }
}
