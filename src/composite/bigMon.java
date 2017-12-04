package composite;

import java.util.ArrayList;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class bigMon implements Polisher {
    private ArrayList<Polisher> smallMons=new ArrayList();
    public void add(Polisher p){
        smallMons.add(p);
    }
    public void remove(int i){
        smallMons.remove(i);
    }
    public Polisher getChild(int i){
        return (Polisher) smallMons.get(i);
    }
    @Override
    public void polish() {
        for(int i=0;i<smallMons.size();i++){
           smallMon smallmon= (smallMon) smallMons.get(i);
            smallmon.polish();
        }
    }
}
