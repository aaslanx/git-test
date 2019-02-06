public class Service {

    private static Service instance = new Service();

    public static Service getInstance() {
        return instance;
    }

    public boolean login() {
        System.out.println("Login Success");
        return true;
    }
}
