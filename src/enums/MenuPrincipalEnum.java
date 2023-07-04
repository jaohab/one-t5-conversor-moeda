package enums;
public enum MenuPrincipalEnum {

    MOEDA("Conversor de moeda"), 
    TEMPERATURA("Conversor de temperatura"), 
    VELOCIDADE("Conversor de velocidade"),
    FECHAR("Fechar programa");

    private final String opcao;

    MenuPrincipalEnum(String opcao) {
        this.opcao = opcao;
    }

    public String getOpcao() {
        return opcao;
    }
    
}
