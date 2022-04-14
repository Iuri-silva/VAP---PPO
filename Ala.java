public class Ala {
    int id;
    String especialidade;
    Quarto quarto = new Quarto();

    Ala(int id, String espec){
        this.id = id;
        this.especialidade = espec;
    }

    public void exibirRelatorio() {
        System.out.print("ID: " + id + "\n");
        System.out.print("Especialidade: " + especialidade + "\n");
        quarto.verificarQuartoVazio();
    }
}
