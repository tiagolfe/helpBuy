package HelpBuy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HelpBuy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calcular calcular = new Calcular();
        String unitOfMeasurement;
        double prodPrice;
        double qtdProdVol;
        double prodCost;
        int qtdComp;
        int cheaper = 0;
        double cheaper1 = 0.0;

        System.out.print("insira a quantidade de produtos para comparação: ");
        qtdComp = scanner.nextInt();
        scanner.nextLine();

        double[] prodPriceL = new double[qtdComp];
        double[] qtdProdVolL = new double[qtdComp];
        double[] prodCostL = new double[qtdComp];

        System.out.print("Insira o nome do produto: ");
        String inputNameProdut = scanner.nextLine();

        System.out.print("Digite a unidade de medida: ");
        unitOfMeasurement = scanner.nextLine();

        for (int a = 0; a < qtdComp;){
            if (qtdComp == 1){
                System.out.print("digite o Preço do produto: ");
                prodPrice = scanner.nextDouble();

                System.out.print("insira a quantidade do produto: ");
                qtdProdVol = scanner.nextDouble();
                scanner.nextLine();

                prodCost = calcular.costPerQtdProdVol(prodPrice, qtdProdVol);
            }
            else {
                System.out.print("digite o Preço do produto " + a + " a ser comparado : ");
                prodPrice = scanner.nextDouble();

                System.out.print("insira a quantidade do produto " + a + " a ser comparado : ");
                qtdProdVol = scanner.nextDouble();
                scanner.nextLine();

                prodCost = calcular.costPerQtdProdVol(prodPrice, qtdProdVol);
            }
            //aqui eu preciso inserir no array os valores de cada item
            prodPriceL[a] = prodPrice;
            qtdProdVolL[a] = qtdProdVol;
            prodCostL[a] = prodCost;

            //Bloco identificar mais barato
            if (a != 0){
                if (prodCost < cheaper1) {
                    cheaper = a;
                    cheaper1 = prodCostL[a];
                }
            }
            else {
                cheaper = a;
                cheaper1 = prodCostL[a];
            }

            System.out.println("O produto " + inputNameProdut + " custa: R$ " +  String.format("%.4f", prodCost) + " / " + unitOfMeasurement);
            a++;
        }
        System.out.println("o mais barato ta na posição: " + cheaper);
        //System.out.println(cheaper);
//        System.out.println(Arrays.toString(prodPriceL));
//        System.out.println(Arrays.toString(qtdProdVolL));
//        System.out.println(Arrays.toString(prodCostL));
    }

}
