import java.util.HashMap;

public class IDandPass {

    HashMap<String,String> login = new HashMap<String,String>();

    IDandPass(){

        login.put("Bro", "Pizza");
    }
//  protected so that all account info is secured
    protected HashMap getLogin(){
        return login;
    }
}
