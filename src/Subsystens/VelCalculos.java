package subsystens;

public class VelCalculos {

    public double calculos(double valorDigitado, String opcao1Selecionada, String opcao2Selecionada, String[] opcoes) {

        // Base km/h

        // km/h para km/h
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado;
        }
        // km/h para mph
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[1])) {
            return valorDigitado / 1.609;
        }
        // km/h para mn/h
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado * 0.539957;
        }
        // km/h para Ma
        if (opcao1Selecionada.equals(opcoes[0]) && opcao2Selecionada.equals(opcoes[3])) {
            return valorDigitado / 1216;
        }

        // Base mph

        // mph para km/h 
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado * 1.609;
        }
        // mph para mph
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[1])) {
            return valorDigitado;
        }
        // mph para mn/h
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado / 1.151;
        }
        // mph para Ma
        if (opcao1Selecionada.equals(opcoes[1]) && opcao2Selecionada.equals(opcoes[3])) {
            return valorDigitado * 0.00134935104;
        }

        // Base mn/h

        // mn para km/h
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado / 0.539957;
        }
        // mn para mph
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[1])) {
            return valorDigitado * 1.151;
        }
        // mn/h para mn/h
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado;
        }
        // mn para Ma
        if (opcao1Selecionada.equals(opcoes[2]) && opcao2Selecionada.equals(opcoes[3])) {
            return valorDigitado * 0.00155280545;
        }

        // Base Ma

        // Ma para km/h
        if (opcao1Selecionada.equals(opcoes[3]) && opcao2Selecionada.equals(opcoes[0])) {
            return valorDigitado * 1216;
        }
        // Ma para mph
        if (opcao1Selecionada.equals(opcoes[3]) && opcao2Selecionada.equals(opcoes[1])) {
            return valorDigitado / 0.00134935104;

        }
        // Ma para mn/h
        if (opcao1Selecionada.equals(opcoes[3]) && opcao2Selecionada.equals(opcoes[2])) {
            return valorDigitado / 0.00155280545;
        }
        // Ma para Ma
        if (opcao1Selecionada.equals(opcoes[3]) && opcao2Selecionada.equals(opcoes[3])) {
            return valorDigitado;
        }

        throw new RuntimeException("Erro inesperado - Nenhuma condição atendida.");

    }
}
