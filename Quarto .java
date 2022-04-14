class Quarto {
    int numero;
    Paciente paciente1 = new Paciente();
    Paciente paciente2 = new Paciente();
    Paciente paciente3 = new Paciente();


    Quarto(){

    }
    Quarto(int num){
        this.numero = num;
    }

    public int retornarMaxDiasInter() {
        if(paciente1.diasInternado > paciente2.diasInternado){
            if(paciente1.diasInternado > paciente3.diasInternado){
                System.out.print("Paciente 1 Tem " + paciente1.diasInternado + " e possue a maior quantidade de dias internado \n");
                return paciente1.diasInternado;
            }else{
                System.out.print("Paciente 3 Tem " + paciente3.diasInternado + " e possue a maior quantidade de dias internado \n");
                return paciente3.diasInternado;
            }
        }else{
            if(paciente2.diasInternado > paciente3.diasInternado){
                System.out.print("Paciente 2 Tem " + paciente2.diasInternado + " e possue a maior quantidade de dias internado \n");
                return paciente2.diasInternado;
            }else{
                System.out.print("Paciente 3 Tem " + paciente3.diasInternado + " e possue a maior quantidade de dias internado \n");
                return paciente3.diasInternado;
            }
        }
    }

    public int retornarMinDiasInter() {
        if(paciente1.diasInternado < paciente2.diasInternado){
            if(paciente1.diasInternado < paciente3.diasInternado){
                System.out.print("Paciente 1 Tem " + paciente1.diasInternado + " e possue a menor quantidade de dias internado \n");
                return paciente1.diasInternado;
            }else{
                System.out.print("Paciente 3 Tem " + paciente3.diasInternado + " e possue a menor quantidade de dias internado \n");
                return paciente3.diasInternado;
            }
        }else{
            if(paciente2.diasInternado < paciente3.diasInternado){
                System.out.print("Paciente 2 Tem " + paciente2.diasInternado + " e possue a menor quantidade de dias internado \n");
                return paciente2.diasInternado;
            }else{
                System.out.print("Paciente 3 Tem " + paciente3.diasInternado + " e possue a menor quantidade de dias internado \n");
                return paciente3.diasInternado;
            }
        }
    }

    public int diasPorPaciente(int nun) {
        return 1;
    }

    public void verificarQuartoVazio() {
        System.out.print("Quarto Numero: " + numero + "\n");
        if(paciente1 == null){
            System.out.print("Cama 1 esta vaga" + "\n");
        }
        if(paciente2 == null){
            System.out.print("Cama 2 esta vaga" + "\n");
        }
        if(paciente3 == null){
            System.out.print("Cama 3 esta vaga" + "\n");
        }

        if(paciente1 == null && paciente2 == null && paciente3 == null){
            System.out.print("Não ha espaço neste quarto" + "\n");
        }
    }

}
