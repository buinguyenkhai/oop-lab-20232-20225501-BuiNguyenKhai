package AimsProject.hust.soict.dsai.test.cart;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.dsai.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        cart.searchforDVD(1);
        cart.searchforDVD(5);
        cart.searchforDVD("LION");
        cart.searchforDVD("ABC");
        cart.searchforDVD("a");
    }
}
