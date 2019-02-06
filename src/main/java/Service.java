public class Service {

    private static Service instance = new Service();

    public static Service getInstance() {
        return instance;
    }

    public void logout() {
        System.out.println("Logout Success");
    }
}
