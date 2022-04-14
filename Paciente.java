
public class Paciente{
  String nome;
  Medico medico = new Medico();
  int diasInternado;

  Paciente(char nome, int dias){
    this.nome = nome;
    this.diasInternado = dias;
  }

  
  public void exibirRelatorioPac(){
    System.out.print("RELATÓRIO/n");
    System.out.print("Paciente:" + nome +"/n");
    System.out.print("Medico responsável: " + medico.nome + "/n");
    System.out.print("Dias Internado: "+ diasInternado + "/n");
    System.out.print("Fim ");
  }
  public int retornarDiasInternado(){
    return 1;
  }
}