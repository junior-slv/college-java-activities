package br.edu.unifil.ling.projeto.view;

import br.edu.unifil.ling.projeto.model.Projeto;

import java.util.Scanner;
/*  
    Alunos: 
    Dirceu Aparecido da Silva Junior
    Maria Luiza Gonçalves Pereira
    Walter Hian Oliveira Barroso 
    Gregório Ramires 
*/
public class usaProjeto {
    public static void main(String[] args) {
        boolean again = true;
        Projeto projeto = new Projeto();
        Scanner sc = new Scanner(System.in);
        while (again == true){
            System.out.println("1 - Registrar horas trabalhadas");
            System.out.println("2 - Consultar custo do projeto");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Alterar custo");
            System.out.println("9- Encerrar o programa");
            int opcaoMenu = sc.nextInt();
            sc.nextLine();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Insira as horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();
                    projeto.registrarHoras(horasTrabalhadas);
                    break;
                case 2:
                    System.out.println("O custo atual do projeto é: R$"+projeto.getCustoAtual());
                    if(projeto.getNome() == null || projeto.getNome().equals("")){
                        System.out.println("Insira um nome pro projeto");
                    }else{
                        System.out.println("O nome do projeto é: "+projeto.getNome());
                    }
                    System.out.println("O custo hora é de: R$"+projeto.getCustoHora()+"/hora");
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
                default:
                    System.out.println("Insira um valor valido!");
            }
        }

    }
}
