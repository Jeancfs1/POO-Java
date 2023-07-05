import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" Digite o valor de um dos lados do quadrado: ");
        double lado = read.nextDouble();
        double area = lado*lado;

        System.out.println("A área do quadrado é: " + area);

        read.close();
    }
}