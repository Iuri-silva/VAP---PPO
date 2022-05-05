public class Ala {

    String especialidade;
    int id;
    Quarto quarto;
    
    Ala(int id, String espc, Quarto quarto){

        this.id = id;
        this.quarto = quarto;
        this.especialidade = espc;

    }

  
    public void Relatorio() {
        System.out.print("ID: " + id + "\n");
        System.out.print("Especialidade: " + especialidade + "\n");
        quarto.Vazio();
    }
}
