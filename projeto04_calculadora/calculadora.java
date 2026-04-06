import java.util.Scanner;

public static void main(String[] args) {
    double num1, num2;
    String operacao;
    double resultado = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    num1 = scanner.nextDouble();
    System.out.println("Digite o segundo numero:");
    num2 = scanner.nextDouble();
    System.out.println("Digite a operacao (+, -, *, /):" );
    operacao = scanner.next();
    

    switch (operacao) {
        case "+":
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "-":
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "*":
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "/":
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisao por zero nao e permitida.");
                return;
            }
            break;
    
        default:
            break;


    }
}