public class Ala {

    String especialidade;
      int id;
    
Quarto quarto = new Quarto();

    Ala(int id, String espc){
      
        this.id = id;
      
        this.especialidade = espc;

    }

  
    public void Relatorio() {
        System.out.print("ID: " + id + "\n");
      
        System.out.print("Especialidade: " + especialidade + "\n");
        quarto.Vazio();
    }
}
