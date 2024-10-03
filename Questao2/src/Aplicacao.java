import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto pro = new Produto();

        System.out.println("Cadastro do produto: ");

        System.out.println("Nome do produto: ");
        pro.setNome(sc.nextLine());

        System.out.println("Cor do produto: ");
        pro.setCor(sc.nextLine());

        System.out.println("Preço do produto: ");
        pro.setValor(sc.nextDouble());


        System.out.println("Código do produto: ");
        pro.setCodigo(sc.nextInt());

        System.out.println("Peso do produto: ");
        pro.setPeso(sc.nextDouble());

        System.out.println("Quantidade no estoque do produto: ");
        pro.setQuantidade(sc.nextInt());

        do {
            System.out.println("\n NB SHOP \n");
            System.out.println("Lista de produtos disponiveis: \n" + pro);
            System.out.println("\nDigite a quantidade que você deseja comprar: ");
            pro.setQuantidadeProdutos(sc.nextInt());
            pro.removerPodutos();
            System.out.println("Para o pagamento, temos os seguintes benefícios: \n" +
                    "\n" +
                    "Pix, Espécie, Transferência ou Débito, 5% de desconto.\n" +
                    "Crédito, parcelar em 3x sem juros.\n");
            System.out.println("Informe o número 1 para Pix! \n" +
                    "Informe o número 2 para Débito Automatico!\n" +
                    "Informe o número 3 para Crédito, parcelar em 3x sem juros.!\n" +
                    "Informe o número 4 para Pagamento em Espécie!\n" +
                    "Informe o número 5 para Pagamento via Transferência!");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Você escolheu efetuar um pagamento via Pix.");
                    pro.desconto();
                    System.out.println("Valor a ser pago: " + pro.vendaDesconto);
                    System.out.println("Chave Pix: 40028922 ");
                    System.out.println("Verifique os dados e confirme a transação.");
                    System.out.println("Aguarde enquanto processamos seu pagamento...\n");
                    System.out.println("\nCompra realizada com sucesso!\n");
                    break;
                case 2:
                    System.out.println("Você escolheu efetuar um pagamento via débito automático.");
                    System.out.println("O valor será debitado automaticamente da sua conta.");
                    System.out.println("Verifique os dados da transação antes de confirmar.");
                    System.out.printf("Você tem que pagar: R$ %.2f " , pro.valorTotal());
                    System.out.println("Aguarde enquanto processamos seu pagamento...");
                    break;
                case 3:
                    System.out.println("Deseja parcelar em 1x, 2x ou 3x?");
                    int parcelas = sc.nextInt();
                    pro.valorTotalCartao();

                    if (parcelas == 1) {
                        System.out.printf("Valor total a ser pago: %.2f\n", pro.cartao);
                    } else if (parcelas == 2) {
                        double valorParcela = pro.cartao / 2;
                        System.out.printf("Você escolheu parcelar em 2 vezes. Cada parcela será de: %.2f\n", valorParcela);
                    } else if (parcelas == 3) {
                        double valorParcela = pro.cartao / 3;
                        System.out.printf("Você escolheu parcelar em 3 vezes. Cada parcela será de: %.2f\n", valorParcela);
                    } else {
                        System.out.println("Opção de parcelamento inválida. Tente novamente.");
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu efetuar um pagamento em espécie.");
                    pro.desconto();
                    System.out.println("Valor a ser pago: " + pro.vendaDesconto);
                    System.out.println("Por favor, digite o valor que você vai pagar: ");
                    pro.setEspecie(sc.nextDouble());
                    if (pro.getEspecie() > pro.vendaDesconto) {
                        System.out.println("Aguarde a confirmação do pagamento e o recebimento do troco, se necessário...");
                        pro.trocoEspecie();
                        System.out.printf("Seu troco: %.2f", pro.troco, " $ Reais \n");
                    }
                    else if (pro.getEspecie() == pro.vendaDesconto) {
                        System.out.println("Sua compra foi realizada com sucesso!");
                    }
                    else {
                        System.out.println("Você não tem saldo suficiente!");
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu efetuar um pagamento via Transferência! \nAguarde as instruções para concluir a transação.");
                    System.out.printf("Você tem que pagar: R$ %.2f " , pro.valorTotal());
                    break;

                default:
                    System.out.println("\nInforme um número valido!");
                    break;
            }

            System.out.println();
            System.out.println("\nOBRIGADO E VOLTE SEMPRE!\n");
            System.out.println("Quantidade de " + pro.getNome() + " no estoque: " + pro.novoEstoque);
            System.out.println("Para realizar uma nova compra digite 0");
            pro.rep = sc.nextInt();

        } while (pro.rep == 0);

    }

}
