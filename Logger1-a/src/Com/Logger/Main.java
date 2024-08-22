package Com.Logger;

public class Main {
	public static void main(String[] args) {
	       
		LoginPage Loginuser = LoginPage.getInstance();

        
        Loginuser.log("Application started :).");
        
        
        LoginPage anotherLogger = LoginPage.getInstance();

       	        anotherLogger.log("This is logged using another reference to the same Loginuser instance.");

        
        if (Loginuser == anotherLogger) {
            System.out.println("loginuser instances are the same for both.");
        } else {
            System.out.println("Loginuser instances are different.");
        }
    }
}
