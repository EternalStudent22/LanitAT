import Animals.Animal;
import Animals.Voice;
import Food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice voice){
        System.out.println(voice.voice());
    }
}
