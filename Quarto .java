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

    public int MaxDiasInter() {
       if(paciente1.diasInter > paciente2.diasInter){
           if(paciente1.diasInter > paciente3.diasInter){
              
                System.out.print("Paciente 1 maior dias"+paciente1.diasInter);
               return paciente1.diasInter;
             
            }else{
             
                System.out.print("Paciente 3 maior dais"+paciente3.diasInter);
                return paciente3.diasInter;
             
            }
        }else{
         
            if(paciente2.diasInter > paciente3.diasInter){
              
                System.out.print("Paciente 2 maior dias"+paciente2.diasInter");
                return paciente2.diasInter;
              
            }else{
              
                System.out.print("Paciente 3 maior dias"+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }
    }

    public int MinDiasInter() {
      
        if(paciente1.diasInter < paciente2.diasInter){
            if(paciente1.diasInter < paciente3.diasInter){
              
                System.out.print("Paciente 1 menor dias"+paciente1.diasIntero);              
                return paciente1.diasInter;
              
            }else{
              
                System.out.print("Paciente 3 menor dias"+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }else{
          
            if(paciente2.diasInter < paciente3.diasInter){
                System.out.print("Paciente 2 menor dias"+ aciente2.diasInter);
                return paciente2.diasInter;
              
            }else{
              
                System.out.print("Paciente 3 menor dias:"+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }
    }

    public int diasPorPaciente(int nun) {
      
        return 1;
      
    }

    public void Vazio() {
      
     System.out.print("ALA Numero:"+numero+"\n");
      
      if(paciente1 == null){
            System.out.print("Cama 1 vazia\n");
        }
      if(paciente2 == null){
          System.out.print("Cama 2 vazia\n");
        }
      if(paciente3 == null){
            System.out.print("Cama 3 vazia\n");
        }

      if(paciente1 == null && paciente2 == null && paciente3 == null){
            System.out.print("Sem espa~p");
        }
    }

}
