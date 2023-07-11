package Subsystens;

public class MoedaCalculos {

    public double calculos(double valorDigitado, String opcao1Selecionada, String opcao2Selecionada, String[] opcoes) {

        Extrator extrator = new Extrator();

        // Moedas iguais

        if (opcao1Selecionada.equals(opcao2Selecionada)) {
            return valorDigitado;
        }

        // Conversões de USD

        if (opcao1Selecionada.equals("USD") || opcao2Selecionada.equals("USD")) {
            
            String dados[] = extrator.extracao(opcao1Selecionada, opcao2Selecionada);
       
            return Double.valueOf(valorDigitado) / Double.valueOf(dados[0]);
        }

        // Conversões de BRL

        if (opcao1Selecionada.equals("BRL") || opcao2Selecionada.equals("BRL")) {
            
            String dados[] = extrator.extracao(opcao1Selecionada, opcao2Selecionada);
       
            return Double.valueOf(valorDigitado) / Double.valueOf(dados[0]);
        }

        // Outras Conversões

        String dados1[] = extrator.extracao("USD", opcao2Selecionada);
        String dados2[] = extrator.extracao(opcao1Selecionada, "USD");

        return (Double.valueOf(valorDigitado) / Double.valueOf(dados1[0]) / Double.valueOf(dados2[0]));

    }
}
