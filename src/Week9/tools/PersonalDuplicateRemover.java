package Week9.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> characterStrings;
    private int detectedDuplicates;

    public PersonalDuplicateRemover() {
        characterStrings = new HashSet<>();
        detectedDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (!characterStrings.contains(characterString)) {
            characterStrings.add(characterString);
        } else {
            detectedDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return detectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(characterStrings);
    }

    @Override
    public void empty() {
        characterStrings.clear();
        detectedDuplicates = 0;
    }
}
