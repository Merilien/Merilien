package SharpieSet;

import java.util.ArrayList;

public class SharpieSet {
    ArrayList<Sharpie> sharpies = new ArrayList<>();

    public void addSharpie(Sharpie sharpie){
        this.sharpies.add(sharpie);
    }

    public int countUsable(){
        int usables = 0;
        for (Sharpie sharpie : sharpies){
            if (sharpie.hasInk()){ usables++; }
        }
        return usables;
    }

    public void removeTrash(){
        for (int i = 0; i < sharpies.size(); i++){
            if (!sharpies.get(i).hasInk()){ sharpies.remove(sharpies.get(i));}
        }
    }

}
