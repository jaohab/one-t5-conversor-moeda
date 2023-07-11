package enums;

public enum MoedasEnum {

    BRL("Real Brasileiro", "BRL"), 
    USD("Dólar Americano", "USD"), 
    EUR("Euro", "EUR"), 
    GBP("Libra Esterlina", "GBP"), 
    ARS("Peso Argentino", "ARS"), 
    CLP("Peso Chileno", "CLP"),
    JPY("Iene Japonês", "JPY"),
    CNY("Yuan Chinês", "CNY");

    private final String nome;
    private final String sigla;

    MoedasEnum(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }
    
}
