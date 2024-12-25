import java.util.Scanner;

public class HelpBuy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputUnitType = "un";
        Double inputPreço = 0.0;

        System.out.print("insira a quantidade de produtos para comparação: ");
        Integer qtdComp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira o nome do produto: ");
        String inputProduto = scanner.nextLine();

        System.out.print("Digite a unidade de medida: ");
        inputUnitType = scanner.nextLine();



        for (int a = 0; a < qtdComp;){
            a++;



            if (qtdComp == 1){
                System.out.print("digite o Preço do produto: ");
                inputPreço = scanner.nextDouble();

                System.out.print("insira a quantidade do produto: ");
                Integer qtdProduto = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" O produto " + inputProduto + " de " + qtdProduto + inputUnitType +" custa: R$" + inputPreço + " por unidade");
            }
            else {
                System.out.print("digite o Preço do produto " + a + " a ser comparado : ");
                inputPreço = scanner.nextDouble();
                System.out.print("insira a quantidade do produto " + a + " a ser comparado : ");
                Integer qtdProduto = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" O produto " + inputProduto + " de " + qtdProduto + inputUnitType +" custa: R$" + inputPreço + " por unidade");
            }


        }




    }
}
