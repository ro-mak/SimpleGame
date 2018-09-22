package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class MainScene extends Scene {
    private static final String PLANET_SURFACE = "PlanetSurface.png";
    private Texture background;

    public MainScene(MyGdxGame game) {
        super(game);
        background = new Texture(PLANET_SURFACE);
    }
    public void render(Batch batch) {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
        batch.draw(background, 0, 0);
    }
    public void dispose(){
        background.dispose();
    }
}
