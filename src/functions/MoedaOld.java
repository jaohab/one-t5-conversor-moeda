package functions;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import Subsystens.ClientHTTP;
import Subsystens.JsonParser;
import enums.MoedasEnum;

public class MoedaOld {

    public void ConversorMoedas() {

    String suaMoeda = "";
    String suaMoedaSigla = "";
    String moedaConversao = "";
    String moedaConversaoSigla = "";
    String valorInserido = "";

    // Construção da lista de oções do menu
    MoedasEnum[] moedasLista = MoedasEnum.values();
    String[] opcoes = new String[moedasLista.length];
    for (int i = 0; i < moedasLista.length; i++) {
        opcoes[i] = moedasLista[i].getNome();
    }

    while(true) {
        suaMoeda = "";
        suaMoedaSigla = "";
        moedaConversao = "";
        moedaConversaoSigla = "";
        valorInserido = "";

        // Sua moeda
        suaMoeda += JOptionPane.showInputDialog(null, "Selecione a sua moeda", "Menu", -1, null, opcoes, opcoes[0]);


        // Recupera a sigla da moeda
        for (MoedasEnum moedas : moedasLista) {
            if (moedas.getNome().equals(suaMoeda)) {
                suaMoedaSigla = moedas.getSigla();
                break;
            }
        }

        // Valor
        valorInserido += JOptionPane.showInputDialog(null, "Insira um valor:", "Input", 3);

        // Moeda de conversão
        moedaConversao += JOptionPane.showInputDialog(null, "Selecione para qual moeda você quer converter", "Menu", -1, null, opcoes, opcoes[0]);

        // Recupera a sigla da moeda
        for (MoedasEnum moedas : moedasLista) {
            if (moedas.getNome().equals(moedaConversao)) {
                moedaConversaoSigla = moedas.getSigla();
                break;
            }
        }

        // Verifica se as moedas não são iguais
        if (suaMoeda.equals(moedaConversao)) {
            JOptionPane.showConfirmDialog(null, "Você precisa selecionar moedas diferentes.", "Aviso", -1, 0, null);
        } else {
            break;
        }
    }
    
    // Conectar e extrair dados da API
    String url = "https://economia.awesomeapi.com.br/" + moedaConversaoSigla + "-" + suaMoedaSigla + "/1?format=json";
    ClientHTTP apiLink = new ClientHTTP();
    JsonParser parser = new JsonParser();

    String json = apiLink.findData(url);
    String dados[] = parser.Parser(json);

    String valorMoeda = dados[0];
    String horaCotacao = dados[1];

    System.out.println(valorMoeda);
    System.out.println(valorInserido);

    // Cálculo
    double valorFinal = Double.valueOf(valorInserido) / Double.valueOf(valorMoeda);
    DecimalFormat formato = new DecimalFormat("##.00");
    System.out.println(formato.format(valorFinal));

    // Resutado
    String resultado = "Conversão de " + suaMoeda + " para " + moedaConversao + 
                        "\n\n" +
                        moedaConversaoSigla + "1,00 = " + suaMoedaSigla + " " + formato.format(Double.valueOf(valorMoeda)) +
                        "\n" +
                        suaMoedaSigla + " " + formato.format(Double.valueOf(valorInserido)) + " = " + moedaConversaoSigla + " " + formato.format(valorFinal) +
                        "\n\n" +
                        "Dados obtidos: " + horaCotacao;    

    JOptionPane.showConfirmDialog(null, resultado, "Resultado", -1, -1, null);

    //System.out.println("Sua moeda (1ª entrada): " + suaMoeda);
    //System.out.println("Moeda de conversão (2ª entrada): " + moedaConversao);
    //System.out.println("Valor resgatado pela API da moeda de conversão: " + valorMoeda);
    //System.out.println("Valor inserido pelo usuario referente a sua moeda: " + valorInserido);
    //System.out.println("Resultado da conversão: " + formato.format(valorFinal));
    //System.out.println(resultado);

    }
    
}
