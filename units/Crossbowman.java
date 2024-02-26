package units;

import java.util.ArrayList;


public class Crossbowman extends Unit {
    int countArrow;
    public Crossbowman(String name, int x, int y) {
        super(name, 150, "crossbow", 20, 4, 15, 50, 40, new Position(x,y));
        countArrow = 10;
    }
    @Override
    public String toString(){
        return name;
    }


}
