import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String mensagem = "Escolha uma opção";
        String[] opcoes = {"Conversor de moeda", "Conversor de temperatura", "Conversor de velocidade"};
        String opcaoSeleciona = "";

        opcaoSeleciona += JOptionPane.showInputDialog(null, mensagem, "Menu", -1, null, opcoes, args);

        System.out.println(opcaoSeleciona);
        
    }
}