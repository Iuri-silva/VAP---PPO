
public class Paciente {
    String nome;
    Medico medico = new Medico("Marcos Vey");
    int diasInternado;

    // Paciente(String nome, int dias){
    //     this.nome = nome;
    //     this.diasInternado = dias;
    // }

    public void exibirRelatorioPac() {
        System.out.print("-----Relatorio------\n");
        System.out.print("Paciente:" + nome +  " \n");
        System.out.print("Medico Responsavel: "+ medico.nome + "\n");
        System.out.print("Dias Internado: "+ diasInternado + "\n");
        System.out.print("--------FIM--------\n");
    }

    public int retornarDiasIntern() {
        System.out.print("Paciente: " + nome + "Esta internado a " + diasInternado +" dias");
        return diasInternado;
    }
}
