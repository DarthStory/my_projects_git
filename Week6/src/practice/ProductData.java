package practice;


public class ProductData {
	DataProcessor processor = new DataProcessor();
    private String label;
    private int quantity;
    private double price;

    public ProductData(String label, int quantity, double price) {
        this.label = label;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getLabel() {
        return label;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Method to display the data
    public void display() {
        System.out.println(label + ": Quantity = " + quantity + ", Price = $" + price);
    }
}
