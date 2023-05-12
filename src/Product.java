public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + name + " is $" + total);
    }

    public void printProduct() {
        System.out.println("One unit of " + name + " costs $" + cost + " and " + quantity + " units were purchased.");
    }
}


