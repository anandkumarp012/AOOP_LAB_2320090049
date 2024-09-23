package Com.Population_Tracker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityPopulationTracker {
    
    private Map<String, Integer> cityPopulationMap;

    public CityPopulationTracker() {
        cityPopulationMap = new HashMap<>();
    }

    public void addCity(String city, int population) {
        if (cityPopulationMap.containsKey(city)) {
            System.out.println("City already exists. Use the update option to change the population.");
        } else {
            cityPopulationMap.put(city, population);
            System.out.println("City added successfully.");
        }
    }

    public void updateCityPopulation(String city, int newPopulation) {
        if (cityPopulationMap.containsKey(city)) {
            cityPopulationMap.put(city, newPopulation);
            System.out.println("City population updated successfully.");
        } else {
            System.out.println("City not found in the tracker.");
        }
    }

    // Method to remove a city from the tracker
    public void removeCity(String city) {
        if (cityPopulationMap.containsKey(city)) {
            cityPopulationMap.remove(city);
            System.out.println("City removed successfully.");
        } else {
            System.out.println("City not found in the tracker.");
        }
    }

    public void searchCity(String city) {
        if (cityPopulationMap.containsKey(city)) {
            System.out.println("City: " + city + ", Population: " + cityPopulationMap.get(city));
        } else {
            System.out.println("City not found in the tracker.");
        }
    }

    public void displayAllCities() {
        Set<Map.Entry<String, Integer>> entrySet = cityPopulationMap.entrySet();
        if (entrySet.isEmpty()) {
            System.out.println("No cities in the tracker.");
        } else {
            System.out.println("City List:");
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println("City: " + entry.getKey() + ", Population: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityPopulationTracker tracker = new CityPopulationTracker();

        int choice;
        do {
            System.out.println("\nCity Population Tracker Menu:");
            System.out.println("1. Add City");
            System.out.println("2. Update City Population");
            System.out.println("3. Remove City");
            System.out.println("4. Search City");
            System.out.println("5. Display All Cities");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter population: ");
                    int population = scanner.nextInt();
                    tracker.addCity(city, population);
                    break;
                case 2:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    System.out.print("Enter new population: ");
                    int newPopulation = scanner.nextInt();
                    tracker.updateCityPopulation(city, newPopulation);
                    break;
                case 3:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    tracker.removeCity(city);
                    break;
                case 4:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    tracker.searchCity(city);
                    break;
                case 5:
                    tracker.displayAllCities();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
