package task_double_values;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Створюємо об'єкт linkedList
        List<String> list = new LinkedList<>();

        // Створюємо об'єкт BufferedReader для подальшого введення з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заповнюємо масив linkedList
        for (int i = 1; i < 6; i++) {
            System.out.println("Введіть слово " + i + ":");
            String s = reader.readLine();
            // Додаємо значення
            list.add(s);
        }
        // Виводимо на екран весь подвоєний вміст
        for (String temp : list) {
            System.out.println(doubleValues(temp));
        }
    }
    static String doubleValues(String a){
        return a + " " + a;
    }
}
