package br.cefetmg.games.util;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Um objeto do jogo que se atualiza e desenha.
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public interface Entity {
    void update(float dt);
    void render(ShapeRenderer renderer);
}
