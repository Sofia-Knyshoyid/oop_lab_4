package lotr;

import lombok.Getter;

@Getter
public abstract class Character {
    private int power;
    private int hp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
        }

    public void setPower(int power){
        this.power = Math.max(power, 0);
    }
}

