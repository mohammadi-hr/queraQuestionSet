package _8_Cage;

public class CageCopier {

    public void copy(Cage c1, Cage c2) {
        if (c1 != null && c2 != null){

            c2.setName(c1.getName());
            Bird[] birds = new Bird[2];
            birds = c1.getBirds();
            c2.setBirds(birds);

        }
    }
}
