/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thanosparaskevas
 */
public class ZooApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Crocodile croco = new Crocodile();
        
       // System.out.println(croco);
//        Animal a1 = new Animal("doggy", 13);
//        Animal a2 = new Animal("duck", 18);
//        Animal a3 = new Animal("froggy", 20);
//        List <Animal> animals= new ArrayList();
//        animals.add(a1);
//        animals.add(a2);
//        animals.add(a3);
Crocodile a1 = new Crocodile("doggy", 13);
Crocodile a2 = new Crocodile("duck", 18);
List <Crocodile> croc= new ArrayList();
croc.add(a1);
croc.add(a2);


//        animals.add(a2);
//        animals.add(a3);


        Animal lion = new Lion();
        Animal crocodile = new Crocodile();
        Animal tiger = new Tiger();
        Animal zebra = new Zebra();




        
       // Crocodile tempAnimal = Crocodile.getOldestCrocodile(croc);
       // System.out.println(tempAnimal);

        List <Animal> animal2 = new ArrayList();
        animal2.add(lion);
        animal2.add(crocodile);
        animal2.add(tiger);
        animal2.add(zebra);
        for(Animal x:animal2){
        
         x.play();
         
         Zebra z = new Zebra();
         
        
        }




//zebra.play();        animal2.add(lion);

        
       
        
        
        
        
   
    }
    
}
