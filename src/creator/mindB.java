package creator;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public class mindB extends mind {
    private strategy strategy=new strategy();

    public mind makeForward(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('3');
        strategy.setStrategy(oriStrategy.toString());
        return this;
    }
    public mind makeMiddle(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('4');
        strategy.setStrategy(oriStrategy.toString());
        return this;

    }
    public mind makeLast(){
        StringBuilder oriStrategy=new StringBuilder(strategy.getStrategy());
        oriStrategy.append('4');
        strategy.setStrategy(oriStrategy.toString());
        return this;

    }
    public strategy getStrategy(){
        return strategy;
    }
}
