import java.util.Scanner;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {

        System.out.println(" Witaj w systemie rezerwacji ");
        System.out.println();
        displayHotelInformation();
        System.out.println();
        displayCompanyInformation();

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(Integer.toString(i) + " * " + Integer.toString(j) + " =   " + (i * j));
            }
        }

    }
    public static void displayCompanyInformation() {
        System.out.println(" Krystian Tonderys 78611 ");
        System.out.println(" Clockwork Java ");
        System.out.println(" ul. Programistów 32");
        System.out.println(" 31-333 Kraków");
    }
    public static void displayHotelInformation() {
        System.out.println(" Hotel Clockwork Java ");
        System.out.println(" ul. Programistów 32 ");
        System.out.println(" 31-333 Kraków ");
        System.out.println(" Tel. 666-777-555");
    }


    public class WprowadzDane {
        public static void main(String[] args) {

            System.out.println();
            Scanner scanner = new Scanner(System.in);
            String userString = scanner.nextLine();
            System.out.println(String.format("Your print: hello ", userString));

        }
    }


}
