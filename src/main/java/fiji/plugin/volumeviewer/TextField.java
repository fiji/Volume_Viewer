/*-
 * #%L
 * Volume Viewer plugin for Fiji.
 * %%
 * Copyright (C) 2005 - 2021 Fiji developers.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
/*
 * Volume Viewer 2.0
 * 27.11.2012
 * 
 * (C) Kai Uwe Barthel
 */

package fiji.plugin.volumeviewer;

import java.awt.Color;

class TextField {
	private String text = "";
	private Color color;

	private float xpos;
	private float ypos;
	private float z;
	private int fontNr;

	public TextField(String text, Color color, int xpos, int ypos, int z) {
		this.setText(text);
		this.setColor(color);
		this.setXpos(xpos);
		this.setYpos(ypos);
		this.setZ(z);
		this.setFontNr(0);
	}

	public TextField(String text, Color color, int xpos, int ypos, int z, int fontNr) {
		this.setText(text);
		this.setColor(color);
		this.setXpos(xpos);
		this.setYpos(ypos);
		this.setZ(z);
		this.setFontNr(fontNr);
	}

	public TextField() {
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setXpos(float xpos) {
		this.xpos = xpos;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public Color getColor() {
		return color;
	}

	public float getZ() {
		return z;
	}

	public int getFontNr() {
		return fontNr;
	}

	public void setFontNr(int fontNr) {
		this.fontNr = fontNr;
	}

	public float getXpos() {
		return xpos;
	}

	public String getText() {
		return text;
	}

	public float getYpos() {
		return ypos;
	}

	public void setYpos(float ypos) {
		this.ypos = ypos;
	}
}
