package br.edu.unifil.ling.projeto.view;

import br.edu.unifil.ling.projeto.model.Projeto;

import java.util.Scanner;

public class usaProjeto {
    public static void main(String[] args) {
        String nome;
        double custoHora;
        boolean again = true;
        Projeto projeto = new Projeto();
        Scanner sc = new Scanner(System.in);
        while (again == true){
            System.out.println("1 - Registrar horas trabalhadas\n2 - Consultar custo do projeto\n3 - Alterar nome\n4 - Alterar custo\n9- Encerrar o programa\n");
            int opcaoMenu = sc.nextInt();
            sc.nextLine();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Insira as horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();
                    projeto.registrarHoras(horasTrabalhadas);
                    break;
                case 2:
                    System.out.println("O custo das horas trabalhadas é de "+projeto.getCustoAtual());
                    System.out.println("O nome do projeto é: "+projeto.getNome());
                    System.out.println("O custo hora é de: "+projeto.getCustoHora());
                    System.out.println("O total de horas é de: "+projeto.getHoras());
                    break;
                case 3:
                    System.out.println("Insira o nome do projeto: ");
                    String rnome = sc.nextLine();
                    projeto.setNome(rnome);
                    break;
                case 4:
                    System.out.println("Insira o custo hora: ");
                    double rhoras= sc.nextDouble();
                    projeto.setCustoHora(rhoras);
                    break;
                case 9:
                    System.out.println("Você finalizou o programa! :)");
                    again = false;
                    break;
            }
        }

    }
}
