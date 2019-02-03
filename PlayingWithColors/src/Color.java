/*
 * Img can be of different type linke black and white or colored
 * A colored image has 3 channels, means lXbXC dimension
 * BW in of one
 * 
 * This program is to read an image as color and examine various other available options
 * For this we need to set an extra field "flag" in
 * imgcodec read()
 * 
 * This is Mayank Arora
 */
package src;

//importing packages and required classes
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Color {

	public static void color() throws IOException {
		// TODO Auto-generated method stub
		
		//load library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		//load and store image in matrix
				Imgcodecs ic=new Imgcodecs();
				Mat matrix=ic.imread("C:/Users/SAMRAT/Desktop/char.png",ic.IMREAD_COLOR);
				
				
				//Instantiating MatOfByte
				MatOfByte mb=new MatOfByte();
				
				//convert matrix to matOfByte
				Imgcodecs.imencode(".png",matrix,mb);
				
				//Store these bytes in Array Of Bytes
				byte a[]=mb.toArray();
				
				//pass this array to inputStream
				InputStream is=new ByteArrayInputStream(a);
				
				//buffered is
				BufferedImage bii=ImageIO.read(is);
				
				//change the color of image
				BufferedImage bi=new BufferedImage(bii.getWidth(),bii.getHeight(),BufferedImage.TYPE_3BYTE_BGR);
				bi.getGraphics().drawImage(bii, 0, 0, null);
				
				//Instantiate JFrame 
			      JFrame frame = new JFrame();

			      //Set Content to the JFrame 
			      frame.getContentPane().add(new JLabel(new ImageIcon(bi)));
			      frame.pack(); 
			      frame.setVisible(true);
			}
		}
