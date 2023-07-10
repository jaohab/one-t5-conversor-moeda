package Subsystens;

public class MoedaCalculos {

    public double calculos(double valorDigitado, String opcao1Selecionada, String opcao2Selecionada, String[] opcoes) {

        // Moedas iguais

        if (opcao1Selecionada.equals(opcao2Selecionada)) {
            return valorDigitado;
        }

        // Conversões de USD

        if (opcao1Selecionada.equals("USD") || opcao2Selecionada.equals("USD")) {
            return valorDigitado;
        }

        throw new RuntimeException("Erro inesperado - Nenhuma condição atendida.");

    }
}
