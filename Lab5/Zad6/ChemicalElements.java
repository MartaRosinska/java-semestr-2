// Marta Rosińska
public class ChemicalElements {
    private String symbol;
    private String name;
    private String type;
    private int atom;

    public ChemicalElements(String symbol,String name,String type,int atom)
    {
        this.symbol = symbol;
        this.name = name;
        this.type = type;
        this.atom = atom;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAtom() {
        return atom;
    }
    public void setAtom(int atom) {
        this.atom = atom;
    }
    public String toString() {
        return symbol+"("+name+"):"+type+" with atomic number "+atom+".";
    }
}