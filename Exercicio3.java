import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contagem regressiva");
        int minutos = 10;
        int seg = 59;
        int converte = 0;

        System.out.println("10:00");
        for (minutos = 9; minutos >= 0; minutos--) {

            if (seg == 60) {
                seg = converte;
            }

            System.out.println(minutos + ":" + seg);

            for (int seg2 = 58; seg2 >= 0; seg2--){

                Thread.sleep(1000);
                System.out.println(minutos + ":" + seg2);
            }
        }
        sc.close();
    }
}