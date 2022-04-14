public class Menu{

  public static void listarMenu(){
    System.out.print("----------Menu-----------------------");
    System.out.print("1- Listar Vagas Ala 1");
    System.out.print("2- Listar Vagas Ala 2");
    System.out.print("3- Cadastrar paciente Ala 1");
    System.out.print("4- Cadastrar paciente Ala 2");
    System.out.print("-----------Menu---------------");
    validar(option);
    System.out.print("");
    System.out.print("-----------Menu---------------");
  }

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