package functions;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Subsystens.MoedaCalculos;
import enums.MoedasEnum;
import interfaces.Conversores;
import res.Global;

public class Moeda implements Conversores {

    @Override
    public void conversor() {

        double valorDigitado;
        String opcao1Selecionada;
        String opcao1SelecionadaSigla = "";
        String opcao2Selecionada;
        String opcao2SelecionadaSigla = "";
        int botaoPressionado;
        double resultado = 0;

        DecimalFormat formato = new DecimalFormat("##.00");

        // Construção da lista de opções do menu

        MoedasEnum[] moedasLista = MoedasEnum.values();
        String[] opcoes = new String[moedasLista.length];
        for (int i = 0; i < moedasLista.length; i++) {
            opcoes[i] = moedasLista[i].getNome();
        }

        // Construção do quadro de opções

        final String[] BOTAO = { "Converter" };
        final String[] BOTOES_CONFIRMACAO = { "Sim", "Não" };
        final String AVISO_MENSAGEM = "Apenas números podem ser inseridos.\nPara inserir casas decimais utilize ponto (.)";

        JPanel quadro = new JPanel();
        JLabel txt1 = new JLabel("Converter ");
        JTextField valor = new JTextField(3);
        JLabel txt2 = new JLabel(" para ");
        JComboBox<String> opcoesLista1 = new JComboBox<String>(opcoes);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(opcoes);

        quadro.add(txt1);
        quadro.add(valor);
        quadro.add(opcoesLista1);
        quadro.add(txt2);
        quadro.add(opcoesLista2);

        // Início da função

        while (true) {

            // Exibir quadro e coletar dados do usuário

            while (true) {
                botaoPressionado = JOptionPane.showOptionDialog(null, quadro, Global.TITULO, JOptionPane.NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, BOTAO, null);

                if (botaoPressionado == 0) { // Botão "CONVERTER" pressionado

                    try {
                        valorDigitado = Double.valueOf(valor.getText());
                        opcao1Selecionada = (String) opcoesLista1.getSelectedItem();
                        opcao2Selecionada = (String) opcoesLista2.getSelectedItem();
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, AVISO_MENSAGEM, Global.TITULO, 0);
                        valor.setText("");
                    }
    
                } else { // Botão "FECHAR" pressionado
                    throw new RuntimeException("Função encerrada.");
                }
            }

            // Recuprar siglas

            // Recupera a sigla da moeda
            for (MoedasEnum moedas : moedasLista) {
                if (moedas.getNome().equals(opcao1Selecionada)) {
                    opcao1SelecionadaSigla = moedas.getSigla();
                }
                if (moedas.getNome().equals(opcao2Selecionada)) {
                    opcao2SelecionadaSigla = moedas.getSigla();
                }
            }

            // Calcular resultados

            MoedaCalculos mcalc = new MoedaCalculos();
            resultado = mcalc.calculos(valorDigitado, opcao1SelecionadaSigla, opcao2SelecionadaSigla, opcoes);

            // Exibir resultado

            System.out.println(formato.format(resultado));

            // Continuar ou sair da função

            botaoPressionado = JOptionPane.showOptionDialog(null, "Deseja fazer outra conversão?", Global.TITULO, 0, 3,
                    null, BOTOES_CONFIRMACAO, null);

            if (botaoPressionado != 0) { // Sair
                break;
            } else { // Limpar campos antes de recomeçar
                valor.setText("");
                opcoesLista1.setSelectedItem(opcoes[0]);
                opcoesLista2.setSelectedItem(opcoes[0]);
            }
        }
    }
}
