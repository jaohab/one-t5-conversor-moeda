package Subsystens;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {

    // Padrão de regex para extrair o valor "high" e criação do padrão
    private static final Pattern REGEX = Pattern.compile("\"high\":\"([^\"]+)\"|\"create_date\":\"([^\"]+)\"", Pattern.MULTILINE);

    public String[] Parser(String json) {

        // Criação do matcher para encontrar o padrão no JSON
        Matcher matcher = REGEX.matcher(json);

        // Verifica se o padrão foi encontrado e obtém o valor 
        String highValue[] = new String [2];
        for (int i = 0; i < highValue.length; i++) {
            if (matcher.find()) {
                highValue[i] = matcher.group(i+1);
            } else {
                break;
            }
        }
        return highValue;

        
        //throw new RuntimeException("Erro ao buscar o valor da moeda.");

    }
    
}
