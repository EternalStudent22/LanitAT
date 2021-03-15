import Animals.*;
import Food.*;


import javax.swing.text.Element;
import java.util.ArrayList;

public class Zoo {

    public static void main(String[] arg){
        //наняли работника
        Worker worker=new Worker();
        //зааводим животных
        Tiger tiger = new Tiger("Timosha",120,0,8,5);
        Tiger tiger1 = new Tiger("Tim",120,0,8,5);
        Duck duck=new Duck("Donald",3,2,3,2);
        Fish fish=new Fish("Nemo",10,2,10,1);
        Tyranasaurus rex=new Tyranasaurus("Rex",2500,5,10,10);
        Horse horse=new Horse("Konon",250,4,8,6);
        Elephant elephant=new Elephant("Bamby",2500,8,8,8);
        //завозим еду
        Corn corn=new Corn(2,3);
        Worms worms=new Worms(4,4);
        Pork pork=new Pork(3,4);
        Apple apple=new Apple(2,2);
        Beef beef = new Beef(4,2);
        Bread bread=new Bread(3,3);




        //сажаем животных в вольер
        Aviary<Carnivorous> carnivorousAviary= new Aviary<>(SizeAviary.MIDLE.getSize());
        carnivorousAviary.addAnimal(tiger.getName(),tiger);
        carnivorousAviary.addAnimal(rex.getName(),rex);
        carnivorousAviary.addAnimal(tiger1.getName(),tiger1);
        worker.feed(carnivorousAviary.getAnimal(tiger1.getName()),apple);
        worker.feed(carnivorousAviary.getAnimal(tiger.getName()),beef);
        carnivorousAviary.deleteAnimal(tiger.getName());
        System.out.println(carnivorousAviary.getAnimal(tiger.getName()));


    }
}
