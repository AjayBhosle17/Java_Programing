// Parent class
class TelecomCompany {
    protected String name;
    protected String location;
    
    public TelecomCompany(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public void displayDetails() {
        System.out.println("Company Name: " + name);
        System.out.println("Location: " + location);
    }
}

// Child class inheriting from TelecomCompany
class MobileNetworkProvider extends TelecomCompany {
    protected String networkType;
    
    public MobileNetworkProvider(String name, String location, String networkType) {
        super(name, location);
        this.networkType = networkType;
    }
    
    public void displayDetails() {
        super.displayDetails(); // calling parent class method
        System.out.println("Network Type: " + networkType);
    }
}

// Child class inheriting from MobileNetworkProvider
class Jio extends MobileNetworkProvider {
    private int subscribers;
    
    public Jio(String name, String location, String networkType, int subscribers) {
        super(name, location, networkType);
        this.subscribers = subscribers;
    }
    
    public void displayDetails() {
        super.displayDetails(); // calling parent class method
        System.out.println("Subscribers: " + subscribers);
    }
}

// Main class to test the inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Jio jio = new Jio("Reliance Jio", "India", "4G", 400000000);
        jio.displayDetails();
    }
}

