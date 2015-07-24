/*
 * MaskFilter.java
 *
 * this class provides the static function to filter out a specified
 * colour component from the input image.
 *
 */
package com.deepak.j3dmaker.core;

import java.awt.image.BufferedImage;

/**
 *
 * @author deepak
 */
public class MaskFilter {

    /*
     * color value 0xAARRGGBB
     *                  where
     *                      R - red
     *                      G - Green
     *                      B - Blue
     *                      A - Alpha
     */
    public static BufferedImage filter(BufferedImage sourceImage, int colorMask) {

        // make copy of the source image
        BufferedImage destinationImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());
        destinationImage.getGraphics().drawImage(sourceImage, 0, 0, null);

        /* Loop through all the pixels */
        for (int x = 0; x < destinationImage.getWidth(); x++) {
            for (int y = 0; y < destinationImage.getHeight(); y++) {
                /* Apply the color mask */
                destinationImage.setRGB(x, y, sourceImage.getRGB(x, y) & colorMask);
            }
        }

        return destinationImage;
    }
}
