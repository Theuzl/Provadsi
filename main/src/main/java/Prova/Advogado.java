
package Prova;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String cab;

    public Advogado(String cab, String cpf, String rg, String matricula, Prova.Setor Setor, double salario, LocalDate dataNascimento, Prova.Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(cpf, rg, matricula, Setor, salario, dataNascimento, Genero, nome, telefone, email, Endereco);
        this.cab = cab;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "cab=" + cab + '}';
    }
    
    
    
}
