package factory;

import bean.character;
import bean.magician;
import factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class magicianFac implements characterFac {
    @Override
    public character createCharacter() {
        return new magician();
    }
}
