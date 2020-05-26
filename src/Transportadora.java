public class Transportadora {
    private int IdTransp;
    private String Nome;
    private String Contacto;
    private String Email;

    public Transportadora(int idTransp, String nome, String contacto, String email) {
        IdTransp = idTransp;
        Nome = nome;
        Contacto = contacto;
        Email = email;
    }

    public int getIdTransp() {
        return IdTransp;
    }

    public void setIdTransp(int idTransp) {
        IdTransp = idTransp;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
