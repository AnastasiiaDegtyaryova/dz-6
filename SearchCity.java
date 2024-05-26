import java.util.List;
import java.util.Scanner;

public class SearchCity {

    public static void main(String[] args) {
        List<String> cities = List.of("London", "Lviv", "New York");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city to search for: ");
        String city = scanner.nextLine();

        boolean result = containsCity(cities, city);
        System.out.println(city + " is in the list - " + result);
    }

    public static boolean containsCity(List<String> cities, String searchCity) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(searchCity)) {
                return true;
            }
        }

        for (String city : cities) {
            if (city.equals(searchCity)) {
                return true;
            }
        }

        int index = 0;
        while (index < cities.size()) {
            if (cities.get(index).equals(searchCity)) {
                return true;
            }
            index++;
        }

        return false;
    }
}
