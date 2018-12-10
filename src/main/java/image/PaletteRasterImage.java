package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

    List<Color> palette;
    int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height) {
        super(width,height);
        indexesOfColors = new int[width][height];
        palette.add(color);
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                if (!palette.contains(color))
                indexesOfColors[i][j] = palette.indexOf(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        super(pixels);
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
        for (int i = 0; i < this.width; i++)
            for (int j = 0; j < this.height; j++) {
                if (!palette.contains(pixels[i][j])) {
                    indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
                }
            }
    }


        public void creatRepresentation () {
            palette = new ArrayList<>();
            palette.add(Color.WHITE);
            for (int i = 0; i < this.width; i++)
                for (int j = 0; j < this.height; j++) {
                    if (!palette.contains(palette.get(indexesOfColors[i][j]))) {
                        indexesOfColors[i][j] = palette.indexOf(Color.WHITE);
                    }
                }
        }

        @Override
        public Color getPixelColor ( int x, int y){
            return super.getPixelColor(x,y);
        }

        @Override
        public int getWidth () {
            return super.getWidth();

        }

        @Override
        public int getHeight () {
            return super.getHeight();
        }

        public void setWidth (int width){
            super.setWidth(width);
        }

        public void setHeight (int height){
            super.setHeight(height);
        }

        public void setPixelsColor (Color[][]pixels){
            for (int i = 0; i < width; i++)
                for (int j = 0; j < height; j++) {
                    if (!palette.contains(pixels[i][j]))
                        palette.add(pixels[i][j]);
                    indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
                }
        }
    }

