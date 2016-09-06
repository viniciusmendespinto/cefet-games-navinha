package br.cefetmg.games.util;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Um objeto que pode sofrer colisão com outro.
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public interface Collidable {
    boolean collidesWith(Collidable other);
    boolean isOutOfBounds(Rectangle area);
    Rectangle getRect();
    Circle getCircle();
}
