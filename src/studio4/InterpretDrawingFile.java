package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.02);
		
	String shape = in.next();	
	if (shape.equals("rectangle")) {
		
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		int blueValue = in.nextInt();
		Color customColor = new Color(redValue, greenValue, blueValue);
		StdDraw.setPenColor(customColor);
		boolean Filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		if (Filled) {
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		} else {
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
	else if (shape.equals("ellipse")) {
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		int blueValue = in.nextInt();
		Color customColor = new Color(redValue, greenValue, blueValue);
		StdDraw.setPenColor(customColor);
		boolean Filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
	if (Filled) {
			StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
		} else {
			StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
else if (shape.equals("triangle")) {
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		int blueValue = in.nextInt();
		Color customColor = new Color(redValue, greenValue, blueValue);
		StdDraw.setPenColor(customColor);
		boolean Filled = in.nextBoolean();
		double x1 = in.nextDouble();
		double x2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y1 = in.nextDouble();
		double y2 = in.nextDouble();
		double y3 = in.nextDouble();

		double[] coord1 = { x1, x2, x3 };
        double[] coord2 = { y1, y2, y3 };


	if (Filled) {
			StdDraw.filledPolygon(coord1, coord2);
		}
		else {
			StdDraw.polygon(coord1, coord2);
			}
		}

	}


	} 

	

		
	

