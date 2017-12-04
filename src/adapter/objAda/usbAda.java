package adapter.objAda;


/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class usbAda extends supplyer{
    private plug plug;
    @Override
    public void supplyEletricity(){
        plug.supply();
        System.out.print("USB");
    }


}
