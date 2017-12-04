package proxy;

import java.util.ArrayList;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class creamTrader implements creamSell {
    private creamFirm firm;//公司
    private int[] numOfsell=new int[30];//各种冰淇淋销量
    @Override
    public cream sellCream(cream creamNo) {
        ArrayList<cream> creams=firm.getCreams();
        cream cream=firm.sellCream(creamNo);
        int price=cream.getPrice();
        numOfsell[price]++;//销量加1
        cream.setPrice(price+1);//加价

        return cream;
    }

    @Override
    public int queryPrice(cream creamNo) {
        ArrayList<cream> creams=firm.getCreams();
        cream cream=firm.sellCream(creamNo);
        int price=cream.getPrice()+1;//加价
        return price;
    }
}
