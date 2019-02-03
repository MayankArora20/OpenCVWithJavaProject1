/*
 * Vande Matram
 * This is a program to load and store image in
 * opencv mat matrix
 * 
 * This is Mayank Arora
 */
package com.cvTry;

//importing packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class StoreImageInMatrix {

	public static void StoreImageInMatrix() {
		
		//loading our native libraries related to opencv
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		//loading image using imgcodec and storing it in matrix
		Imgcodecs ic=new Imgcodecs();
		Mat mt=ic.imread("C:/Users/SAMRAT/Desktop/char.png");

		//displaying matrix
		System.out.println(mt.dump());
	}
}
