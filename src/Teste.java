

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import res.Global;

public class Teste {

    public static void main(String[] args) {

        String[] opcoes = {"Sim", "Não"};

        JOptionPane.showMessageDialog(null, "Ação incorreta", Global.TITULO, 3);
        System.out.println(JOptionPane.showOptionDialog(null, "Deseja fazer outra conversão?", Global.TITULO, 0, 3, null, opcoes, null));

        JPanel quadro = new JPanel();
        JLabel txt1 = new JLabel("Converter ");
        JTextField valor = new JTextField(3);
        JLabel txt2 = new JLabel(" para ");
        JComboBox<String> opcoesLista1 = new JComboBox<String>(opcoes);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(opcoes);
        JLabel txt3 = new JLabel("<html><body width='%1s'><p>km/h - Quilômentros por hora<br>mph - Milhas por hora<br>mn - Nós (Milhas náutica por hora)<br>Ma - Número de Mach</p>");

        quadro.add(txt1);
        quadro.add(valor);
        quadro.add(opcoesLista1);
        quadro.add(txt2);
        quadro.add(opcoesLista2);
        quadro.add(txt3);

        JOptionPane.showOptionDialog(null, quadro, Global.TITULO, JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);


    }
    
}
