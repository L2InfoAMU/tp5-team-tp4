package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image{

    List<Color> palette;
    int[][] indexesOfColors;
    int width;
    int height;

    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
        palette.add(color);
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
               indexesOfColors[i][j] = palette.indexOf(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        this.width = pixels.length;
        this.height = pixels[0].length;
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
        for(int i = 0; i < this.width; i++)
            for (int j = 0; j < this.height; j++){
                if (!palette.contains((pixels[i][j]))){
                    indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
                }


            }


    public void creatRepresentation(){
        palette = new ArrayList<>();
        palette.add(Color.WHITE);
        for(int i = 0; i < this.width; i++)
            for (int j = 0; j < this.height; j++){
                if (!palette.contains(palette.get(indexesOfColors[i][j]))){
                    indexesOfColors[i][j] = palette.indexOf(Color.WHITE);
                }
            }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.add(indexesOfColors[x][y]);
    }

    @Override
    public int getWidth() {
        return this.width;

    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPixelsColor(Color[][] pixels){
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++) {
                if (!palette.contains(pixels[i][j]))
                    palette.add(pixels[i][j]);
                indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
            }
    }
}
