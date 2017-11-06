package factory;

import bean.character;
import bean.cook;
import factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class cookFac implements characterFac {
    @Override
    public character createCharacter() {
        return new cook();
    }
}
