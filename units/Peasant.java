package units;

import java.util.ArrayList;

public class Peasant extends Unit {
    int countArrow;
    public Peasant(String name, int x, int y) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40, new Position(x,y));
        countArrow = 0;
    }
    protected void printname() {
        System.out.println("Name: " + name);
    }
    @Override
    public String toString(){
        return name;
    }

}
