package AimsProject.hust.soict.dsai.test.disc;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

//        swap(jungleDVD, cinderellaDVD);
        DVDWrapper jungleWrapper = new DVDWrapper(jungleDVD);
        DVDWrapper cinderellaWrapper = new DVDWrapper(cinderellaDVD);
        swap(jungleWrapper, cinderellaWrapper);
        System.out.println("jungle dvd title: " + jungleWrapper.disc.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaWrapper.disc.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

    }

    static void swap(DVDWrapper dw1, DVDWrapper dw2) {
        DigitalVideoDisc tmp = dw1.disc;
        dw1.disc = dw2.disc;
        dw2.disc = tmp;
    }

    public static void changeTitle(DigitalVideoDisc disc, String title) {
        String oldTitle = disc.getTitle();
        disc.setTitle(title);
        disc = new DigitalVideoDisc(oldTitle);
    }

    //    public static void swap(Object o1, Object o2) {
//        Object tmp = o1;
//        o1 = o2;
//        o2 = tmp;
//    }
    static class DVDWrapper {
        DigitalVideoDisc disc;

        public DVDWrapper(DigitalVideoDisc disc) {
            this.disc = disc;
        }
    }
}
