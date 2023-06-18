public class DadosContato {

    private String email;
    private String telefone;
    private String celular;

    private boolean eWhatsapp;

    public DadosContato(String email, String telefone, String celular, boolean eWhatsapp){
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.eWhatsapp = eWhatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEWhatsapp() {
        return eWhatsapp;
    }

    public void setEWhatsapp(boolean eWhatsapp) {
        this.eWhatsapp = eWhatsapp;
    }
}
