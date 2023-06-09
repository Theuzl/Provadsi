
package Prova;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco Endereco;

    public Pessoa(String nome, String telefone, String email, Endereco Endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Endereco = Endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return super.toString()+
                "/n nome=" + nome +
                "/n telefone=" + telefone +
                "/n email=" + email +
                "/n Endereco=" + Endereco + '}';
    }

   

  
}
