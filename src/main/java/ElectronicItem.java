public class ElectronicItem extends CISItem {
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(String name, String description, int price, int storageCapacity, String model, String maker, String operatingSystem) {
        super(name, description, price);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nStorage Capacity: " + storageCapacity + "\nModel: " + model + "\nMaker: " + maker + "\nOperating System: " + operatingSystem;
    }


}
