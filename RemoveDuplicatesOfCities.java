import java.util.*;

public class RemoveDuplicatesOfCities {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("London", "Lviv", "Lviv", "New York", "London");
        removeDuplicatesAndPrint(cities);
    }

    public static void removeDuplicatesAndPrint(List<String> cities) {

        Set<String> uniqueCities = new HashSet<>();
        for (String city : cities) {
            uniqueCities.add(city);
        }

        Iterator<String> iterator = uniqueCities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



