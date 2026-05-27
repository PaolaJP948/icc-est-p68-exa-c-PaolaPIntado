package controller;

public class Tournament {
  public Tournament[]  sortSelectionDesc(Tournament[] tournaments){


    for( int i=0; i< tournaments.length -1 ; i++){

      int  numeroMenor = i;


      for(int j = i+1; j< tournaments.length- i; j++){

        if(tournaments[j].getTotalStarterPoints() < tournaments[numeroMenor].getTotalStarterPoints()){
          numeroMenor =j;

        }

      }

      Tournament aux = tournaments[i];
      tournaments[i] = tournaments[numeroMenor];
      tournaments[numeroMenor] = aux;
       

    
    }
    return tournaments;
  }
  public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints){

    sortSelectionDesc(tournaments);
     int bajo =0;
     int alto = tournaments.length -1;

     while(bajo >= alto){
      int centro = (bajo + alto)/2;
      int valorCentro = tournaments[centro].getTotalStarterPoints();


      if(valorCentro == totalStarterPoints){
        return tournaments[centro];
      }
      if (valorCentro > totalStarterPoints){
        bajo = centro +1;

      }else{
        alto = centro -1;

       
      }
        
      


     }

  }

  public void imprimir(Tournament[] tournaments){

    for (Tournament n  :  tournaments) {
                        
      System.out.println(n.getTotalStarterPoints() + n.getTotalStarterPoints());
        s}
  }





}
