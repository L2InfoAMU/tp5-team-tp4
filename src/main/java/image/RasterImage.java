package image;

import javafx.scene.paint.Color;

public class RasterImage implements Image{

    int width;
    int height;

    public RasterImage(int width, int height){
        this.width = width;
        this.height = height;
    }

    public RasterImage(Color[][] colors){

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }


}
