package task_minimal_n;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Введіть розмірність масиву (використовуйте ціле число): ");
        int lnSize = reader.nextInt();

        List<Integer> list = new LinkedList<>();

        getIntegerList(lnSize, list);

        getMinimum(list);

    }
   public static void getIntegerList(int a, List<Integer> array){

       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a; i++) {
            System.out.println("Введіть " + i + " значення: ");
            int s = scanner.nextInt();
            array.add(s);
        }
    }

    public static void getMinimum(List<Integer> array){
        int  min = array.get(0);
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j) <= min){
                min = array.get(j);
            }
        }
        System.out.println("Мінімальне значення: " + min);
    }
}

