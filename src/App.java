import javax.swing.JOptionPane;

import enums.MenuPrincipalEnum;
import functions.Moeda;
import functions.Temperatura;
import functions.Velocidade;
import res.Global;

public class App {

    public static void main(String[] args) {

        // Construção da lista de opções do menu

        MenuPrincipalEnum[] menuPrincipal = MenuPrincipalEnum.values();
        String[] menuPrincipalOpcoes = new String[menuPrincipal.length];
        for (int i = 0; i < menuPrincipal.length; i++) {
            menuPrincipalOpcoes[i] = menuPrincipal[i].getDescricao();
        }

        // Menu Principal

        final String MSG = "Escolha qual função deseja usar: ";
        boolean fechar = false;

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
        JOptionPane.showMessageDialog(null, "AVISO_MENSAGEM", Global.TITULO, 0);

    }
}
