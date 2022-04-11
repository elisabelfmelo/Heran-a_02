public class Caminhao extends Veiculo{
  private int eixos;

  public Caminhao(String placa,int ano,int eixos){
    super(placa,ano);
    this.eixos = eixos;
  }

  public Caminhao(){
    
  }

  public int getEixos(){
    return eixos;
  }

  public void setEixos(int eixos){
    this.eixos = eixos;
  }
  
  public void exibirDados(){
    System.out.println("\n Caminhão:\n Placa do veículo: "+placa+"\n Ano de fabricação: "+ano+"\n Quantidade de eixos: "+eixos);
  }
  
  
}