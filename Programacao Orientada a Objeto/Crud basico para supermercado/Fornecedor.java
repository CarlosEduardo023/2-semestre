
package model;


public class Fornecedor {
    private String nome;
    private String email;
    private int CodForn;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCodForn() {
        return CodForn;
    }

    public void setCodForn(int CodForn) {
        this.CodForn = CodForn;
    }
           
    
}
