import Animals.*;
import Food.*;


import javax.swing.text.Element;
import java.util.ArrayList;

public class Zoo {

    public static void main(String[] arg){
        //наняли работника
        Worker worker=new Worker();
        //зааводим животных
        Tiger tiger = new Tiger("Timosha",120,0,8);
        Duck duck=new Duck("Donald",3,2,3);
        Fish fish=new Fish("Nemo",10,2,10);
        Tyranasaurus rex=new Tyranasaurus("Rex",2500,5,10);
        Horse horse=new Horse("Konon",250,4,8);
        Elephant elephant=new Elephant("Bamby",2500,8,6);
        //завозим еду
        Corn corn=new Corn(2,3);
        Worms worms=new Worms(4,4);
        Pork pork=new Pork(3,4);
        Apple apple=new Apple(2,2);
        Beef beef = new Beef(4,2);
        Bread bread=new Bread(3,3);
        //запускаем рыбок в бассейн
        Swim[] pool = new Swim[2];
        pool[0]=duck;
        pool[1]=fish;
        for(int i=0;i<pool.length;i++){
            pool[i].swim();
        }
        //собираем животных для кормежки
        Animal[] animals=new Animal[]{tiger,duck,fish,rex,horse,elephant};
        //собираем кормовую базу
        Food[] foods=new Food[]{corn,worms,pork,apple,beef,bread};

        tiger.run();
        //кормежка
        for(int i=0;i<animals.length;i++){
            for(int j=0;j<foods.length;j++){
                worker.feed(animals[i],foods[j]);
            }
        }

        tiger.run();

        //просим подать голос
        worker.getVoice(duck);
        worker.getVoice(tiger);
    }
}
