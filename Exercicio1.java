import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println("Insira o primeiro numero: ");
            int n1 = sc.nextInt();
            System.out.println("Insira o segundo numero: ");
            int n2 = sc.nextInt();
            System.out.println("Insira o terceiro numero: ");
            int n3 = sc.nextInt();
            int maior = Math.max(Math.max(n1, n2), n3);
            System.out.println("O maior numero: "+maior);
            System.out.println("Tente de novo");
            if(n1 == n2){
                if(n1 == n3){
                    System.out.println("Todos os numeros são iguais! FIM.");
                    again = false;
                }
            }
        }while(again == true);

    }
}
