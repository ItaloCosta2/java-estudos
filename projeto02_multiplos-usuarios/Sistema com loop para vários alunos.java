import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Quantos alunos deseja cadastrar?");
        Scanner sc = new Scanner(System.in);
        
        int quantidadeAlunos = sc.nextInt();
        sc.nextLine(); // limpa buffer

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();
            sc.nextLine(); // limpa buffer
            System.out.println("Digite a primeira nota:");
            double nota1 = sc.nextDouble();
            sc.nextLine(); // limpa buffer
            System.out.println("Digite a segunda nota:");
            double nota2 = sc.nextDouble();
            sc.nextLine(); // limpa buffer

            double media = (nota1 + nota2) / 2;

            verificarAluno(nome, media);
        }

        sc.close(); // fecha scanner
    }

    public static void verificarAluno(String nome, double nota) {

        if (nota >= 7.0) {
            System.out.println(nome + " foi aprovado com nota " + nota);
        } else if (nota >= 5.0) {
            System.out.println(nome + " ficou em recuperação com nota " + nota);
        } else {
            System.out.println(nome + " foi reprovado com nota " + nota);
        }
    }
}