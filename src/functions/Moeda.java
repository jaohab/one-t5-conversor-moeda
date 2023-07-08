package functions;

import javax.swing.JOptionPane;

import enums.MoedasEnum;
import interfaces.Conversores;
import res.Global;

public class Moeda implements Conversores {

    @Override
    public void conversor() {

        String suaMoeda = "";
        System.out.println(suaMoeda);
        String suaMoedaSigla = "";
        String moedaConversao = "";
        String moedaConversaoSigla = "";
        String valorInserido = "";



        // Construção da lista de oções do menu

        MoedasEnum[] moedas = MoedasEnum.values();
        String[] moedasOpcoes = new String[moedas.length];
        for (int i = 0; i < moedas.length; i++) {
            moedasOpcoes[i] = moedas[i].getNome();
        }



        // 1º - Moeda base (sua moeda)

        suaMoeda += JOptionPane.showInputDialog(null, "Selecione a sua moeda", Global.TITULO, -1, null, moedasOpcoes, moedasOpcoes[0]);

        System.out.println(suaMoeda);

        if (suaMoeda.equals(null)) {
            throw new RuntimeException("Função encerrada.");
        }

        System.out.println("continua...");


        

    }
    
}
