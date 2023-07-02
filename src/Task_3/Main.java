package Task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] people = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toUpperCase();
        nameDetection(people, name);
    }

    public static void nameDetection(String[] array, String name) {

        int count = 0;

        for (String s : array) {
            if (s.toUpperCase().equals(name)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Такої людини нема в списку");
        } else {
            System.out.println("Ця людина зустрічається у списку " + count + " раз/-ів/-и");
        }
    }
}
