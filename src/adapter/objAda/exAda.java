package adapter.objAda;


/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class exAda extends supplyer {
    private plug plug;
    @Override
    public void supplyEletricity(){
        plug.supply();
        System.out.print("交流电");
    }


}
