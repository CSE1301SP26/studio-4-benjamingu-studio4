package studio4;


import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;



public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.3);
		Color customColor = new Color(255, 105, 180);
		StdDraw.setPenColor(customColor);
		StdDraw.filledRectangle(0.5, 0.35, 0.4, 0.15);
		
		StdDraw.setPenColor(255, 209, 220);
		
		StdDraw.filledRectangle(0.5, 0.65, 0.4, 0.15);
	StdDraw.setPenColor(Color.BLACK);
		StdDraw.setScale(0, 100);   // x and y both go from 0 to 100
StdDraw.setFont(new Font("Monospaced", Font.BOLD, 30));
        StdDraw.text(50, 52, "women in STEM<3");
	
	
	
	}

	}
