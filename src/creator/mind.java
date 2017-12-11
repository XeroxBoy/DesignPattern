package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public abstract class mind {
    protected strategy strategy=new strategy();
    public abstract mind makeForward();
    public abstract mind makeMiddle();
    public abstract mind makeLast();
    public abstract strategy getStrategy();
}
