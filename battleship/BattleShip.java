/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleship;

import battleship.ui.FrameManageship;
import battleship.ui.FrameSplashscreen;

public class BattleShip {
    public static void main(String arg[]){
        FrameSplashscreen intro = new FrameSplashscreen();
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            
        }
        intro.setVisible(false);
        
        FrameManageship manage = new FrameManageship();
        manage.setVisible(true);
    }
}
