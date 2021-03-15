import Animals.Animal;
import Animals.Voice;
import CastomExeption.WrongFoodException;
import Food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        try{
            animal.eat(food);
        }catch (WrongFoodException e){
            System.out.println(e.toString());
        }

    }
    public void getVoice(Voice voice){
        System.out.println(voice.voice());
    }
}
