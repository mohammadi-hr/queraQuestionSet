package _8_Cage;

public class CageCopier {

    public void copy(Cage c1, Cage c2) {
        if (c1 != null && c2 != null) {
            c2.setId(c1.getId());
            c2.setName(new String(c1.getName()));
            if (c1.getBirds() == null)
                c2.setBirds(null);
            else{
                if(c1.getBirds()[0] != null && c2.getBirds()[0] == null){
                    c2.getBirds()[0] = c1.getBirds()[0];
                }else{
                    c2.getBirds()[0] = null;
                }

                if(c1.getBirds()[1] != null && c2.getBirds()[1] == null){
                    c2.getBirds()[1] = c1.getBirds()[1];
                }else {
                    c2.getBirds()[1] = null;
                }
            }

        }
    }
}
