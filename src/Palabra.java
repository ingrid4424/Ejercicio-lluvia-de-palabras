import processing.core.PApplet;
import processing.core.PConstants;

public class Palabra {

	public int posX, posY, velocidad;
	public String word;
	public boolean quieta;
	public int color;
	
	public Palabra(String word, int posX, int posY, int velocidad, int color) {
		this.posX = posX;
		this.posY = posY;
		this.velocidad = velocidad;
		this.word = word;
		this.quieta = false;
		this.color = color;
	}
	
	public void draw (PApplet app) {
		app.textAlign(PConstants.CENTER, PConstants.CENTER);
		app.textSize(16);
		app.fill(color);
		app.text(word, posX, posY);
		
	}
	
	public void mover (PApplet app) {
		if(quieta == false) {
		if (posY > app.height) {
			posY = 0;
		}
		posY += velocidad;
	}
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public boolean isQuieta() {
		return quieta;
	}

	public void setQuieta(boolean quieta) {
		this.quieta = quieta;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
