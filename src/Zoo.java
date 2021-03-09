import Animals.*;
import Food.Corn;
import Food.Worms;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] arg){
        //наняли работника
        Worker worker=new Worker();
        //зааводим животных
        Tiger tiger = new Tiger("Timosha",120,0,8);
        Duck duck=new Duck("Donald",3,2,3);
        Fish fish=new Fish("Nemo",10,2,10);
        //завозим еду
        Corn corn=new Corn(2,3);
        Worms worms=new Worms(4,4);
        //запускаем рыбок в бассейн
        Swim[] pool = new Swim[2];
        pool[0]=duck;
        pool[1]=fish;
        for(int i=0;i<pool.length;i++){
            pool[i].swim();
        }

        tiger.run();
        //кормежка
        worker.feed(tiger,worms);
        tiger.run();
        worker.feed(duck,worms);
        worker.feed(fish,worms);
        worker.feed(duck,corn);
        //просим подать голос
        worker.getVoice(duck);
        worker.getVoice(tiger);
    }
}
