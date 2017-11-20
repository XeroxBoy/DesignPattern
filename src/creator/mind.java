package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public abstract class mind {
    private strategy strategy=new strategy();
    public void makeForward(){

    }
    public void makeMiddle(){}
    public void makeLast(){}
    public strategy getStrategy(){
        return strategy;
    }
}
