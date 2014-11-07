
package com.mycompany.horoscopos;

import java.util.ArrayList;


public class Zodiaco implements Futuro{
private ArrayList<Signo> signos;

    public Zodiaco() {
        signos=new ArrayList<Signo>();
        Signo virgo=new Signo("virgo","Eres muy inteligente, la suerte esta de tu lado :*");
        Signo libra=new Signo("libra","Eres una buena persona, dumuestra lo que eres, te viene buenas propuestas de trabajo");
        Signo acuario=new Signo("acuario","Estas a punto de estallar, no le hagas caso a las malas lenguas");
        Signo sagitario=new Signo("sagitario","No tengas miedo, todo el mundo te apoya");
        Signo capricornio=new Signo("capricornio","Tu numero de la suerte es el 9, viene buenas ofertas de dinero");
        Signo leo=new Signo("leo","Estas expuesto al peligro, cuidate");
        Signo picsis=new Signo("picsis","Tienes un gran amor, demuestrale lo mucho que lo amas");
        Signo aries=new Signo("aries","No hagas caso a lo ue te digan, has lo que te dicte el corazon");
        Signo tauro=new Signo("tauro","Eres fuerte con un toro, se aproxima una tormenta en tu vida");
        Signo cancer=new Signo("cancer","Sigue feliz echale ganas al trabajo y al amor");
        Signo geminis=new Signo("geminis","Eres un AS bajo la manga, que te tengan miedo");
        //Signo escorpion=new Signo("escorpion","Eres libre como el viento, sigue asi te vendran muchas sorpresas");
        
        signos.add(virgo);
        signos.add(libra);
        signos.add(acuario);
        signos.add(sagitario);
        signos.add(capricornio);
        signos.add(leo);
        signos.add(picsis);
        signos.add(aries);
        signos.add(tauro);
        signos.add(cancer);
        signos.add(geminis);
        //signos.add(escorpion);
        
    }
    public String leerFuturo(String parametro) {
      String tuFuturo="Tu signo no existe :(";
      for(Signo s:signos){
      if(parametro.equalsIgnoreCase(s.getNombre())){
          tuFuturo=s.getPrediccion();
                }
          
          }
        return tuFuturo;
    }

    
    
  
    
}
