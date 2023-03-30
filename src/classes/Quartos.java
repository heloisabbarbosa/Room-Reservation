package classes;

public class Quartos {
    private String nome;
    private String email;
    private double numero;
    private int numero1;

    public Quartos(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public String getNome() {
        return nome;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override

    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome: " + nome + "\nEmail: " + email;
    }

}
