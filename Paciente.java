
public class Paciente {
  
    Medico medico = new Medico("MEDICO GENÉRICO");
  
    int diasInter;    String nome;



    public void exibirRelatorioPac() {
      
        System.out.print("Relatorio");
      
        System.out.print("Paciente"+nome);
      
        System.out.print("Medico"+medico.nome);

      
        System.out.print("Dia Internados:"+diasInter);
      
    }

    public int DiasIntern() {
        System.out.print(nome+"Esta internado a:"+diasInter+"dias");
        return diasInter;
      
    }
}
