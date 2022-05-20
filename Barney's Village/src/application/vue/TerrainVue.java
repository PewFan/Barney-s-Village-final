package application.vue;


import application.Terrain;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class TerrainVue {
    private Terrain terrain;
    private TilePane map;

    public TerrainVue(Terrain terrain, TilePane map){
        this.terrain = terrain;
        this.map = map;
        this.afficherTerrain();
}

    private void afficherTerrain() {
        Image tileSet = new Image("images/Tileset.png");
        int nbTuiles = terrain.tailleListe();
        int x,y;
        for(int i = 0;i < nbTuiles;i++) {
            x = (terrain.idTuile(i) % 16) * 32;
            y = ((terrain.idTuile(i) % 16) * 32);
            ImageView imageview = new ImageView(tileSet);
            Rectangle2D tuile = new Rectangle2D(x, y, 32, 32);
            imageview.setViewport(tuile);
            map.getChildren().add(imageview);
        }
    }
}