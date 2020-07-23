package com.bit2020.paint.text;

import com.bit2020.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.println("[" + text + "]를 그렸습니다.");

	}

}
