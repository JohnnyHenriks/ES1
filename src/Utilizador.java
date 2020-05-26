public class Utilizador {
    private int Id;
    private String Nome;
    private String Morada;
    private String Email;
    private int Nif;

    public Utilizador(int id, String nome, String morada, String email, int nif) {
        Id = id;
        Nome = nome;
        Morada = morada;
        Email = email;
        Nif = nif;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String morada) {
        Morada = morada;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNif() {
        return Nif;
    }

    public void setNif(int nif) {
        Nif = nif;
    }
}
