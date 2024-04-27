package AimsProject.hust.soict.dsai.aims.store;
import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.HashSet;
public class Store {
    private HashSet<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new HashSet<>();
    }

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore.add(disc);
        }

    public void removeDVD(DigitalVideoDisc disc) {
        if (itemsInStore.contains(disc)) {
            itemsInStore.remove(disc);
        }
        else {
            System.out.println("The DVD is not in the store.");
        }
    }

    public void print() {
        int i = 0;
        System.out.println("***********************Store***********************");
        System.out.println("Store items:");
        for (DigitalVideoDisc disc : itemsInStore) {
            i++;
            System.out.println(i + ". DVD - " + disc);
        }
        System.out.println("***************************************************");
    }
}