package features;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import enums.MoedasEnum;
import functions.ClientHTTP;
import functions.JsonParser;

public class Moeda {

    public void ConversorMoedas() {

    String suaMoeda = "";
    String moedaConversao = "";
    String valorInserido = "";

    // Construção da lista de oções do menu
    MoedasEnum[] moedasLista = MoedasEnum.values();
    String[] opcoes = new String[moedasLista.length];
    for (int i = 0; i < moedasLista.length; i++) {
        opcoes[i] = moedasLista[i].getNome();
    }

    while(true) {
        suaMoeda = "";
        moedaConversao = "";
        valorInserido = "";

        // Sua moeda
        suaMoeda += JOptionPane.showInputDialog(null, "Selecione a sua moeda", "Menu", -1, null, opcoes, opcoes[0]);

        // Recupera a sigla da moeda
        for (MoedasEnum moedas : moedasLista) {
            if (moedas.getNome().equals(suaMoeda)) {
                suaMoeda = moedas.getSigla();
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
                moedaConversao = moedas.getSigla();
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

    // Construção da URL da API
    String url = "https://economia.awesomeapi.com.br/" + moedaConversao + "-" + suaMoeda + "/1?format=json";
    
    // Conectar e extrair dados da API
    ClientHTTP apiLink = new ClientHTTP();
    JsonParser parser = new JsonParser();

    String json = apiLink.findData(url);
    String valorMoeda = parser.Parser(json);

    

    System.out.println(valorMoeda);
    System.out.println(valorInserido);

    // Cálculo
    double valorFinal = Double.valueOf(valorInserido) * Double.valueOf(valorMoeda);
    DecimalFormat formato = new DecimalFormat("##.00");
    System.out.println(formato.format(valorFinal));


    }
    
}
