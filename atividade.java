import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        System.out.println("por favor, insira as 12 temperaturas:");
        while (contador < 12) {
            System.out.print("digite a temperatura " + (contador + 1) + " (entre 4 e 10): ");
            double temperatura = scanner.nextDouble();
            if (temperatura >= 4 && temperatura <= 10) {
                soma += temperatura;
                contador++;
            } else {
                System.out.println("temperatura inválida. Por favor, insira novamente.");
            }
        }
        double media = soma / 12;
        System.out.printf("a média de hoje das temperaturas é: %.1fº C%n", media);
    }
}
