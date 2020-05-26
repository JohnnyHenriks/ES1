public class Funcionario {
    private String CodFunc;
    private String Nome;
    private String Morada;
    private String Contacto;
    private int Nif;
    private String Email;

    public Funcionario(String codFunc, String nome, String morada, String contacto, int nif, String email) {
        CodFunc = codFunc;
        Nome = nome;
        Morada = morada;
        Contacto = contacto;
        Nif = nif;
        Email = email;
    }

    public String getCodFunc() {
        return CodFunc;
    }

    public void setCodFunc(String codFunc) {
        CodFunc = codFunc;
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

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public int getNif() {
        return Nif;
    }

    public void setNif(int nif) {
        Nif = nif;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
