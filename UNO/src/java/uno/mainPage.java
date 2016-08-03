/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author SATHIYAMOORTHYVELU
 */
public class mainPage {
    public static void Main (String args[]) {
            
        Player a=new Player("01","sugan");Player b=new Player("02","surya");Player c=new Player("03","subi");
        Player d=new Player("04","raj");Player e=new Player("05","ridhun");
        Game game=new Game("UNO-01");
        game.CreateNewGame();//create a new deck
        game.addplayer(a);game.addplayer(b);game.addplayer(c);//add players
        game.addplayer(d);game.addplayer(e);
        game.StartGame();//discard a card and send start cards for players
        game.showGameInformation();
         }
  
}
