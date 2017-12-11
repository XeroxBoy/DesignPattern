package facede;

import java.util.Map;

/**
 * Created by AlexAnderIch on 2017/12/11.
 */
public class mediator {
    public mediator(landLord user) {
        this.user = user;
    }

    public landLord getUser() {
        return user;
    }

    public void setUser(landLord user) {
        this.user = user;
    }

    private landLord user;
    public void provideInfo(){
        Map<String,String> info=user.houseInfo();
       String area= info.get("area");//小区
        String square=info.get("square");//面积
        String type=info.get("type");//户型
        String property=info.get("property");//产权（公寓，住宅）
        System.out.print("小区名: "+area+"  面积："+square+" 户型："+type+"  产权："+property+" ");
    }
    public String  contachWithBuyer(){
        return user.contactWay();
    }
    public void consultWithWatching(){
        user.setHavegivenKey(true);
            System.out.print("联系看房成功");


    }
    public void consultWithPrice(String buyerPrice){
        String price=user.providePrice();
        String low=price.split("-")[0];
        String high=price.split("-")[1];
        System.out.println("房主能接受的价格为"+high);
        if(Integer.parseInt(buyerPrice)>Integer.parseInt(high)) { //买方給高了
            System.out.println("价格"+buyerPrice+"成交");

            return;
        }
        else if(Integer.parseInt(buyerPrice)<Integer.parseInt(low)){ //买房给低了
            System.out.println("走吧");
            return;
        }
        else //试图将价格谈高
            System.out.println("价格"+high+"能行吗？");
        return;
    }
}
