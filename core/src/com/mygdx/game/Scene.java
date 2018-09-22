package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;

public abstract class Scene {
    protected MyGdxGame game;
    public Scene(MyGdxGame game){
        this.game = game;
    }
    abstract void render(Batch batch);
    abstract void dispose();
}
