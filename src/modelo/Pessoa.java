package modelo;

public class Pessoa {

    public String nome;
    public Float peso;
    public Float altura;
    public Double imc;

    public Pessoa(String nome, Float peso, Float altura) {

        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }
}
