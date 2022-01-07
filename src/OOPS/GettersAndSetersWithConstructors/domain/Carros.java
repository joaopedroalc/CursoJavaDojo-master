package OOPS.GettersAndSetersWithConstructors.domain;

public class Carros {
    private String marca;
    private String modelo;
    private int ano;

    public void imprime(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
    }

    public Carros(String marca) {
        this.marca = marca;
    }

    public Carros() {

    }

    public Carros(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
