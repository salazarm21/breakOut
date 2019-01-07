/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbreakout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FinalBreakOut extends JFrame {

    public FinalBreakOut() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        setTitle("Breakout");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGTH);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            FinalBreakOut game = new FinalBreakOut();
            game.setVisible(true);
        });
    }
}