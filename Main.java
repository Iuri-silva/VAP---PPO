class Main {
  public static void main(String[] args) {
    
    Ala ala1 = new Ala(1, "Pediatria");
    Ala ala2 = new Ala(2, "Oftalmo");

    public static void listarMenu(){
    System.out.print("----------Menu-----------------------");
    System.out.print("1- Listar Vagas Ala 1");
    System.out.print("2- Listar Vagas Ala 2");
    System.out.print("3- Cadastrar paciente Ala 1");
    System.out.print("4- Cadastrar paciente Ala 2");
  }

    System.out.print(x: "Informe o numero do quarto da Ala 1:");
    int num = sc.nextint();
    ala1.quarto.numero = num;
  
    System.out.print(x:"Vamos cadastrar nosso 1° paciente");
    
    System.out.println(x: "Informe o numero do quarto da Ala 2:");
    int num1 = sc.nextint();
    ala2.quarto.numero = num1;

    menu.listarMenu();

      public void validar(){
    validar();
    switch (option){
      case 1:
        System.out.print("1");
      break;

      case 2:
        System.out.print("2");
      break;


      case 3:
        System.out.print("3");
      break;

        
      case 4:
        System.out.print("4");
      break;
    }
  }
}