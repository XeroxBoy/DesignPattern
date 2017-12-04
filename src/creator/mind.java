package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public abstract class mind {
    protected strategy strategy=new strategy();
    public void makeForward(){

    }
    public abstract void makeMiddle();
    public abstract void makeLast();
    public abstract strategy getStrategy();
}
