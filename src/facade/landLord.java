package facade;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AlexAnderIch on 2017/12/11.
 */
public class landLord {
    public boolean isHavegivenKey() {
        return havegivenKey;
    }

    public void setHavegivenKey(boolean havegivenKey) {
        this.havegivenKey = havegivenKey;
    }

    private boolean havegivenKey=false;

    public landLord(Map<String, String> houseInfo, String contactway, int lowPrice, int highPrice) {
        this.houseInfo = houseInfo;
        this.contactway = contactway;
        this.lowPrice = lowPrice;
        this.highPrice = highPrice;
    }

    private Map<String,String> houseInfo=new HashMap<>();
    private String contactway;
    private int lowPrice;
    private int highPrice;

    public Map houseInfo(){
        return houseInfo;
    }
    public String contactWay(){
        return contactway;
    }
    public void giveKey(){
        this.setHavegivenKey(true);
    }
    public String providePrice(){
        StringBuffer bf=new StringBuffer();
        bf.append(this.lowPrice);
        bf.append("-");
        bf.append(this.highPrice);
        return bf.toString();
    }
}
