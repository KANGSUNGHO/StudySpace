package com.bit2020.paint.shape;

import com.bit2020.paint.i.Drawable;

public abstract class Shape implements Drawable{
	private String lineColor;
	private String fillColor;
	
	public abstract int calcPerimeter();

}
