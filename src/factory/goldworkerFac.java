package factory;
import bean.character;
import bean.goldworker;
import factoryInter.*;
/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class goldworkerFac implements characterFac {

    @Override
    public character createCharacter() {
        return new goldworker();
    }
}
