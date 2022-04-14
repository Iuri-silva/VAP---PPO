public class ala{
  int id;
  char especialidade;
  Quarto quarto = new Quarto();

  Ala(int id, char espec){
    this.id = id;
    this.especialidade = espec;
  }

  public void exibirRelatorio(){
    System.out.print("ID: "+id+"/n");
    System.out.print("Especialidade: "+diasInternado+ "/n");
    quarto.verificarQuartoVazio();
  }
}