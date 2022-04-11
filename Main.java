import java.util.ArrayList;

public class Main{

  public static void main(String[] args){
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
    ArrayList<Onibus> onibus = new ArrayList<Onibus>();
   

    veiculos.add(new Veiculo("XPO-0897",2010));
    veiculos.add(new Veiculo("ABC-1234",2012));
    veiculos.add(new Onibus("KYX-0897",2014,10));
    veiculos.add(new Caminhao("NZT-3028",2014,5));
    veiculos.add(new Caminhao("HJU-3341",2000,7));

    

    for (Veiculo veiculo: veiculos){
      veiculo.exibirDados();
    }

    for (Caminhao caminhao: caminhoes){
      caminhao.exibirDados();
    }

    }
}