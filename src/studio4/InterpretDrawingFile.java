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
		StdDraw.setPenRadius(0.05);
		
	String shape = in.next();	
	if (shape.equals("rectangle")) {
		
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		int blueValue = in.nextInt();
		Color customColor = new Color(redValue, greenValue, blueValue);
		StdDraw.setPenColor(customColor);
		boolean Filled = in.nextBoolean();
		int x = in.nextInt();
		int y = in.nextInt();
		int halfWidth = in.nextInt();
		int halfHeight = in.nextInt();
		StdDraw.rectangle(x, y, halfWidth, halfHeight);


	} 
	

		
	}
}
