public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;

    public CISItem() {
        name = null;
        location = null;
        price = 0;
        description = null;
    }

    public CISItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Name: " + name + "\nLocation: " + location + "\nPrice: " + price + "\nDescription: " + description;
    }
}
