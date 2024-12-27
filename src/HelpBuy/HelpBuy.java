package HelpBuy;

import java.util.Objects;
import java.util.Scanner;

public class HelpBuy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calcular calcular = new Calcular();
        String unidadeMedida = "un";
        double precoProd = 0.0;
        double qtdVolProd = 0.0;
        double precoPorUM = 0.0;

        System.out.print("insira a quantidade de produtos para comparação: ");
        int qtdComp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira o nome do produto: ");
        String inputNameProdut = scanner.nextLine();

        System.out.print("Digite a unidade de medida: ");
        unidadeMedida = scanner.nextLine();

        for (int a = 0; a < qtdComp;){
            a++;

            if (qtdComp == 1){
                System.out.print("digite o Preço do produto: ");
                precoProd = scanner.nextDouble();

                System.out.print("insira a quantidade do produto: ");
                qtdVolProd = scanner.nextDouble();
                scanner.nextLine();

                precoPorUM = calcular.precoUM(precoProd, qtdVolProd);

            }
            else {
                System.out.print("digite o Preço do produto " + a + " a ser comparado : ");
                precoProd = scanner.nextDouble();

                System.out.print("insira a quantidade do produto " + a + " a ser comparado : ");
                qtdVolProd = scanner.nextDouble();
                scanner.nextLine();

                precoPorUM = calcular.precoUM(precoProd, qtdVolProd);
            }
            //aqui eu preciso inserir no array os valores de cada item
            System.out.println("O produto " + inputNameProdut + " custa: R$ " +  String.format("%.2f", precoPorUM) + " / " + unidadeMedida);
        }
    }
}
