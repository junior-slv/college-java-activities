import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        boolean again = true;
        Scanner  sc = new Scanner(System.in);
        do {
            double imposto = 1.10;
            System.out.println("Insira a area do terreno em m²: ");
            int area = sc.nextInt();
            sc.nextLine();
            System.out.println("O seu terreno é na esquina? (S/N)");
            String esquina = sc.nextLine();
            if (esquina.equalsIgnoreCase("S")){
               imposto += 0.20;
            }
            System.out.println("O seu terreno pertence a zona comercial? (S/N)");
            String comercial = sc.nextLine();
            if (comercial.equalsIgnoreCase("S")){
                imposto += 0.10;
            }
            System.out.println("O seu terreno está limpo(Sem mato)? (S/N)");
            String limpo = sc.nextLine();
            if (limpo.equalsIgnoreCase("S")){
                double totalImposto = area * imposto;
                double desconto = (totalImposto * 25)/100;
                double total = totalImposto - desconto;
                String resultado = String.format("%.2f", total);
                System.out.println("O total é de: R$"+resultado);
            }else {
                double totalImposto = area * imposto;
                String resultado = String.format("%.2f", totalImposto);
                System.out.println("O total é de: R$"+resultado);
            }
            System.out.println("Deseja calcular outro IPTU? (S/N)");
            String outro = sc.nextLine();
            if (outro.equalsIgnoreCase("N")){
                again = false;
            }
        }while(again == true);
    }
}
