import acm.program.*;
import acm.graphics.*;

public class GreyScale extends GraphicsProgram {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		GImage image = new GImage("C:\\Workspace\\BlackAndWhite\\src\\photo0896.jpg");
		GImage grayImage = createGrayScaleImage(image);
		
		//image.scale(.5);
		//add(image, 10, 50);
		
		grayImage.scale(.5);
		add(grayImage, 10, 50);
	}
	
	private GImage createGrayScaleImage(GImage image) {
		
		int[][] array = image.getPixelArray();
		
		int height = array.length;
		int width = array[0].length;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int pixel = array[i][j];
				
				int r = GImage.getRed(pixel);
				int g = GImage.getGreen(pixel);
				int b = GImage.getBlue(pixel);
				
				int xx = computeLuminosity(r, g, b);
				
				array[i][j] = GImage.createRGBPixel(xx, xx, xx);
			}
		}
		return new GImage(array);
	}
	
	private int computeLuminosity(int r, int g, int b) {
		return GMath.round(0.299 * r + 0.582 * g + 0.114 * b);
	}
}

