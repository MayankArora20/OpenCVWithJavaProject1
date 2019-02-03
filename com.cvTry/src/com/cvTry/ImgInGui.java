/*
 * Vande Matram
 * To display the image matrix in some 
 * gui tool like javaFxml, awt, swing
 * we need to convert it into strams of Byte
 * And for that we use matOfByte() and imencode()
 * 
 *  This progrma displays previous charizard and char in swing
 *  
 *  This is Mayank Arora
 */
package com.cvTry;

//importing packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Scalar;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class ImgInGui {
	
	public static void main(String mk[]) throws IOException
	{
		//load library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		//load and store image in matrix
		Imgcodecs ic=new Imgcodecs();
		Mat matrix=ic.imread("C:/Users/SAMRAT/Desktop/char.png");
		

		Mat matrix2=new Mat();
		matrix.copyTo(matrix2);
		
		//get 2nd,3rd and 4th row of matrix
		Mat r2=matrix2.row(20);
		Mat r3=matrix2.row(21);
		Mat r4=matrix2.row(31);
				
		//set these rows values to 0
		r2.setTo(new Scalar(0));
		r3.setTo(new Scalar(0));
		r4.setTo(new Scalar(0));
		
		
		
		//Instantiating MatOfByte
		MatOfByte mb=new MatOfByte();
		MatOfByte mb2=new MatOfByte();
		
		//convert matrix to matOfByte
		Imgcodecs.imencode(".png",matrix,mb);
		Imgcodecs.imencode(".png",matrix2,mb2);
		
		//Store these bytes in Array Of Bytes
		byte a[]=mb.toArray();
		byte a2[]=mb2.toArray();
		
		//pass this array to inputStream
		InputStream is=new ByteArrayInputStream(a);
		InputStream is2=new ByteArrayInputStream(a2);
		
		//buffered is
		BufferedImage bi=ImageIO.read(is);
		BufferedImage bi2=ImageIO.read(is2);
		
		//Instantiate JFrame 
	      JFrame frame = new JFrame();
	      JFrame frame2 = new JFrame();

	      //Set Content to the JFrame 
	      frame.getContentPane().add(new JLabel(new ImageIcon(bi)));
	      frame2.getContentPane().add(new JLabel(new ImageIcon(bi2)));
	      frame.pack(); 
	      frame.setVisible(true);
	      frame2.pack(); 
	      frame2.setVisible(true);
	}
}
