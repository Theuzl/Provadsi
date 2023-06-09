
package Prova;


public class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(nome, telefone, email, Endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return  "/n Juridica{" + "cnpj=" + cnpj +
                "/n inscricaoEstadual=" + inscricaoEstadual + '}';
    }
    
    
    
}
