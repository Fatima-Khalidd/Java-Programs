public class City {
    private int ID;
    private String name;
    private int population;
    private int postal_code;
private City temp;

private static int id=1;
private int Id;


    // Constructor
    City( String n, int p, int pc) {
        this.ID = id++;
        this.name = n;
        this.population = p;
        this.postal_code = pc;

    }

    // Set methods
    public void setName(String n) {
        name = n;
    }

    public void setPopulation(int p) {
        population = p;
    }

    public void setPostalCode(int pc) {
        postal_code = pc;
    }

    // Get methods
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getPostalCode() {
        return postal_code;
    }

    // Display method
    public void Display_info() {
System.out.println("ID: " + ID + ", Name: " + name + ", Population: " + population + ", Postal Code: " + postal_code);

    }
}
