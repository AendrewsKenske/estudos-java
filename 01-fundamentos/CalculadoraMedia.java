import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

            System.out.println("Olá essa é uma ferramenta criada para calcular a média de notas.\n Adicione as notas de acordo com as matérias desejadas.");
        String nome = scanner.nextLine();
        //Verificar se não tem número no nome da matéria//
        if(nome.matches(".*\\d+([.,])?"))
            // Esse código é usado ao ter casas decimais (".*\\d+([. ,])?")) é adicionado o ponto e virgula caso o utilizador opte por uma das duas formas.
            System.out.println("Ops! Adicione os nomes das matérias separando-as com vírgula!");
        String materia = scanner.nextLine();
        System.out.println("Agora adicione as notas desejadas (máximo 4 notas):");
        double nota = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
       System.out.println("Essa é a soma de suas notas." + (nota+nota2+nota3));
       //Quando só adiciona as notas dessa forma o computador apenas soma os números

        scanner.nextLine();
       //Para limpar o cache (buffer) do enter
       System.out.println("Deseja calcular a média de suas matérias?");
       String opcao1 = "sim";
       String opcao2 = "não";
       String opcao = scanner.nextLine();
       if(opcao.equals(opcao1)) {
           System.out.println("Certo, irei calcular a média de suas notas.\nEssa é a média de suas notas:");
           System.out.println((nota + nota2 + nota3) / 3);
       }    else if(opcao.equals(opcao2)) {
           System.out.println("Tudo bem! obrigado!");
       }

       scanner.close();
    }
}
