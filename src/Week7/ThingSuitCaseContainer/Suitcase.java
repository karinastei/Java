package Week7.ThingSuitCaseContainer;
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
}

    public void addThing(Thing thing) {
        int totalWeight = calculateTotalWeight() + thing.getWeight();
        if (totalWeight <= maxWeight) {
            things.add(thing);
        }
    }

    private int calculateTotalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return calculateTotalWeight();
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        String countString = (things.size() == 0) ? "empty" : (things.size() == 1) ? "1 thing" : things.size() + " things";
        return countString + " (" + calculateTotalWeight() + " kg)";
    }
}


