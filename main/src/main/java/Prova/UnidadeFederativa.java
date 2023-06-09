
package Prova;


public enum UnidadeFederativa {
    BAHIA ("Bahia","BA"),
    SAO_PAULO ("São_paulo","SP"),
    RIO_DE_JANEIRO ("Rio_De_Janeiro","RJ");
    
protected final String nome;
protected final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
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
