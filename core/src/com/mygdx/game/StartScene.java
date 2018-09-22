package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class StartScene extends Scene{
    private static final int BUTTON_ANIM_DISTANCE = 2;
    private static final String PLANET_IN_SPACE_PNG = "PlanetInSpace.png";
    private static final String START_BUTTON_PNG = "StartButton.png";
    private Texture background;
    private Texture startButtonTexture;
    private ImageButton startButton;

    public StartScene(MyGdxGame game) {
        super(game);
        background = new Texture(PLANET_IN_SPACE_PNG);
        startButtonTexture = new Texture(START_BUTTON_PNG);
        startButton = new ImageButton(new TextureRegionDrawable(new TextureRegion(startButtonTexture)));
    }
    private boolean touched = false;
    public void render(Batch batch) {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
        batch.draw(background, 0, 0);
        buttonClickAnimation();
        startButton.draw(batch, 1);
    }
    private void buttonClickAnimation(){
        if (Gdx.input.isTouched()&&!touched) {
            startButton.setX(startButton.getX() + BUTTON_ANIM_DISTANCE);
            startButton.setY(startButton.getY() + BUTTON_ANIM_DISTANCE);
            touched = true;
        } else if (touched){
            game.changeScene(new MainScene(game));
            startButton.setX(startButton.getX() - BUTTON_ANIM_DISTANCE);
            startButton.setY(startButton.getY() - BUTTON_ANIM_DISTANCE);
            touched = false;
        }
    }
    public void dispose(){
        background.dispose();
        startButtonTexture.dispose();
    }
}
