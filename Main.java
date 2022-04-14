import java.util.Scanner
class Main {


    public static void main(String[] args) {
        
      
        Ala ala1 = new Ala(1,"Oftalmo");
      
        Ala ala2 = new Ala(2,"psiquiátrica");

Scanner sc = new Scanner(System.in);

        System.out.println("numero quarto ala 1");
        int nun = sc.nextInt();
        ala1.quarto.numero = nun;
      
        System.out.print("\n\nQuanrto: " + ala1.quarto.numero);

      
        System.out.print("nome 1 paciente ");
        String nome = sc.next();
        ala1.quarto.paciente1.nome = nome;
      
        System.out.print("dias intrenado 1 paciente ");
        nun = sc.nextInt();
        ala1.quarto.paciente1.diasInter = nun;
      
        System.out.print("medico responsavel pelo 1° paciente ");
        nome = sc.next();
        ala1.quarto.paciente1.medico.nome = nome;
        System.out.print("Quanrto: " + ala1.quarto.numero);

      
        System.out.print("nome 2 pccint");
        nome = sc.next();
        ala1.quarto.paciente2.nome = nome;
      
        System.out.print("dias intrenado 2 pacnt");
        nun = sc.nextInt();
        ala1.quarto.paciente2.diasInter = nun;
      
        System.out.print("medico responsavel 2 pacnt ");
        nome = sc.next();
        ala1.quarto.paciente2.medico.nome = nome;

        System.out.print("Quanrto: " + ala1.quarto.numero);
      
        System.out.print("nome 3 pacnt");
        nome = sc.next();
        ala1.quarto.paciente3.nome = nome;
      
        System.out.print("dias internado 3 pacnt");
        nun = sc.nextInt();
        ala1.quarto.paciente3.diasInter = nun;
      
        System.out.print("medico resp 3 pacnt");
        nome = sc.next();
        ala1.quarto.paciente3.medico.nome = nome;

      
        System.out.println("numero quarto ala 2 ");
        int nun1 = sc.nextInt();
        ala2.quarto.numero = nun1;
      
        System.out.print("Quarto: " + ala2.quarto.numero);
      
        System.out.print("nome do 1 pcnt: ");
        String nom1 = sc.next();
        ala2.quarto.paciente1.nome = nom1;
      
        System.out.print("dias internado 1 pacnt");
        nun = sc.nextInt();
        ala2.quarto.paciente1.diasInter = nun;
      
        System.out.print("medico rspn 1 pcnt ");
        nom1 = sc.next();
        ala2.quarto.paciente1.medico.nome = nom1;
      
        System.out.print("Quanrto: " + ala2.quarto.numero);
      
        System.out.print("nome 2 pacnt");
        nom1 = sc.next();
        ala2.quarto.paciente2.nome = nom1;
      
        System.out.print("dias internado 2pcnt");
        nun = sc.nextInt();
        ala2.quarto.paciente2.diasInter = nun;
      
        System.out.print("medico respo 2 pascnt: ");
        nom1 = sc.next();

      
      
        ala1.quarto.paciente2.medico.nome = nom1;
      
        ala1.quarto.MaxDiasInter();
      
        ala1.quarto.MinDiasInter();
      
        ala1.quarto.paciente1.RelatorioPaciente();
      
        ala2.quarto.paciente1.RelatorioPaciente();
      
        ala2.quarto.paciente2.RelatorioPaciente();
      
        ala1.quarto.Vazio();
      
        ala2.quarto.Vazio();
      
        ala1.quarto.paciente1.DiasIntern();
      
        ala2.quarto.paciente1.DiasIntern();

        ala1.Relatorio();
      
        ala2.Relatorio();
    }

  
}