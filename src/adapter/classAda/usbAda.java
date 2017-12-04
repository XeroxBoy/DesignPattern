package adapter.classAda;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class usbAda extends plug implements supplyer {
    public void supply(){
        System.out.println("usb开始供电");
    }

    @Override
    public void supplyEletricity() {
        this.supply();
    }
}
