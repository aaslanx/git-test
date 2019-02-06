public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello New World on Develop");

        Service.getInstance().login();

        // Login

        // ...

        // Logout
        Service.getInstance().logout();
    }
}
