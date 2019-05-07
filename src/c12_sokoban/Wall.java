package c12_sokoban;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Wall extends Actor {

    private Image image;

    public Wall(int x, int y) {
        super(x, y);
        
        initWall();
    }
    
    private void initWall() {
        
        ImageIcon iicon = new ImageIcon(getClass().getResource("resources/wall.png"));
        image = iicon.getImage();
        setImage(image);
    }
}
