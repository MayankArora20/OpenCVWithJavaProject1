/*
 * Vande Matram
 * This is the simplest program of my opneCV learning
 * This program is all about just creating and displaying
 * a simple matrix using OpenCV library
 * 
 * My name is Mayank Arora
 */
package com.cvTry;

//importing packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.CvType;

public class CreatingMatric {
	
	public static void createAndDisplayMatrix()
	{
		//first step is to load native libraries of openCV
		 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		 
		 //Creating 5X5 matrix by instantiating MAT and initialize each pixel to zero
		 //Scalar is use to pass pixel values
		 //8uC1 indicates that its single channel
		 Mat matrix=new Mat(5,5,CvType.CV_8UC1,new Scalar(0));
		 
		 //lets take out 3rd row of matrix
		 Mat r3=matrix.row(3);
		 
		 //Now initialize it with 4
		 r3.setTo(new Scalar(3));
		 
		 //Now do same for column 2 and initializing it with 9
		 
		 Mat c2=matrix.col(2);
		 c2.setTo(new Scalar(9));
		 
		 //Printing matrix
		 System.out.println(matrix.dump());
		 
		 
	}

}
