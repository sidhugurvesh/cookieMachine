package TH4;

/**
 * The following is a sample output from running the code below:
 * <p>
 * Adding songs to Playlist:
 * Aiko Aiko added to Rich's Favs
 * Touch of Gray added to Rich's Favs
 * Dazed and Confused added to Rich's Favs
 * Whole Lotta Love added to Rich's Favs
 * Volcano added to Rich's Favs
 * <p>
 * Turning up the volume:
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 2 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 3 - Play mode: Normal
 * <p>
 * Normal Mode:
 * Playlist: Rich's Favs - Current Song: Touch of Gray - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Dazed and Confused - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Whole Lotta Love - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Volcano - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Touch of Gray - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Dazed and Confused - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Whole Lotta Love - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Volcano - Volume: 3 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 3 - Play mode: Normal
 * <p>
 * About to mute the song
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 0 - Play mode: Normal
 * Trying to reduce the volume below 0
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 0 - Play mode: Normal
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Normal
 * <p>
 * Random Play
 * Playlist: Rich's Favs - Current Song: Whole Lotta Love - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Volcano - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Dazed and Confused - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Whole Lotta Love - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Volcano - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Random
 * Playlist: Rich's Favs - Current Song: Aiko Aiko - Volume: 1 - Play mode: Random
 * <p>
 * Getting the entire Playlist:
 * <p>
 * Rich's Favs
 * 0. Aiko Aiko
 * 1. Touch of Gray
 * 2. Dazed and Confused
 * 3. Whole Lotta Love
 * 4. Volcano
 * <p>
 * <p>
 * Finding the song Touch of Gray and the going to that song:
 * Playlist: Rich's Favs - Current Song: Touch of Gray - Volume: 1 - Play mode: Random
 * <p>
 */
public class Ipod
{
   public static void main (String[] args) throws Exception
   {
      //instantiate a Playlist object and load 8 songs into it
      PlayList p1 = new PlayList("Rich's Favs");

      System.out.println("Adding songs to Playlist:");
      p1.addSong("Aiko Aiko");
      p1.addSong("Touch of Gray");
      p1.addSong("Dazed and Confused");
      p1.addSong("Whole Lotta Love");
      p1.addSong("Volcano");

      System.out.println("\nTurning up the volume:");
      p1.volumeUp();
      p1.volumeUp();
      p1.volumeUp();
      //prove that the Playlist object works as expected

      System.out.println("\nNormal Mode:");
      for (int i = 0; i < 10; i++) {
         p1.nextSong();
      }
//
      System.out.println("\nAbout to mute the song");
      p1.mute();
      System.out.println("Trying to reduce the volume below 0");
      p1.volumeDown();
      System.out.println("Increasing volume by 1");
      p1.volumeUp();
//
////      prove that system works in Random play mode
      System.out.println("\nRandom Play");
      p1.setRandomPlay(true);
      for (int i = 0; i < 10; i++) {
         p1.nextSong();
      }
////
      System.out.println("\nGetting the entire Playlist:");
      System.out.println(p1.getPlayList());
////
////
////// BONUS:
      System.out.println("\nFinding the song Touch of Gray and then going to that song:");
      int songIndex = p1.findSongPosition("Touch of Gray");
      p1.gotoSongIndex(songIndex);
   }
}
