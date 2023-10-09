import Entidades.Computador;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.janelas.Janela;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.sistema.Sistema;
import DataAcessObject.ComputadorDAO;

public class App {
    public static void main(String[] args) {
        Looca looca = new Looca();

        Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        DiscoGrupo disco = looca.getGrupoDeDiscos();

        Computador computador = new Computador();

        String SO = sistema.getSistemaOperacional();
        Long memoriaUso = memoria.getEmUso();
        Long discoUso = disco.getTamanhoTotal();

        computador.setSistemaOperacional(SO);
        computador.setDiscoUso(discoUso);
        computador.setMemoriaUso(memoriaUso);

        ComputadorDAO.cadastrarComputador(computador);

        System.out.println(sistema);
        System.out.println(memoria);
        System.out.println("O tamanho do disco é: "+disco.getTamanhoTotal());

    }
}
