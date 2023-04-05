package orchard.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    private List<Faces> listFaces =  new ArrayList<Faces>(6);

    private Random randomNumber = new Random();

    public Dice(List listFaces) {
        this.listFaces = listFaces;
        this.randomNumber = randomNumber;
    }

    public Faces Roll() {
        return Faces.RED;
    }
}

