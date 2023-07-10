package Subsystens;

public class TempCalculos {

    public double calculos(double valorDigitado, String opcao1Selecionada, String opcao2Selecionada, String[] opcoes) {

        // Base Celsius

        // Celsius para Celsius
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado;
        }
        // Celsius para Fahrenheit
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[1])) {
            return (valorDigitado * 1.8) + 32d;
        }
        // Celsius para Kelvin
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado + 273.15;
        }

        // Base Fahrenheit

        // Fahrenheit para Celsius
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[0])) {
            return (valorDigitado - 32) / 1.8;
        }
        // Fahrenheit para Fahrenheit
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[1])) {
            return valorDigitado;
        }
        // Fahrenheit para Kelvin
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[2])) {
            return ((valorDigitado - 32) / 1.8) + 273.15;
        }

        // Base Kelvin

        // Kelvin para Celsius
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado - 273.15;
        }
        // Kelvin para Fahrenheit
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[1])) {
            return ((valorDigitado - 273.15) * 1.8) + 32;
        }
        // Kelvin para Kelvin
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado;
        }

        throw new RuntimeException("Erro inesperado - Nenhuma condição atendida.");

    }
}
