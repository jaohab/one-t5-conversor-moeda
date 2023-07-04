package functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {

    // Padrão de regex para extrair o valor "high" e criação do padrão
    private static final Pattern REGEX = Pattern.compile("\"high\":\"([^\"]+)\"");

    public String Parser(String json) {

        // Criação do matcher para encontrar o padrão no JSON
        Matcher matcher = REGEX.matcher(json);

        // Verifica se o padrão foi encontrado e obtém o valor 
        if (matcher.find()) {
            String highValue = matcher.group(1);
            return highValue;
        }
        
        throw new RuntimeException("Erro ao buscar o valor da moeda.");

    }
    
}
