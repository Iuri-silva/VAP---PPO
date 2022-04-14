import java.util.Scanner;

public class Menu {

    public void listarMenu() {
        System.out.print("\n\n------- Menu ------\n");
        System.out.print("1 - Listar Vagas da Ala 1 `Pediatria`\n");
        System.out.print("2 - Listar Vagas da Ala 2 `Enfermaria`\n");
        System.out.print("3 - Cadastrar Paciente na Ala 1 `Pediatria`\n");
        System.out.print("4 - Cadastrar Paciente na Ala 2 `Enfermaria`\n");
        System.out.print("------- Menu ------\n");
        this.validar();

    }

    public void validar() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {

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
