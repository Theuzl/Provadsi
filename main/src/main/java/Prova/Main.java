

package Prova;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {
        System.out.println("Juridica");
        Juridica juridica = new Juridica("657.874.673/787/873", "LTD VIVO", "João Gomes", "71986876685", "matheuscapitu1872@gmail.com",
        new Endereco("Casa", "7", "rua lisboa", "40320-510", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(juridica);
        
        System.out.println("");

        System.out.println("Cliente");
        Cliente cliente = new Cliente(89, LocalDate.of(1987, Month.MARCH, 5), Genero.FEMININO, "Lucas", "71986876685", "matheuscapitu1872@gmail.com",
        new Endereco("Casa", "8", "rua santana", "40320510", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("");
        
        Medico medico = new Medico("879", "081755502592", "837773738232", "87273", Setor.SAUDE, 9182, LocalDate.of(2001, Month.MARCH, 5), Genero.FEMININO, "Melissa", "719868756685", "melissacapitu1872@gmail.com",
        new Endereco("Casa", "8", "perto da padaria", "5948854", "salvador", UnidadeFederativa.BAHIA));
        
        Motoboy motoboy = new Motoboy("873", "08175502592", "83473474334", "09966", Setor.SAUDE, 2000, LocalDate.of(1999, Month.MARCH, 7), Genero.FEMININO, "LILIA", "719868766584", "liliacapitu1872@gmail.com",
        new Endereco("Casa", "9", "perto do dique", "40320512", "Salvador", UnidadeFederativa.BAHIA));
        
       Advogado advogado = new Advogado("teste", "928383834834", "8343884343", "883834", Setor.SAUDE, 8993, LocalDate.of(1982, Month.MARCH, 9), Genero.FEMININO, "Railane", "71986876685", "railanecapitu87272@gmail.com",
       new Endereco("Casa", "2", "perto da rua de marcio mello", "8732723", "Salvador", UnidadeFederativa.BAHIA));
        
        
        
              
        
        
    }
}
