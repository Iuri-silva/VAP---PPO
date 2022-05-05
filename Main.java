
//import java.util.Scanner;
class Main {


    public static void main(String[] args) {
        Quarto quarto1 = new Quarto(1);
        Quarto quarto2 = new Quarto(2);
      
        Ala ala1 = new Ala(1,"Oftalmo",quarto1);
        Ala ala2 = new Ala(2,"psiquiátrica",quarto2);

        Paciente paciente1 = new Paciente("Roberto",10,"DR. Luciano");
        Paciente paciente2 = new Paciente("Luciano",25,"DR. Vander");
        Paciente paciente3 = new Paciente("Jorge",19,"DR. China");
        Paciente paciente4 = new Paciente("Mario",40,"DR. Marcos");
        Paciente paciente5 = new Paciente("Maria",8,"DR. Valeria");
        Paciente paciente6 = new Paciente("Juliana",4,"DR. Ana Paula");

        quarto1.paciente1 = paciente1;
        quarto1.paciente2 = paciente2;
        quarto1.paciente3 = paciente5;
        quarto2.paciente1 = paciente3;
        quarto2.paciente2 = paciente4;
        quarto2.paciente3 = paciente6;
      
        ala1.quarto.MaxDiasInter();
      
        ala1.quarto.MinDiasInter();
      
        ala1.quarto.paciente1.exibirRelatorioPac();
      
        ala2.quarto.paciente1.exibirRelatorioPac();
    
        ala2.quarto.paciente2.exibirRelatorioPac();
      
        ala1.quarto.Vazio();
      
        ala2.quarto.Vazio();
      
        ala1.quarto.paciente1.DiasIntern();
      
        ala2.quarto.paciente1.DiasIntern();

        ala1.Relatorio();
      
        ala2.Relatorio();
    }

  
}