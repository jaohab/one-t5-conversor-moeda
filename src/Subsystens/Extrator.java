package subsystens;

public class Extrator {

    public String[] extracao(String opcao1, String opcao2) {

        // Conectar e extrair dados da API

        String url = "https://economia.awesomeapi.com.br/" + opcao2 + "-" + opcao1 + "/1?format=json";            ClientHTTP apiLink = new ClientHTTP();
        String json = apiLink.findData(url);
        JsonParser parser = new JsonParser();
        return parser.Parser(json);

    }
}
