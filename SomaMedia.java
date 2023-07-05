import java.util.Scanner;

public class SomaMedia{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite 3 numéros:");
        double n1 = x.nextDouble();
        double n2 = x.nextDouble();
        double n3 = x.nextDouble();

        double soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.println( "A soma dos 3 numéros é: " + soma);
        System.out.println(" A media dos 3 numéros é:" + media);

        x.close();
        
        
    }
}
