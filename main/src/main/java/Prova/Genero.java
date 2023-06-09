
package Prova;


public enum Genero {
    MASCULINO ("M","Masculino"),
    FEMININO ("F","Feminino");
    
    protected char caracter;
    protected String texto;

    private Genero(String texto, String masculino) {
        this.caracter = caracter;
        this.texto = texto;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getTexto() {
        return texto;
    }


    
    
    
}
