package functions;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import interfaces.Conversores;
import res.Global;

public class Velocidade implements Conversores {

    @Override
    public void conversor() {

        double valorDigitado;
        String opcao1Selecionada;
        String opcao2Selecionada;
        int botaoPressionado;
        double resultado = 0;

        // Construção do quadro de opções

        String[] botao = { "Converter" };
        String[] botoesConfirmacao = { "Sim", "Não" };
        String[] opcoes = { "km/h", "mph", "mn", "Ma" };
        String avisoMensagem = "Apenas números podem ser inseridos.\nPara inserir casas decimais utilize ponto (.)";

        JPanel quadro = new JPanel();
        JLabel txt1 = new JLabel("Converter ");
        JTextField valor = new JTextField(3);
        JLabel txt2 = new JLabel(" para ");
        JComboBox<String> opcoesLista1 = new JComboBox<String>(opcoes);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(opcoes);
        JLabel txt3 = new JLabel(
                "<html><body width='%1s'><p>km/h - Quilômentros por hora<br>mph - Milhas por hora<br>mn - Nós (Milhas náutica por hora)<br>Ma - Número de Mach</p>");

        quadro.add(txt1);
        quadro.add(valor);
        quadro.add(opcoesLista1);
        quadro.add(txt2);
        quadro.add(opcoesLista2);
        quadro.add(txt3);

        // Início da função

        while (true) {

            // Exibir quadro e coletar dados do usuário

            while (true) {
                botaoPressionado = JOptionPane.showOptionDialog(null, quadro, Global.TITULO, JOptionPane.NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, botao, null);
                
                if (botaoPressionado == 0) { // Botão "CONVERTER" pressionado

                    try {
                        valorDigitado = Double.valueOf(valor.getText());
                        opcao1Selecionada = (String) opcoesLista1.getSelectedItem();
                        opcao2Selecionada = (String) opcoesLista2.getSelectedItem();
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, avisoMensagem, Global.TITULO, 0);
                        valor.setText("");
                    }
                
                } else { // Botão "FECHAR" pressionado
                    throw new RuntimeException("Função encerrada.");
                }
            }

            // Calcular resultados


            
            // Exibir resultado



            // Continuar ou sair da função

            botaoPressionado = JOptionPane.showOptionDialog(null, "Deseja fazer outra conversão?", Global.TITULO, 0, 3,
                    null, botoesConfirmacao, null);

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
