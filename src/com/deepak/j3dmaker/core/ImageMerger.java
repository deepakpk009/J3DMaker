/*
 * ImageMerger.java
 *
 * This class provides the static function for merging two images.
 *
 * input: two BufferedImages
 * output: merged single BufferedImage
 *
 */
package com.deepak.j3dmaker.core;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author deepak
 */
public class ImageMerger {

    public static BufferedImage merge(BufferedImage image1, BufferedImage image2) {
        // create the new image, canvas size is the max. of both img1 sizes
        int w = Math.max(image1.getWidth(), image2.getWidth());
        int h = Math.max(image1.getHeight(), image2.getHeight());
        BufferedImage mergedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < image1.getHeight(); y++) {
            for (int x = 0; x < image1.getWidth(); x++) {
                Color pixelImage1 = new Color(image1.getRGB(x, y));
                Color pixelImage2 = new Color(image2.getRGB(x, y));
                Color pixelMergedImage = new Color(// XOR based addition of pixel colors
                        pixelImage1.getRed() ^ pixelImage2.getRed(), pixelImage1.getGreen() ^ pixelImage2.getGreen(), pixelImage1.getBlue() ^ pixelImage2.getBlue());
                mergedImage.setRGB(x, y, pixelMergedImage.getRGB());
            }
        }
        return mergedImage;
    }
}
