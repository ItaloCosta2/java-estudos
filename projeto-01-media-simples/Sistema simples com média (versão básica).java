import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno 1:");
        String nome1 = sc.nextLine();

        System.out.println("Digite a nota do aluno 1:");
        double nota1 = sc.nextDouble();

        sc.nextLine(); // limpa buffer

        System.out.println("Digite o nome do aluno 2:");
        String nome2 = sc.nextLine();

        System.out.println("Digite a nota do aluno 2:");
        double nota2 = sc.nextDouble();

        verificarAluno(nome1, nota1);
        verificarAluno(nome2, nota2);
        

        sc.close();
    }

    public static void verificarAluno(String nome, double nota) {
        if(nota >= 7.0){
            System.out.println(nome + " foi aprovado com nota " + nota);
        } else if (nota >= 5.0) {
            System.out.println(nome + " ficou em recuperação com nota " + nota);
        } else {
            System.out.println(nome + " foi reprovado com nota " + nota);
        }
    }
}