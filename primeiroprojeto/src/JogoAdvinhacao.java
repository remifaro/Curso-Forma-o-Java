import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(5);
        int numeroDetentativas = 0;
        int tentativa = 0;

        for(int i=0; i <=4; i++){

            System.out.println("Digite um número inteiro de 0 à 100");
            tentativa = leitura.nextInt();
            numeroDetentativas++;

            if(tentativa > numeroAleatorio){
                System.out.println("Número digitado pelo usuário é maior do que o número gerado.");
                System.out.println(numeroAleatorio);
            } else if(tentativa < numeroAleatorio){
                System.out.println("Número digitado pelo usuário é menor do que o número gerado.");
                System.out.println(numeroAleatorio);
            } else if(tentativa == numeroAleatorio){
                System.out.println("Acertou em "+ numeroDetentativas +" tentativa(s)!");
                System.out.println(numeroAleatorio);
                break;
            } else {
                continue;
            }
        }
    }
}
