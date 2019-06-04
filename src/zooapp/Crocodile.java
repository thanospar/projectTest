/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooapp;

import java.util.List;

/**
 *
 * @author thanosparaskevas
 */
public class Crocodile extends Animal {

    private int legs;

    public Crocodile() {
    }

    public Crocodile(String name, int age ) {
        super(name, age);

    }

    @Override
    public void play() {
        super.play();
        System.out.println("dfjsdkfhakfk");
    }

    @Override
    public String toString() {
        return super.toString()+ "Crocodile{" + "legs=" + legs + '}';
    }

}
