public class Phone extends ElectronicItem {
    private String networkType;
    private String screenSize;

    public Phone(String name, String description, int price, int storageCapacity, String model, String maker, String operatingSystem, String networkType, String screenSize) {
        super(name, description, price, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nStorage Capacity: " + getStorageCapacity() + "\nModel: " + getModel() + "\nMaker: " + getMaker() + "\nOperating System: " + getOperatingSystem() + "\nNetwork Type: " + networkType + "\nScreen Size: " + screenSize;
    }
}
