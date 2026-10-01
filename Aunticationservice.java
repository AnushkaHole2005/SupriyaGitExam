
    public class Aunticationservice {

        public boolean login(String username, String password) {

            if (username == null || username.trim().isEmpty() ||
                    password == null || password.trim().isEmpty()) {
                return false;
            }


            if ("admin_user".equals(username) && "SecurePass123!".equals(password)) {
                return true;
            }

            return false;
        }
    }

