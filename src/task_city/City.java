package task_city;

import java.util.*;

public class City {
    public static void main(String[] args) {
        LinkedHashMap<String, String> cityAndSurname = new LinkedHashMap<>();

        getCityAndSurname(cityAndSurname);

        Scanner reader = new Scanner(System.in);
        System.out.println("Введіть місто для визначення призвіща проживаючої сім'ї у ньому: ");
        String city = reader.next();

        System.out.println("В даному місті проживає сім'я за прізвищем: " + cityAndSurname.get(city));
    }
    public static void getCityAndSurname(LinkedHashMap<String, String> cityAndSurname){

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Введіть " + i + " місто для " + i + " сім'ї: ");
            String city = scanner.next();
            System.out.println("Введіть прізвище " + i + " сім'ї: ");
            String surname = scanner.next();
            cityAndSurname.put(city, surname);
        }
    }
}
