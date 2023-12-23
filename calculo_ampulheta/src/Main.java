import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da Ampulheta: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a Quantidade de Horas:");
        double horas = scanner.nextDouble();

        System.out.println("Digite o valor do casco vazio: ");
        double casco = scanner.nextDouble();


        double precoLiquido = preco - casco;

        double valorMinuto = precoLiquido / horas;

        System.out.printf("O valor por Minuto é: $ %.3f\n", valorMinuto, "$");
        System.out.printf("o valor por Hora é: $ %.2f", valorMinuto * 60);


    }
}