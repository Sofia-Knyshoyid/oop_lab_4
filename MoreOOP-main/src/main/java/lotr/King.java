package lotr;

public class King extends Noble {
    public King(){
        super(11, 5, "King");
    }

}


// class King
//attributes: int power=from 5 to 15, int hp=from 5 to 15
//methods: void kick(Character c) { decrease number of hp of the enemy by random number which will be in the range of his power }