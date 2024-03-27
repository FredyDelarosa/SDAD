import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mensaje:");
        String msg = scanner.nextLine();

        System.out.println("El mensaje es "+msg);
    }
}