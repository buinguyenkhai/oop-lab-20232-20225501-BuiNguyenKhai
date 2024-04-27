package AimsProject.hust.soict.dsai.test.store;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        store.print();
        store.removeDVD(dvd1);
        store.print();
    }
}
