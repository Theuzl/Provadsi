
package Prova;

import java.time.LocalDate;


public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Prova.Setor Setor, double salario, LocalDate dataNascimento, Prova.Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(cpf, rg, matricula, Setor, salario, dataNascimento, Genero, nome, telefone, email, Endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + '}';
    }
    
}
