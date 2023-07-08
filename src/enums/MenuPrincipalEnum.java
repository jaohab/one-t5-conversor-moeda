package enums;
public enum MenuPrincipalEnum {

    MOEDA(0, "Conversor de moeda"), 
    TEMPERATURA(1, "Conversor de temperatura"), 
    VELOCIDADE(2, "Conversor de velocidade"),
    FECHAR(3, "Fechar programa");

    private final int id;
    private final String descricao;

    MenuPrincipalEnum(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return this.id;    }

    public String getDescricao() {
        return this.descricao;
    }
    
}
