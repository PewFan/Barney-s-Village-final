package application;


import java.io.*;
import java.util.ArrayList;


public class Terrain {

	private int largeur;
	private int hauteur;
	//private int [][]map;
    private ArrayList<Integer> tuiles;


    public Terrain (int largeur, int hauteur) throws IOException {
	this.largeur = largeur;
	this.hauteur = hauteur;
    this.tuiles = new ArrayList<Integer>();
    this.lireMap(20,20);
	}
    public void lireMap ( int longueur, int largeur) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("application/fxml/Nightmap.csv"));
        String ligne = null;
        while ((ligne = br.readLine()) != null)
        {
            // Retourner la ligne dans un tableau
            String[] data = ligne.split(",");

            // Afficher le contenu du tableau
            for (String val : data)
            {
                System.out.print(val+"|");
                tuiles.add(Integer.parseInt(val));
            }
            System.out.println();
        }
        br.close();
    }
    public int tailleListe(){
        return this.tuiles.size();
    }

    public int idTuile(int i){
        return this.tuiles.get(i);
    }
    }
