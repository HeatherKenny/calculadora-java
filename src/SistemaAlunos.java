import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== CADASTRO DE ALUNOS ===");
            System.out.print("1. Cadastrar aluno\n2. Listar alunos\n3. Sair\n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    alunos.add(new Aluno(nome, nota));
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : alunos) {
                            System.out.printf("%s: %.1f%n", aluno.getNome(), aluno.getNota());
                        }
                    }
                    break;
                case 3:
                    return;
            }
        }
    }

    static class Aluno {
        private String nome;
        private double nota;

        public Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        public String getNome() { return nome; }
        public double getNota() { return nota; }
    }
}
