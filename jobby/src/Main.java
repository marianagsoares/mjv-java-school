import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidato> listaCandidatos = new ArrayList<>();

        GerarArquivoCsv gerarArquivoCsv = new GerarArquivoCsv();

        //PRIMEIRO CANDIDATO

        LocalDate dataNascimentoC1 = LocalDate.of(1999, 12, 05);
        DadosPessoais dadosPessoaisC1 = new DadosPessoais("Fernando Zoe", "21758479000", dataNascimentoC1, Sexo.MASCULINO);

        DadosEndereco dadosEnderecoC1 = new DadosEndereco("Avenida Mascarenhas", 45, "Casa", "Jardim Atlântico", "Olinda", "PE");

        DadosContato dadosContatoC1 = new DadosContato("fernando@gmail.com", "33773291", "81999805578");

        ArrayList<String> habilidadesC1 = new ArrayList<>();
        habilidadesC1.add("Java");
        habilidadesC1.add("Postgree");
        DadosProfissionais dadosProfissionaisC1 = new DadosProfissionais("Programador", "LTDH", 3.500, true, habilidadesC1, 3.500, 5.500);

        Candidato c1 = new Candidato(dadosPessoaisC1, dadosEnderecoC1, dadosContatoC1, dadosProfissionaisC1);
        listaCandidatos.add(c1);

        //SEGUNDO CANDIDATO

        LocalDate dataNascimentoC2 = LocalDate.of(1978, 12, 22);
        DadosPessoais dadosPessoaisC2 = new DadosPessoais("Tales Soares", "27121091046", dataNascimentoC2, Sexo.MASCULINO);

        DadosEndereco dadosEnderecoC2 = new DadosEndereco("Avenida Domingos Ferreira", 327, "Apartamento 303", "Piedade", "Jaboatão dos Guararapes", "PE");

        DadosContato dadosContatoC2 = new DadosContato("tales@gmail.com", "337778855", "8187885623");

        ArrayList<String> habilidadesC2 = new ArrayList<>();
        habilidadesC2.add("HTML");
        habilidadesC2.add("CSS");
        DadosProfissionais dadosProfissionaisC2 = new DadosProfissionais("Programador Front-end", "Digital Life", 0, false, habilidadesC2, 3.000, 5.500);

        Candidato c2 = new Candidato(dadosPessoaisC2, dadosEnderecoC2, dadosContatoC2, dadosProfissionaisC2);
        listaCandidatos.add(c2);

        gerarArquivoCsv.arquivoCsv(listaCandidatos);
    }
}
