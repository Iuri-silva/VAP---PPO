public class Quarto{
    int numero;
    Paciente paciente1;
    Paciente paciente2;
    Paciente paciente3;
  
    Quarto(int num){
         this.numero = num;
    }

    public int MaxDiasInter() {
       if(paciente1.diasInter > paciente2.diasInter){
           if(paciente1.diasInter > paciente3.diasInter){
              
                System.out.print("\nPaciente 1 maior dias: "+paciente1.diasInter);
               return paciente1.diasInter;
             
            }else{
             
                System.out.print("\nPaciente 3 maior dais: "+paciente3.diasInter);
                return paciente3.diasInter;
             
            }
        }else{
         
            if(paciente2.diasInter > paciente3.diasInter){
              
                System.out.print("\nPaciente 2 maior dias: "+paciente2.diasInter);
                return paciente2.diasInter;
              
            }else{
              
                System.out.print("\nPaciente 3 maior dias: "+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }
    }

    public int MinDiasInter() {
      
        if(paciente1.diasInter < paciente2.diasInter){
            if(paciente1.diasInter < paciente3.diasInter){
              
                System.out.print("\nPaciente 1 menor dias: "+paciente1.diasInter);              
                return paciente1.diasInter;
              
            }else{
              
                System.out.print("\nPaciente 3 menor dias: "+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }else{
          
            if(paciente2.diasInter < paciente3.diasInter){
                System.out.print("\nPaciente 2 menor dias: "+ paciente2.diasInter);
                return paciente2.diasInter;
              
            }else{
              
                System.out.print("\nPaciente 3 menor dias: "+paciente3.diasInter);
                return paciente3.diasInter;
              
            }
        }
    }

    public int diasPorPaciente(int nun) {
      
        return 1;
      
    }

    public void Vazio() {
      
     System.out.print("\nALA Numero: "+numero+"\n");
      
      if(paciente1 == null){
            System.out.print("\nCama 1 vazia\n");
        }
      if(paciente2 == null){
          System.out.print("\nCama 2 vazia\n");
        }
      if(paciente3 == null){
            System.out.print("\nCama 3 vazia\n");
        }

      if(paciente1 == null && paciente2 == null && paciente3 == null){
            System.out.print("\nSem espaço");
        }
    }

}
