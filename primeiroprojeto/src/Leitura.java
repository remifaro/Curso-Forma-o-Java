import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // vou conseguir ler o que o usuário digitar

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // lendo o que foi recebido em texto e armazenando na variável filme

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt(); // lendo o que foi recebido como inteiro e armazenando na variável anoDeLancamento
        
        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble(); // lendo o que foi recebido como número double e armazenando na variável avaliacao
        
        leitura.close();
        
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao); 
        
    }
}
