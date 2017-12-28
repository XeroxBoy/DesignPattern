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
    public static void main(String[] args){
        bigMon big=new bigMon();
        smallMon small=new smallMon();
        dormBoss dorm=new dormBoss();
        student a=new student();
        student b=new student();
        dorm.add(a);
        dorm.add(b);
        small.add(dorm);
        big.add(small);
        big.polish();
    }
    @Override
    public void polish() {
        for(int i=0;i<smallMons.size();i++){
           smallMon smallmon= (smallMon) smallMons.get(i);
            smallmon.polish();
        }
    }
}
