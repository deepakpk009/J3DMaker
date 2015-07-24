/*
 * PerspectiveFilter.java
 *
 * this class provides the static function to apply perspective transform to the
 * input image.
 *
 * currently it just shifts the images
 */
package com.deepak.j3dmaker.core;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author deepak
 */
public class PerspectiveFilter {

    // for shifting left and right
    public static final int SHIFT_LEFT = 1;
    public static final int SHIFT_RIGHT = 0;

    public static BufferedImage transform(BufferedImage sourceImage, int shiftType, int noOfPixelsToShift) {

        BufferedImage destinationImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());

        Graphics g = destinationImage.getGraphics();

        if (shiftType == SHIFT_LEFT) {
            g.drawImage(sourceImage, shiftType + noOfPixelsToShift, 0, null);
        }
        if (shiftType == SHIFT_RIGHT) {
            g.drawImage(sourceImage, shiftType, 0, null);
        }

        return destinationImage;
    }
}
