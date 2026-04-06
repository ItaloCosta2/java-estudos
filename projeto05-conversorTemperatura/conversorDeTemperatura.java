import java.util.Scanner;

public class conversorDeTemperatura {
    public static void main(String[] args) {
    Double celsius, faharenheit;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em celsius:");
    celsius = scanner.nextDouble();
    faharenheit = (celsius * 9/5) + 32;
    System.out.println("A temperatura em faharenheit e: " + faharenheit);
}
}