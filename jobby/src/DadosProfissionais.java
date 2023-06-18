import java.util.ArrayList;

public class DadosProfissionais {

    private String profissao;
    private String empresa;
    private double salario;
    private boolean temEmprego;
    private ArrayList<String> habilidades;
    private double pretensaoSalarialMin;
    private double pretensaoSalarialMax;

    public DadosProfissionais(String profissao, String empresa, double salario, boolean temEmprego, ArrayList<String> habilidades, double pretensaoSalarialMin, double pretensaoSalarialMax) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.setSalario(salario);
        this.temEmprego = temEmprego;
        this.habilidades = habilidades;
        this.pretensaoSalarialMin = pretensaoSalarialMin;
        this.pretensaoSalarialMax = pretensaoSalarialMax;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(!this.temEmprego)
            this.salario = 0;
        else
            this.salario = salario;
    }

    public boolean isTemEmprego() {
        return temEmprego;
    }

    public void setTemEmprego(boolean temEmprego) {
        this.temEmprego = temEmprego;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public double getPretensaoSalarialMin() {
        return pretensaoSalarialMin;
    }

    public void setPretensaoSalarialMin(double pretensaoSalarialMin) {
        this.pretensaoSalarialMin = pretensaoSalarialMin;
    }

    public double getPretensaoSalarialMax() {
        return pretensaoSalarialMax;
    }

    public void setPretensaoSalarialMax(double pretensaoSalarialMax) {
        this.pretensaoSalarialMax = pretensaoSalarialMax;
    }
}
