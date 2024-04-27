package AimsProject.hust.soict.dsai.aims.cart;
import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.HashSet;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private HashSet<DigitalVideoDisc> itemsOrdered;
    private int qtyOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new HashSet<>();
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Cart is already full! Cannot add item.");
        } else {
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is now full.");
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }
    // arbitrary number of arguments
//    public void addDigitalVideoDisc(DigitalVideoDisc ... dvdList) {
//        for (DigitalVideoDisc disc: dvdList) {
//            addDigitalVideoDisc(disc);
//        }
//    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            qtyOrdered--;
        } else {
            System.out.println("Cannot find item in the cart.");
        }
    }

    public float totalCost() {
        float total = 0f;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public void print() {
        int i = 0;
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc disc : itemsOrdered) {
            i++;
            System.out.println(i + ". DVD - " + disc);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // search for dvds in cart by id
    public void searchforDVD(int id) {
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (id == disc.getId()) {
                System.out.println("Disc found: " + disc);
                return;
            }
        }
        System.out.println("No match is found.");
    }

    public void searchforDVD(String title) {
        boolean matched = false;
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc.isMatch(title)) {
                matched = true;
                System.out.println("Disc found: " + disc);
            }
        }
        if (!matched) {
            System.out.println("No match is found.");
        }
    }
}