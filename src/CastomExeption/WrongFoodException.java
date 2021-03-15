package CastomExeption;

import Food.Food;

public class WrongFoodException extends  Exception {
    public WrongFoodException(String message){
        super(message);
    }
}
