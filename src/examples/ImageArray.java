package examples;

import java.awt.Color;
import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
import java.util.Arrays;

//import javax.imageio.ImageIO;

public class ImageArray {

	public static void main(String[] args) {

		ImageViewer imageViewer = new ImageViewer("Amongst The Tales Of Life.jpeg");

		int[][][] imageAsArray = convertToArray(imageViewer.getImage());

		// 1. Print the RGB value for each pixel in the image.

		for (int[][] pixel : imageAsArray) {
			for (int[] color : pixel)
				System.out.println(Arrays.toString(color));
		}

		// 2. Remove all the blue and green from the image.

//		for (int[][] pixel : imageAsArray) {
//			for (int[] color : pixel) {
//				color[1] = 0;
//				color[2] = 0;
//			}
//		}

		// 3. Convert to black & white.

		// for particular solution, blue and green are not removed

		for (int[][] pixel : imageAsArray) {
			for (int[] color : pixel) {
				int luma = (color[0] + color[1] + color[2]) / 3;
				for (int i = 0; i < 3; i++)
					color[i] = luma < 128 ? 0 : 255;
			}

		}

		// [optional] Post a manipulated photo of yourself to Slack.

//		ImageViewer imageViewer2 = new ImageViewer("myPhoto.jpg");
//		int[][][] imageAsArray2 = convertToArray(imageViewer2.getImage());
//		for (int[][] pixel : imageAsArray2) {
//			for (int[] color : pixel) {
//				int luma = (int) Math.round(0.299 * color[0] + 0.587 * color[1] + 0.114 * color[2]);
//				color[2] = color[1] = color[0] = luma;
//			}
//		}
//		imageViewer2.setImage(convertToImage(imageAsArray2));
//		imageViewer2.show();
//		BufferedImage gray = convertToImage(imageAsArray2);
//		File outputfile = new File("image.jpg");
//		try {
//			ImageIO.write(gray, "jpg", outputfile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		imageViewer.setImage(convertToImage(imageAsArray));

		imageViewer.show();

	}

	private static int[][][] convertToArray(BufferedImage image) {
		int[][][] imageAsArray = new int[image.getWidth()][image.getHeight()][3];

		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				Color pixelColor = new Color(image.getRGB(i, j));
				imageAsArray[i][j][0] = pixelColor.getRed();
				imageAsArray[i][j][1] = pixelColor.getGreen();
				imageAsArray[i][j][2] = pixelColor.getBlue();
			}
		}
		return imageAsArray;

	}

	private static BufferedImage convertToImage(int[][][] imageAsArray) {

		BufferedImage buff = new BufferedImage(imageAsArray.length, imageAsArray[0].length, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < imageAsArray.length; x++) {
			for (int y = 0; y < imageAsArray[0].length; y++) {
				Color color = new Color(imageAsArray[x][y][0], imageAsArray[x][y][1], imageAsArray[x][y][2]);
				int rgb = color.getRGB();
				buff.setRGB(x, y, rgb);
			}
		}
		return buff;
	}
}