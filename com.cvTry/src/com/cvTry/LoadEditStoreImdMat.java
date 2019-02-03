/*
 * Vande Matram
 * This program is update of of StoreImageInMatrix.java
 * here we make certain changes in pixel matrix value
 * of loaded image and create new image from that pixel
 * 
 * My name is Mayank Arora
 */
package com.cvTry;

//importing packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Scalar;

public class LoadEditStoreImdMat {

	public static void loadEditStoreMat() {
		// TODO Auto-generated method stub
		
		//load library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		//load and store in matrix
		Imgcodecs imc=new Imgcodecs();
		Mat matrix=imc.imread("C:/Users/SAMRAT/Desktop/char.png");
		
		
		//get 2nd,3rd and 4th row of matrix
		Mat r2=matrix.row(2);
		Mat r3=matrix.row(3);
		Mat r4=matrix.row(4);
		
		//set these rows values to 0
		r2.setTo(new Scalar(50));
		r3.setTo(new Scalar(50));
		r4.setTo(new Scalar(50));
		
		//Store this new matrix to form a new file char2
		imc.imwrite("C:/Users/SAMRAT/Desktop/char2.png", matrix);
		
	}

}
