import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class GerarArquivoCsv {

    public void arquivoCsv(ArrayList<Candidato> candidatos){

        try{
            StringBuilder conteudo = new StringBuilder();
            StringBuilder habilidades = new StringBuilder();
            
            conteudo.append("Nome, Cpf, Sexo, DataNascimento, Logradouro, Numero, Uf, Cidade, Bairro, Celular, Email, Telefone, eWhatsapp, Empresa, Profissao, Salario, PretensaoSalarialMin, PretensaoSalarialMax, TemEmprego, Habilidades");
            conteudo.append(System.lineSeparator());

            for(Candidato candidato : candidatos){
                conteudo.append(candidato.getDadosPessoais().getNome() + ",");
                conteudo.append(candidato.getDadosPessoais().getCpf() + ",");
                conteudo.append(candidato.getDadosPessoais().getSexo() + ",");
                conteudo.append(candidato.getDadosPessoais().getDataNascimento() + ",");

                conteudo.append(candidato.getDadosEndereco().getLogradouro() + ",");
                conteudo.append(candidato.getDadosEndereco().getNumero() + ",");
                conteudo.append(candidato.getDadosEndereco().getUf() + ",");
                conteudo.append(candidato.getDadosEndereco().getCidade() + ",");
                conteudo.append(candidato.getDadosEndereco().getBairro() + ",");

                conteudo.append(candidato.getDadosContato().getCelular() + ",");
                conteudo.append(candidato.getDadosContato().getEmail() + ",");
                conteudo.append(candidato.getDadosContato().getTelefone() + ",");
                conteudo.append(candidato.getDadosContato().isEWhatsapp() + ",");

                conteudo.append(candidato.getDadosProfissionais().getEmpresa() + ",");
                conteudo.append(candidato.getDadosProfissionais().getProfissao() + ",");
                conteudo.append(candidato.getDadosProfissionais().getSalario()+ ",");
                conteudo.append(candidato.getDadosProfissionais().getPretensaoSalarialMin() + ",");
                conteudo.append(candidato.getDadosProfissionais().getPretensaoSalarialMax() + ",");
                conteudo.append(candidato.getDadosProfissionais().isTemEmprego() + ",");
                
                for(String habilidade : candidato.getDadosProfissionais().getHabilidades()) {
                    habilidades.append(habilidade + ";");
                }

                conteudo.append(habilidades);

                conteudo.append(System.lineSeparator());
            }

            System.out.println(conteudo.toString());
            Path caminhoArquivoCsv = Paths.get("C:\\Users\\Mariana\\Desktop\\java-mjv\\mjv-java-school\\candidatos.csv");

            Files.write(caminhoArquivoCsv, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
