
package com.mycompany.horoscopos;


public class Pitonisa{
  Futuro futuro;
public Pitonisa(Futuro futuro){
    this.futuro=futuro;
}  
  
  public String obtenerFuturo(String parametro){
     
      return futuro.leerFuturo(parametro);
  }

   
    
}
