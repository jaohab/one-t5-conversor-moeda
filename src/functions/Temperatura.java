package functions;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Subsystens.TempCalculos;
import interfaces.Conversores;
import res.Global;

public class Temperatura implements Conversores {

    @Override
    public void conversor() {

        double valorDigitado;
        String opcao1Selecionada;
        String opcao2Selecionada;
        int botaoPressionado;
        double resultado = 0;

        DecimalFormat formato = new DecimalFormat("##.00");

        // Construção do quadro de opções

        final String[] BOTAO = { "Converter" };
        final String[] BOTOES_CONFIRMACAO = { "Sim", "Não" };
        final String[] OPCOES = { "Celsius", "Fahrenheit", "Kelvin" };
        final String AVISO_MENSAGEM = "Apenas números podem ser inseridos.\nPara inserir casas decimais utilize ponto (.)";

        JPanel quadro = new JPanel();
        JLabel txt1 = new JLabel("Converter ");
        JTextField valor = new JTextField(3);
        JLabel txt2 = new JLabel(" para ");
        JComboBox<String> opcoesLista1 = new JComboBox<String>(OPCOES);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(OPCOES);

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

            // Calcular resultados

            TempCalculos tcalc = new TempCalculos();
            resultado = tcalc.calculos(valorDigitado, opcao1Selecionada, opcao2Selecionada, OPCOES);

            // Exibir resultado

            String resultadoFinal = formato.format(valorDigitado) + " " + opcao1Selecionada + " é igual a "
                    + formato.format(resultado) + " " + opcao2Selecionada + ".";
            JOptionPane.showMessageDialog(null, resultadoFinal, Global.TITULO, -1);

            // Continuar ou sair da função

            botaoPressionado = JOptionPane.showOptionDialog(null, "Deseja fazer outra conversão?", Global.TITULO, 0, 3,
                    null, BOTOES_CONFIRMACAO, null);

            if (botaoPressionado != 0) { // Sair
                break;
            } else { // Limpar campos antes de recomeçar
                valor.setText("");
                opcoesLista1.setSelectedItem(OPCOES[0]);
                opcoesLista2.setSelectedItem(OPCOES[0]);
            }
        }
    }
}
