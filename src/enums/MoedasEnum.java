package enums;

public enum MoedasEnum {

    BRL("Real Brasileiro", "BRL"), 
    USD("Dólar Americano", "USD"), 
    EUR("Euro", "EUR"), 
    GBP("Libra Esterlina", "GBP"), 
    ARS("Peso Argentino", "ARS"), 
    CLP("Peso Chileno", "CLP"), 
    CNY("Yuan Chinês", "CNY"), 
    JPY("Iene Japonês", "JPY"), 
    KRW("Won Sul-Coreano", "KRW");

    private final String nome;
    private final String sigla;

    MoedasEnum(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
}
