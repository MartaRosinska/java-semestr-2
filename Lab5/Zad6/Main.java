// Marta Rosińska

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ChemicalElements> chemical = new ArrayList<>();
        chemical.add(new ChemicalElements("H","Hydrogen","hydrogenium",1));
        chemical.add(new ChemicalElements("O","Oxygen","oxygenium",8));
        chemical.add(new ChemicalElements("K","Potassium","alkali metal",19));
        chemical.add(new ChemicalElements("zn","Zinc","transition metal",30));
        chemical.add(new ChemicalElements("Ga","Gallium","metal",31));
    }
}