package vetores.pensionato;

public class Rent {
    private int numeroQuarto;
    private String nome;
    private String email;

    public Rent(String nome, String email, int numeroQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
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

    public String toString() {
        return numeroQuarto
                + ": "
                + nome
                + ", "
                + email;
    }

}
