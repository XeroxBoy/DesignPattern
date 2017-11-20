package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public class mindB extends mind {
    private strategy strategy=new strategy();

    public void makeForward(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('3');
        strategy.setStrategy(oriStrategy.toString());
    }
    public void makeMiddle(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('4');
        strategy.setStrategy(oriStrategy.toString());
    }
    public void makeLast(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('4');
        strategy.setStrategy(oriStrategy.toString());
    }
    public strategy getStrategy(){
        return strategy;
    }
}
