package image;

import javafx.scene.paint.Color;

public class BruteRasterImage extends RasterImage implements Image {
    Color[][] colors;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int height) {
        super(width,height);
        colors = new Color[width][height];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                colors[i][j] = color;
    }

    public BruteRasterImage(Color[][] colors) {
        super(colors);
        colors = new Color[width][height];
        for(int i = 0; i<this.width;i++)
            for (int j = 0; j < this.height; j++)
                    this.colors[i][j] = colors[i][j];
    }

    public void creatRepresentation() {
            Color[][] colors = new Color[getWidth()][getHeight()];
    }

    public void setPixelColor(Color color, int x, int y) {
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        super.getPixelColor(x,y);
    }

    private void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                colors[i][j] = pixels[i][j];

    }

    private void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                colors[i][j] = color;
    }

    public int getWidth(){
        return colors.length;
    }

    public int getHeight(){
        return colors[0].length;
    }

    protected void setWidth(int width){
        Color[][] colors2 = new Color[width][height];
        for (int i = 0; i < colors2.length && i < this.width  ; i++)
            for (int j = 0; j < colors2[0].length ; j++)
                colors2[i][j] = colors[i][j];
            this.colors = colors2;

    }

    protected void setHeight(int height){
        Color[][] colors2 = new Color[width][height];
        for (int i = 0; i < colors2.length ; i++)
            for (int j = 0; j < colors2[0].length && j < this.height ; j++)
                colors2[i][j] = colors[i][j];
        this.colors = colors2;
    }

    //Enum<RasterImageType> Brute;

}
