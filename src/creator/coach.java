package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public class coach {
    private mind mind;
    public coach(mind mind){
        this.mind=mind;
    }
    public strategy makeSt(){
        mind=new mindA();
        mind.makeForward();
        mind.makeMiddle();
        mind.makeLast();
        return mind.getStrategy();
    }
}
