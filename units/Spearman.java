package units;

import java.util.ArrayList;


public class Spearman extends Unit {
    int countSpear;
    public Spearman(String name, int x, int y) {
        super(name, 150, "spear", 30, 6, 15, 50, 40, new Position(x,y));
        countSpear = 0;
    }
    @Override
    public String toString(){
        return name;
    }



}
