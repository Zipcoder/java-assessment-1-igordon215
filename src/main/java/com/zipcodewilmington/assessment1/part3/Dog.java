package com.zipcodewilmington.assessment1.part3;

import java.util.Date;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
   // private String name;
    //private Integer age;
    //private PetOwner owner;
        public Dog(String name, Integer age, PetOwner owner){
            //super(name, age, owner);
        }
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        super("Dog name", age);

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        super("Dog name", 0);
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super("Dog name", 0);

       // this.name = name;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        super("",0);
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
