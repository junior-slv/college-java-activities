import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        boolean again = true;
        String valor;
        double extraMin = 0.0166666667;
        int permanencia = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insira o tempo  de permanencia(em minutos):");
            permanencia = sc.nextInt();
            if (permanencia == -1){
                System.out.println("Vocẽ finalizou o programa :)");
                again = false;
            }
            else if (permanencia <= 15){
                System.out.println("Devido a permanencia de até " +permanencia+ " minutos, você foi isento do pagamento");
            }
            else if (permanencia <= 60){
                System.out.println("Por permanecer "+permanencia+" minutos, você precisa pagar R$1,50");
            }
            else if (permanencia > 60){
            int extra = permanencia - 60;
            double valExtra = extra * extraMin;
            double permanenciaAcima = valExtra + 1.5;
            String valorFinal = String.format("%.2f", permanenciaAcima);
            System.out.println("Por permanecer "+permanencia+" minutos, você precisa pagar R$"+valorFinal);
            } else{
                System.out.println("Insira um valor válido");
            }
        }while (again == true);
    }
}
