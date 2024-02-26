package units;

import java.util.ArrayList;


public class Outlaw extends Unit {
    int theft;
    public Outlaw(String name, int x, int y) {
        super(name, 150, "blade", 30, 6, 15, 50, 80, new Position(x,y));
        theft = 10;
    }
    @Override
    public String toString(){
        return name;
    }


}
