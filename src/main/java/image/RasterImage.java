package image;

import javafx.scene.paint.Color;

public class RasterImage implements Image{

    int width;
    int height;
    Color[][] colors;

    public RasterImage(int width, int height){
        this.width = width;
        this.height = height;
    }

    public RasterImage(Color[][] colors){
        this.colors = colors;
        this.width = colors.length;
        this.height = colors[0].length;

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    @Override
    public int getWidth() {
        return colors.length;
    }

    @Override
    public int getHeight() {
        return colors[0].length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColors(Color[][] colors) {
        this.colors = colors;
    }
}
