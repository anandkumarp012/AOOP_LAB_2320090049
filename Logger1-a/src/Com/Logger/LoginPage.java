package Com.Logger;

public class LoginPage {
	private static LoginPage instance;

    
    private LoginPage() {
        
    }

   
    public static LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }

    
    public void log(String message) {
        System.out.println("Login message: " + message);
    }
}
