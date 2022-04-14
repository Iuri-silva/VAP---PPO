import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ala ala1 = new Ala(1, "Oftalmo");
        Ala ala2 = new Ala(2, "psiquiátrica");
        System.out.println("Informe o numero do quarto da Ala 1 'Pediatria': ");
        int nun = sc.nextInt();
        ala1.quarto.numero = nun;
        System.out.print("\n\nQuanrto: " + ala1.quarto.numero);
        System.out.print("Informe o nome do 1° paciente: ");
        String nome = sc.next();
        ala1.quarto.paciente1.nome = nome;
        System.out.print("dias internado do 1° paciente: ");
        nun = sc.nextInt();
        ala1.quarto.paciente1.diasInternado = nun;
        System.out.print("medico responsavel pelo 1° paciente: ");
        nome = sc.next();
        ala1.quarto.paciente1.medico.nome = nome;
        System.out.print("\n\nQuanrto: " + ala1.quarto.numero);
        System.out.print("Informe o nome do 2° paciente: ");
        nome = sc.next();
        ala1.quarto.paciente2.nome = nome;
        System.out.print("quantidade de dias internado do 2° paciente: ");
        nun = sc.nextInt();
        ala1.quarto.paciente2.diasInternado = nun;
        System.out.print("Informe o nome do medico responsavel pelo 2° paciente: ");
        nome = sc.next();
        ala1.quarto.paciente2.medico.nome = nome;

        System.out.print("\n\nQuanrto: " + ala1.quarto.numero);
        System.out.print("Informe o nome do 3° paciente: ");
        nome = sc.next();
        ala1.quarto.paciente3.nome = nome;
        System.out.print("Informe a quantidade de dias internado do 3° paciente: ");
        nun = sc.nextInt();
        ala1.quarto.paciente3.diasInternado = nun;
        System.out.print("Informe o nome do medico responsavel pelo 3° paciente: ");
        nome = sc.next();
        ala1.quarto.paciente3.medico.nome = nome;
        // System.out.println("Vamos Cadastrar nosso 1° Paciente");
        System.out.println("numero do quarto da Ala 2 'psiquiátrica': ");
        int nun1 = sc.nextInt();
        ala2.quarto.numero = nun1;
        System.out.print("\n\nQuanrto: " + ala2.quarto.numero);
        System.out.print("\nInforme o nome do 1° paciente: ");
        String nom1 = sc.next();
        ala2.quarto.paciente1.nome = nom1;
        System.out.print("\nInforme a quantidade de dias internado do 1° paciente: ");
        nun = sc.nextInt();
        ala2.quarto.paciente1.diasInternado = nun;
        System.out.print("\nInforme o nome do medico responsavel pelo 1° paciente: ");
        nom1 = sc.next();
        ala2.quarto.paciente1.medico.nome = nom1;
        System.out.print("\n\nQuanrto: " + ala2.quarto.numero);
        System.out.print("\nInforme o nome do 2° paciente: ");
        nom1 = sc.next();
        ala2.quarto.paciente2.nome = nom1;
        System.out.print("\nInforme a quantidade de dias internado do 2° paciente: ");
        nun = sc.nextInt();
        ala2.quarto.paciente2.diasInternado = nun;
        System.out.print("\nInforme o nome do medico responsavel pelo 2° paciente: ");
        nom1 = sc.next();
        ala1.quarto.paciente2.medico.nome = nom1;
        ala1.quarto.retornarMaxDiasInter();
        ala1.quarto.retornarMinDiasInter();
        ala1.quarto.paciente1.exibirRelatorioPac();
        ala2.quarto.paciente1.exibirRelatorioPac();
        ala2.quarto.paciente2.exibirRelatorioPac();
        ala1.quarto.verificarQuartoVazio();
        ala2.quarto.verificarQuartoVazio();
        ala1.quarto.paciente1.retornarDiasIntern();
        ala2.quarto.paciente1.retornarDiasIntern();
        ala1.exibirRelatorio();
        ala2.exibirRelatorio();
    }

  
}