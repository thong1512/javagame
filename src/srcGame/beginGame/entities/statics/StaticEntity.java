package srcGame.beginGame.entities.statics;

import srcGame.beginGame.Handler;
import srcGame.beginGame.entities.Entity;

public abstract class StaticEntity extends Entity {
    public StaticEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y ,width, height);
    }
}
