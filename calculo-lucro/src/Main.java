
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço da cotação do bigtime");
        double cotacaoBigTime = scanner.nextDouble();

        System.out.println("Digite o valor inicial de tokens:");
        int tokensInicial = scanner.nextInt();

        System.out.println("Digite o valor final de tokens:");
        int tokensFinal = scanner.nextInt();

        System.out.println("Digite a quantidade de ampulhetas");
        int qntdAmpulhetas = scanner.nextInt();

        System.out.println("Digite a quantidade inicial de minutos da ampulheta: ");
        int minutoAmpulheta = scanner.nextInt();

        System.out.println("Digite a quantidade final de minutos da ampulheta: ");
        int minutoAmpulhetaFinal = scanner.nextInt();

        System.out.println("Digite o preço por hora da ampulheta: ");
        double precoPorHora = scanner.nextDouble();
        precoPorHora = precoPorHora / 60;

        System.out.println("Digite o valor inicial de cristais: ");
        int cristaInicial = scanner.nextInt();

        System.out.println("Digite o valor final de cristais: ");
        int cristaFinal = scanner.nextInt();


        int tempogasto = Math.abs(minutoAmpulhetaFinal - minutoAmpulheta);
        int tokenBruto = tokensFinal - tokensInicial;
        double valorTokens = cotacaoBigTime * tokenBruto;
        double custoCristal = (cristaInicial - cristaFinal) * 0.008;
        double custoDeAmpulhetas = (tempogasto * precoPorHora) * qntdAmpulhetas;
        double lucroLiquido = (valorTokens - custoDeAmpulhetas) - custoCristal;

        System.out.println(" o tempo gasto de ampulheta foi: " + (tempogasto / 60) + " Horas e " + (tempogasto % 60) + " Minutos");

        System.out.printf("o custo de ampulheta é de: $%.2f\n", custoDeAmpulhetas);

        System.out.printf("o valor de tokens é de: $%.2f\n", valorTokens);

        System.out.printf("o custo de cristal é de: $%.2f\n", custoCristal);

        System.out.printf("lucro liquido é de: $%.2f\n", lucroLiquido);


    }
}