import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems = new ArrayList<CISItem>();

    public void addBook(Book book) {
        cisItems.add(book);
    }

    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    public void updatePhonesLocation(String location) {
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    public ArrayList<CISItem> getItems(String itemType) throws ClassNotFoundException {
    ArrayList<CISItem> items = new ArrayList<CISItem>();
    Class<?> itemTypeClass = Class.forName(itemType);
    for (CISItem item : cisItems) {
        if (itemTypeClass.isInstance(item)) {
            items.add(item);
        }
    }
    return items;
}

    public void updateItems(String itemType, String property, String value) throws ClassNotFoundException {
    Class<?> itemTypeClass = Class.forName(itemType);
    for (CISItem item : cisItems) {
        if (itemTypeClass.isInstance(item)) {
            if (property.equals("name")) {
                item.setName(value);
            } else if (property.equals("location")) {
                item.setLocation(value);
            } else if (property.equals("price")) {
                item.setPrice(Integer.parseInt(value));
            } else if (property.equals("description")) {
                item.setDescription(value);
            }
        }
    }
}

    public void showAllInfo() {
        for (CISItem item : cisItems) {
            System.out.println(item.toString());
            System.out.println();
        }
    }

    public void addItems(CISItem cisItem) {
        cisItems.add(cisItem);
    }
}
