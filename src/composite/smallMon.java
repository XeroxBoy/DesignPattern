package composite;

import java.util.ArrayList;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class smallMon implements Polisher {
    private ArrayList<Polisher> dormBosses=new ArrayList();
    public void add(Polisher p){
        dormBosses.add(p);
    }
    public void remove(int i){
        dormBosses.remove(i);
    }
    public Polisher getChild(int i){
        return (Polisher) dormBosses.get(i);
    }
    @Override
    public void polish() {
        for(int i=0;i<dormBosses.size();i++){
            dormBoss boss= (dormBoss) dormBosses.get(i);
            boss.polish();
        }
    }
}
