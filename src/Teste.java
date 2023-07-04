import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import functions.ClientHTTP;
import functions.JsonParser;

public class Teste {

    public static void main(String[] args) {

        //ClientHTTP apiLink = new ClientHTTP();
        //JsonParser parser = new JsonParser();

        //String json = apiLink.findData("https://economia.awesomeapi.com.br/BRL-USD/1?format=json");
        //System.out.println(parser.Parser(json));

        //System.out.println(apiLink.findData("https://economia.awesomeapi.com.br/USD-BRL/1?format=json"));
        //System.out.println(apiLink.findData("https://economia.awesomeapi.com.br/BRL-USD/1?format=json"));
        //System.out.println(apiLink.findData("https://economia.awesomeapi.com.br/BRL-CLP/1?format=json"));

        //JOptionPane.showInputDialog(null, "Insira um valor:", "Input", 3);
        //JOptionPane.showInputDialog(null, "Insira um valor:", "Input", 3, null, args, "1");

        String valorInserido = "35.45";
        String valorMoeda = "45";
        double valorFinal = Double.valueOf(valorInserido) * Double.valueOf(valorMoeda);

        DecimalFormat formato = new DecimalFormat("##.00");
        System.out.println(formato.format(valorFinal));

    }
    
}
