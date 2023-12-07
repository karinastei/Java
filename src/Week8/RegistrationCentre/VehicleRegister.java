package Week8.RegistrationCentre;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegister {

    private Map<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.getOrDefault(plate, null);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Map<String, String> uniqueOwners = new HashMap<>();
        for (String owner : owners.values()) {
            uniqueOwners.put(owner, owner);
        }

        for (String owner : uniqueOwners.keySet()) {
            System.out.println(owner);
        }
    }
}
