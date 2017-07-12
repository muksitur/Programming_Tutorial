import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.io.*;

import javax.imageio.ImageIO;


public class ImageInputOutput {
	
	//todo: load the file image.jpg into this class
	//change this image into grayscale and save it into a new image
	//use the following color conversion for every pixel in your image:
	//red *= 0.299
	//green *= 0.587
	//blue *= 0.114
	
	public static void gray(BufferedImage img){
		//BufferedImage imgNew = new BufferedImage(640, 320, BufferedImage.TYPE_INT_ARGB);
		
		for(int i=0; i<img.getWidth(); i++){
			for(int j=0; j<img.getHeight(); j++){
				
				//int alpha = (int)(Math.random()*256);
				//int red = (int)(Math.random()*256);
				//int green = (int)(Math.random()*256);
				//int blue = (int)(Math.random()*256);
				
				Color c = new Color(img.getRGB(i, j));
				
				int red = (int) (c.getRed()*0.299);
				int green = (int) (c.getGreen()*0.587);
				int blue = (int) (c.getBlue()*0.114);
				
				int result = (red+green+blue)%256;
				
				Color newC = new Color(result,result,result);
				
				img.setRGB(i, j, newC.getRGB());
				
				File output = new File("new_image.jpg");
				

				try {
					ImageIO.write(img, "jpg", output);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		
		try {
			BufferedImage img = ImageIO.read(new File("image.jpg"));
			
			ImageInputOutput param = new ImageInputOutput();
			
			param.gray(img);
			
			//BufferedImage imgNew = new BufferedImage(640,320, BufferedImage.TYPE_INT_ARGB);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BufferedImage img = ImageIO
		//
		
	}


	

}
