package Com.Ride_Sharing;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userauthentication auth = userauthentication.getInstance();

                auth.login();

        if (auth.isLoggedIn()) {
            System.out.println("\n--- Ride Sharing Application ---");

            // Vehicle Selection
            System.out.print("Select Vehicle (Car, Bike, Scooter): ");
            String vehicleType = sc.nextLine().toLowerCase();

            vehiclefactory vehicleFactory;
            switch (vehicleType) {
                case "car":
                    vehicleFactory = new CarFactory();
                    break;
                case "bike":
                    vehicleFactory = new BikeFactory();
                    break;
                case "scooter":
                    vehicleFactory = new ScooterFactory();
                    break;
                default:
                    System.out.println("not valid vehicle.");
                    return;
            }

            vehicle vehicle = vehicleFactory.createVehicle();
            vehicle.book();

           
            System.out.print("Select Payment Method (CreditCard or GooglePay): ");
            String paymentType = sc.nextLine().toLowerCase();

            paymentfactory paymentFactory;
            switch (paymentType) {
                case "creditcard":
                    paymentFactory = new CreditCardFactory();
                    break;
                
                case "googlepay":
                    paymentFactory = new GooglePayFactory();
                    break;
                default:
                    System.out.println("not valid payment method.");
                    return;
            }

            payment paymentMethod = paymentFactory.createPaymentMethod();
            Receipt receipt = paymentFactory.createReceipt();

            paymentMethod.pay();
            receipt.generateReceipt();
        }

                auth.logout();
        sc.close();
    }
}
