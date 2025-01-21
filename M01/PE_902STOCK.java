public class PE_902STOCK {
    public static void main(String[] args) {
        // Create a Stock object
        Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
        stock.setPreviousClosingPrice(100);

        // Set current price
        stock.setCurrentPrice(90);

        // Display stock info
        System.out.println("Previous Closing Price: " + 
                stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + 
                stock.getCurrentPrice());
        System.out.println("Price Change: " + 
                stock.getChangePercent() * 100 + "%");
    }
}

class Stock {
    // Data fields
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // No-arg constructor
    public Stock() {
    }

    // Parameterized constructor
    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    // Method to calculate percentage change
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / 
                previousClosingPrice;
    }

    // Getter and setter for previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }

    // Getter and setter for currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }
}