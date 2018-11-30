package image;

import java.awt.*;

public class BruteRasterImage implements Image{
   Color[][] colors;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        colors = new Color[width][height];
        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++)
                colors[width][height] = color;
    }

    public BruteRasterImage(Color[][] colors){
        this.colors = colors;
        width = colors.length;
        height = colors[0].length;
    }

    public void creatRepresentation()
}
