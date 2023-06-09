
package Prova;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Prova.Setor Setor, double salario, LocalDate dataNascimento, Prova.Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(cpf, rg, matricula, Setor, salario, dataNascimento, Genero, nome, telefone, email, Endereco);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motoboy{");
        sb.append("cnh=").append(cnh);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
