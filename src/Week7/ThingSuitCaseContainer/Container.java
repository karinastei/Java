package Week7.ThingSuitCaseContainer;
import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (calculateTotalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    private int calculateTotalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        String countString = (suitcases.size() == 0) ? "empty" : (suitcases.size() == 1) ? "1 suitcase" : suitcases.size() + " suitcases";
        return countString + " (" + calculateTotalWeight() + " kg)";
    }
}
