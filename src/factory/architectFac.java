package factory;

import bean.architect;
import bean.character;
import factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class architectFac implements characterFac {
    @Override
    public character createCharacter() {
        return new architect();
    }
}
