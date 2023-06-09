
package Prova;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa{
    protected LocalDate dataNascimento;
    protected Genero Genero;

    public Fisica(LocalDate dataNascimento, Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(nome, telefone, email, Endereco);
        this.dataNascimento = dataNascimento;
        this.Genero = Genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero Genero) {
        this.Genero = Genero;
    }
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    

    @Override
    public String toString() {
        return super.toString()+
                "/n dataNascimento=" + dataNascimento +
                "/n Genero=" + Genero + '}';
    }
    
    
}
