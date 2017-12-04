package proxy;

import java.util.ArrayList;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class creamFirm implements creamSell {
    public ArrayList<cream> getCreams() {
        return creams;
    }

    public void setCreams(ArrayList<cream> creams) {
        this.creams = creams;
    }
    public void createCream(cream cream,int num){
        for(int i=0;i<num;i++) {
            creams.add(cream);
        }
    }

    private ArrayList<cream> creams=new ArrayList<>();
    @Override
    public cream sellCream(cream creamNo) {
        for(cream cream:creams){
            if(cream.getClass().equals(creamNo.getClass())) { //找到了想要的cream
                creams.remove(cream);
                return cream;
            }
        }
        return null;
    }

    @Override
    public int queryPrice(cream creamNo) {
        for(cream cream:creams){
            if(cream.getClass().equals(creamNo.getClass())) { //找到了想要的cream
                creams.remove(cream);
                return cream.getPrice();
            }
        }
        System.out.print("没找到想要的冰淇淋");
        return -1;
    }
}
