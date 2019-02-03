/*
 * Vande Matram
 * This is going to be a simple program to 
 * add image and 
 * store image to some other place
 * 
 * May name is Mayank Arora
 */
package com.cvTry;

//importing packages
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LoadingImage {

	public static void loadStoreImg() throws IOException {
		// TODO Auto-generated method stub
		
		//Input file
		File f=new File("C:/Users/SAMRAT/Desktop/pokemon app/charizard.png");
		
		//Read Image
		BufferedImage bi=ImageIO.read(f);
		
		//Save image with different name to Desktop 
		File res=new File("C:/Users/SAMRAT/Desktop/char.png");
		ImageIO.write(bi, "png", res);
		
		System.out.println("Image Save");
		
	}

}
