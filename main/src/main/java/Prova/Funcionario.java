
package Prova;

import java.time.LocalDate;


public abstract class Funcionario extends Fisica{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor Setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor Setor, double salario, LocalDate dataNascimento, Prova.Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(dataNascimento, Genero, nome, telefone, email, Endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.Setor = Setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return Setor;
    }

    public void setSetor(Setor Setor) {
        this.Setor = Setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    @Override
    public String toString() {
        return super.toString()+
                "/n cpf=" + cpf +
                "/n rg=" + rg +
                "/n matricula=" + matricula +
                "/n Setor=" + Setor +
                "/n salario=" + salario + '}';
    }
    
    
    
}
