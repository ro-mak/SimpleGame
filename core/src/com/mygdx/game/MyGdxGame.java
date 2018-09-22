package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Scene scene;
	@Override
	public void create () {
		batch = new SpriteBatch();
		scene = new StartScene(this);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		scene.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		scene.dispose();
	}

	public void changeScene(Scene scene){
		this.scene = scene;
	}
}
