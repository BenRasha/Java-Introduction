package Present;

import EnumsForTask5.TypeOfSweets;

import java.util.ArrayList;
import java.util.List;

public class Sweets {
    private List<TypeOfSweets> sweets = new ArrayList<>();
    public static class Builder {
        private Sweets newSweets;

        public Builder() {
            newSweets = new Sweets();
        }

        public Sweets.Builder addSweets(String text) {
            String[] sweets = text.split(",");
            for (String sweet : sweets) {
                try {
                    newSweets.sweets.add(TypeOfSweets.valueOf(sweet.trim()));
                } catch (IllegalArgumentException e) {
                    System.err.println("Sorry, we don't have \"" + sweet + "\"sweets");
                }
            }
            return this;
        }

        public Sweets build() {
            return newSweets;
        }
    }

    @Override
    public String toString() {
        return "sweets=" + sweets;
    }
}

