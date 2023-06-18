package Entidades;

public class Candidato {
    private DadosPessoais dadosPessoais;
    private DadosEndereco dadosEndereco;
    private DadosContato dadosContato;
    private DadosProfissionais dadosProfissionais;

    public Candidato(DadosPessoais dadosPessoais, DadosEndereco dadosEndereco, DadosContato dadosContato, DadosProfissionais dadosProfissionais) {
        this.dadosPessoais = dadosPessoais;
        this.dadosEndereco = dadosEndereco;
        this.dadosContato = dadosContato;
        this.dadosProfissionais = dadosProfissionais;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public DadosEndereco getDadosEndereco() {
        return dadosEndereco;
    }

    public void setDadosEndereco(DadosEndereco dadosEndereco) {
        this.dadosEndereco = dadosEndereco;
    }

    public DadosContato getDadosContato() {
        return dadosContato;
    }

    public void setDadosContato(DadosContato dadosContato) {
        this.dadosContato = dadosContato;
    }

    public DadosProfissionais getDadosProfissionais() {
        return dadosProfissionais;
    }

    public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
    }
}
