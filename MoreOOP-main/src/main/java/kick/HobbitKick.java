package kick;
import lotr.Hobbit;
import lotr.Character;

public class HobbitKick implements BasicKick{

    void toCry(){
        System.out.println(";(");
    }

    public void kick() {
        toCry();
    }
}
