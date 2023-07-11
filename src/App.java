import javax.swing.JOptionPane;

import enums.MenuPrincipalEnum;
import functions.Moeda;
import functions.Temperatura;
import functions.Velocidade;
import res.Global;

public class App {

    public static void main(String[] args) {

        final String MSG = "Escolha qual função deseja usar: ";
        final String MSG_FINAL = "<html><body width='%1s'><h1>Programa encerrado</h1>"
                            + "Esse programa foi desenvolvido por <br>"
                            + "João Henrique A. Batista, como um <br>" 
                            + "desafio proposto pelo programa de <br>"
                            + "educação ONE (Oracle Next Education).";
        boolean fechar = false;

        // Construção da lista de opções do menu

        MenuPrincipalEnum[] menuPrincipal = MenuPrincipalEnum.values();
        String[] menuPrincipalOpcoes = new String[menuPrincipal.length];
        for (int i = 0; i < menuPrincipal.length; i++) {
            menuPrincipalOpcoes[i] = menuPrincipal[i].getDescricao();
        }

        // Menu Principal

        while (!fechar) {

            String opcaoSelecionada = "";
            opcaoSelecionada += JOptionPane.showOptionDialog(null, MSG, Global.TITULO, 0, -1, null, menuPrincipalOpcoes,
                    null);

            switch (opcaoSelecionada) {
                case "0": // Conversor de moeda
                    Moeda moeda = new Moeda();
                    try {
                        moeda.conversor();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "1": // Conversor de temperatura
                    Temperatura temperatura = new Temperatura();
                    try {
                        temperatura.conversor();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2": // Conversor de velocidade
                    Velocidade velocidade = new Velocidade();
                    try {
                        velocidade.conversor();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "-1", "3": // Fechar programa
                    fechar = true;
                    break;

                default:
                    break;

            }
        }

        // Agradecimento
        JOptionPane.showMessageDialog(null, MSG_FINAL, Global.TITULO, -1);

    }
}
