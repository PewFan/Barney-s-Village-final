package application;

import application.vue.TerrainVue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.TilePane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class controleur implements Initializable {

    @FXML
    private TilePane map;
    private Terrain terrain;
    private TerrainVue vueMap;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            this.terrain = new Terrain(8,8);
            this.vueMap = new TerrainVue(terrain,map);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
