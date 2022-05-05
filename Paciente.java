
public class Paciente {
  
    Medico medico = new Medico();
    int diasInter;    
    String nome;

    Paciente(String nome, int diasInter, String nomeMedico){
      this.nome = nome;
      this.diasInter = diasInter;
      this.medico.nome = nomeMedico;
    }

    public void exibirRelatorioPac() {
      
        System.out.print("\n\nRelatorio____________");
      
        System.out.print("\nPaciente: "+nome);
      
        System.out.print("\nMedico: "+medico.nome);
      
        System.out.print("\nDia Internados: "+diasInter);
      
    }

    public int DiasIntern() {
        System.out.print(nome+" está internado a: "+diasInter+" dias\n\n");
        return diasInter;
      
    }
}
