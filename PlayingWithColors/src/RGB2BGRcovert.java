/*
 * Vande Matram
 * 
 * This is simple program to convert your coloured image to BGR
 * means reversing its color
 * For this cvtColor() is use
 * 
 * This is Mayank Arora
 */
package src;

//importing packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RGB2BGRcovert {

	public static void rgbToBGR() throws IOException {
		// TODO Auto-generated method stub
		//load library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		Imgcodecs ic=new Imgcodecs();
		
		//input image
		Mat matrix=ic.imread("C:/Users/SAMRAT/Desktop/char.png");
		
		//create new matrix for storing reslut
		Mat res=new Mat();
		
		//convert
		Imgproc.cvtColor(matrix,res,Imgproc.COLOR_RGB2BGR);
		
		MatOfByte mb=new MatOfByte();
		
		Imgcodecs.imencode(".png",res,mb);
		
		byte a[]=mb.toArray();
		
		InputStream is=new ByteArrayInputStream(a);
		
		BufferedImage bi=ImageIO.read(is);
		
		JFrame fr=new JFrame();
		
		fr.getContentPane().add(new JLabel(new ImageIcon(bi)));
		fr.pack(); 
	    fr.setVisible(true);
	    
	}

}
