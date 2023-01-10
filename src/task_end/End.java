package task_end;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class End {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введіть рядок (для завершення програми ввести `end`): ");
            String line = scanner.nextLine();
            if (line.equals("end"))
                break;
            else list.add(line);
        }
        while (true);

        System.out.println("Всі введені рядки: ");
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
