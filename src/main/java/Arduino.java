public class Arduino extends ElectronicItem{
    private String version;

    public Arduino(String name, String description, int price, int storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(name, description, price, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nStorage Capacity: " + getStorageCapacity() + "\nModel: " + getModel() + "\nMaker: " + getMaker() + "\nOperating System: " + getOperatingSystem() + "\nVersion: " + version;
    }
}
