import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        boolean againVencedor = true;
        int vencedorA = 0, vencedorB = 0, empate = 0;
        do {
            System.out.println("Menu principal: \n1 - Aplicar pesquisa\n2 - Mostrar resultado\n9 - Fim");
            int opcaoMenu = sc.nextInt();
            switch(opcaoMenu) {
                case 1:
                        do {
                            System.out.println("Qual seu palpite de vitoria do Time A x B? \n1 - Vencedor Time A\n2 - Vencedor Time B\n3 - Empate\n9 - Fim");
                            int opcaoPesquisa = sc.nextInt();
                            switch (opcaoPesquisa){
                                case 1:
                                    System.out.println("Você votou na vitoria do time A");
                                    vencedorA++;
                                    break;
                                case 2:
                                    System.out.println("Você votou na vitoria do time B");
                                    vencedorB++;
                                    break;
                                case 3:
                                    System.out.println("Você votou no empate");
                                    empate++;
                                    break;
                                case 9:
                                    System.out.println("Você voltou ao menu principal");
                                    againVencedor = false;
                                    break;

                            }
                        }while (againVencedor == true);
                        break;
                case 2:
                    System.out.println("Time A tem um total de votos de: "+vencedorA);
                    System.out.println("Time B tem um total de votos de: "+vencedorB);
                    System.out.println("Empate tem um total de votos de: "+empate);
                    break;

                case 9:
                    System.out.println("Você finalizou o programa! :)");
                    again = false;
                    break;
                default:
                    System.out.println("Insira um valor válido!");
            }
        }
        while (again == true);
    }
}
