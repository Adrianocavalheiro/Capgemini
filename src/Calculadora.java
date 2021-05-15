/* 1ª Parte - Considere os seguintes critérios fictícios para desenvolver a calculadora de alcance de anúncio:
Baseados em dados de análise de anúncios anteriores, a agência tem os seguintes dados:

a cada 100 pessoas que visualizam o anúncio 12 clicam nele.

a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.

cada compartilhamento nas redes sociais gera 40 novas visualizações.

30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.

o mesmo anúncio é compartilhado no máximo 4 vezes em sequência

(1ª pessoa -> compartilha -> 2ª pessoa -> compartilha - > 3ª pessoa -> compartilha -> 4ª pessoa)
Crie um script em sua linguagem de programação preferida que receba o valor investido em reais e retorne uma projeção
aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio
(considerando o anúncio original + os compartilhamentos)
*/

import java.util.Locale;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o valor investido");
        Double Valor = scanner.nextDouble();

        // *** PROCESSAMENTO DE DADOS 1 PESSOA ***
        Double valor1 = 8.3;
        Double valor2 = 6.6;
        Double valor3 = 40.0;

        int VisAnuPrinc = Valor.intValue() * 30;
        int NumDeCliq = VisAnuPrinc / valor1.intValue();
        int NumDeCompRdSoc = NumDeCliq / valor2.intValue();
        int NumDeVisuRd = NumDeCompRdSoc * valor3.intValue();

        // *** PROCESSAMENTO DE DADOS 2 PESSOA ***
        int VisAnu2 = NumDeVisuRd;
        int NumDeCliq2 = (VisAnu2) / valor1.intValue();
        int NumDeCompRdSoc2 = (NumDeCliq2) / valor2.intValue();
        int NumDeVisuRd2 = (NumDeCompRdSoc2) * valor3.intValue();

        // *** PROCESSAMENTO DE DADOS 3 PESSOA ***
        int VisAnu3 = NumDeVisuRd2;
        int NumDeCliq3 = (VisAnu3) / valor1.intValue();
        int NumDeCompRdSoc3 = (NumDeCliq3) / valor2.intValue();
        int NumDeVisuRd3 = (NumDeCompRdSoc3) * valor3.intValue();

        // *** PROCESSAMENTO DE DADOS 4 PESSOA ***
        int VisAnu4 = NumDeVisuRd3;
        int NumDeCliq4 = (VisAnu4) / valor1.intValue();
        int NumDeCompRdSoc4 = (NumDeCliq4) / valor2.intValue();
        int NumDeVisuRd4 = (NumDeCompRdSoc4) * valor3.intValue();

        // *** SAIDA DE DADOS 1 ***
        System.out.println("Visualizacoes anuncio principal " + VisAnuPrinc);
        System.out.println("Cliques no anuncio " + NumDeCliq);
        System.out.println("Compartilhamentos " + NumDeCompRdSoc);
        System.out.println("Visualizacoes rede social " + NumDeVisuRd);
        System.out.println("---------------------------------------------------------------------------");

        // *** SAIDA DE DADOS 2***
        System.out.println("Visualizacoes 2 " + VisAnu2);
        System.out.println("Cliques 2 " + NumDeCliq2);
        System.out.println("Compartilhamentos 2 " + NumDeCompRdSoc2);
        System.out.println("Visualizacoes rede social 2 " + NumDeVisuRd2);
        System.out.println("___________________________________________________________________________");

        // *** SAIDA DE DADOS 3***
        System.out.println("Visualizacoes 3 " + VisAnu3);
        System.out.println("Cliques 3 " + NumDeCliq3);
        System.out.println("Compartilhamentos 3 " + NumDeCompRdSoc3);
        System.out.println("Visualizacoes rede social 3 " + NumDeVisuRd3);
        System.out.println("___________________________________________________________________________");

        // *** SAIDA DE DADOS 3***
        System.out.println("Visualizacoes 4 " + VisAnu4);
        System.out.println("Cliques 4 " + NumDeCliq4);
        System.out.println("Compartilhamentos 4 " + NumDeCompRdSoc4);
        System.out.println("Visualizacoes rede social 4 " + NumDeVisuRd4);
        System.out.println("___________________________________________________________________________");

        // *** SAIDA DE DADOS PRINCIPAL***
        System.out.println("Visualizacoes totais " + (VisAnuPrinc+VisAnu2+VisAnu3+VisAnu4));
        System.out.println("Cliques totais " + (NumDeCliq+NumDeCliq2+NumDeCliq3+NumDeCliq4));
        System.out.println("Compartilhamentos totais " + (NumDeCompRdSoc+NumDeCompRdSoc2+NumDeCompRdSoc3+NumDeCompRdSoc4));
        System.out.println("Visualizacoes rede social totais " + (NumDeVisuRd+NumDeVisuRd2+NumDeVisuRd3+NumDeVisuRd4));
        System.out.println("___________________________________________________________________________");

        scanner.close();
    }
} 