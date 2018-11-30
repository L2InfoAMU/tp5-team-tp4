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

    public void creatRepresentation(){
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){

    }
}
