
package Prova;

import java.time.LocalDate;

public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Prova.Genero Genero, String nome, String telefone, String email, Prova.Endereco Endereco) {
        super(dataNascimento, Genero, nome, telefone, email, Endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "protocoloAtendimento=" + protocoloAtendimento + '}';
    }
    
    
    
}
