/* 2ª Parte - Considere os seguintes critérios fictícios para desenvolver o cadastro de anúncios:
Crie um sistema que permita o cadastro de anúncios. O anúncio deverá conter os seguintes dados:
nome do anúncio
cliente
data de início
data de término
investimento por dia
O sistema fornecerá os relatórios de cada anúncio contendo:
valor total investido
quantidade máxima de visualizações
quantidade máxima de cliques
quantidade máxima de compartilhamentos
Os relatórios poderão ser filtrados por intervalo de tempo e cliente.
*/
import java.util.Locale;
import java.util.Scanner;

public class CadastroDeAnuncios {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o nome do anuncio");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        String cliente = scanner.nextLine();
        System.out.println("Digite a data de inicio do anuncio");
        String dataInicio = scanner.nextLine();
        System.out.println("Digite a data de termino do anuncio");
        String dataTermino = scanner.nextLine();
        System.out.println("Digite o valor investido por dia");
        Double valor = scanner.nextDouble();

        // *** PROCESSAMENTO DE DADOS
        Double valor1 = 8.3;
        Double valor2 = 6.6;
        Double valor3 = 40.0;

        double VisAnuPrinc = valor.intValue() * 30;
        double NumDeCliq = VisAnuPrinc / valor1.intValue();
        double NumDeCompRdSoc = NumDeCliq / valor2.intValue();
        double NumDeVisRd = NumDeCompRdSoc * valor3.intValue();


        // *** PROCESSAMENTO DE DADOS 2 PESSOA ***
        double VisAnu2 = NumDeVisRd;
        double NumDeCliq2 = (VisAnu2) / valor1.intValue();
        double NumDeCompRdSoc2 = (NumDeCliq2) / valor2.intValue();
        double NumDeVisRd2 = (NumDeCompRdSoc2) * valor3.intValue();

        // *** PROCESSAMENTO DE DADOS 3 PESSOA ***
        double VisAnu3 = NumDeVisRd2;
        double NumDeCliq3 = (VisAnu3) / valor1.intValue();
        double NumDeCompRdSoc3 = (NumDeCliq3) / valor2.intValue();
        double NumDeVisRd3 = (NumDeCompRdSoc3) * valor3.intValue();

        // *** PROCESSAMENTO DE DADOS 4 PESSOA ***
        double VisAnu4 = NumDeVisRd3;
        double NumDeCliq4 = (VisAnu4) / valor1.intValue();
        double NumDeCompRdSoc4 = (NumDeCliq4) / valor2.intValue();
        double NumDeVisRd4 = (NumDeCompRdSoc4) * valor3.intValue();


        // *** SAIDA DE DADOS 1 ***
        System.out.printf("Visualizacoes %.0f%n", VisAnuPrinc + NumDeVisRd + NumDeVisRd2 + NumDeVisRd3 + NumDeVisRd4);
        System.out.printf("Cliques %.0f%n", NumDeCliq + NumDeCliq2 + NumDeCliq3 + NumDeCliq4);
        System.out.printf("Compartilhamentos %.0f%n", NumDeCompRdSoc + NumDeCompRdSoc2 + NumDeCompRdSoc3 + NumDeCompRdSoc4);

        scanner.close();
    }
}