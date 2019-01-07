/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbreakout;

/**
 *
 * @author marina
 */
import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {
        
        initBrick(x, y);
    }

    //Brick(int i, int i0) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    private void initBrick(int x, int y) {
        
        this.x = x;
        this.y = y;
        
        destroyed = false;

        loadImage();
        getImageDimensions();
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("src/resources/brick.png");
        image = ii.getImage();        
    }

    public boolean isDestroyed() {
        
        return destroyed;
    }

    public void setDestroyed(boolean val) {
        
        destroyed = val;
    }
}

