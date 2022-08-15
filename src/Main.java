public class Main {

    public static void main(String[] args) {

        IDandPass IDnPass = new IDandPass();

        Login login = new Login(IDnPass.getLogin());
    }
}