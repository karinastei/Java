package Week10.Groups.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> organisms;

    public Group() {
        this.organisms = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable organism : organisms) {
            result.append(organism.toString()).append("\n");
        }
        return result.toString();
    }

    public void addToGroup(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : organisms) {
            organism.move(dx, dy);
        }
    }
}