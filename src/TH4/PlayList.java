package TH4;
import java.util.Random;
/**
 * @author Gurvesh Sidhu
 */
public class PlayList
{
   String listName;
   String[] songs = new String[10];
   private int volume;
   private int numSongs;
   private int currentSongIndex;
   private Boolean randomPlay = false;

   public PlayList (String playListName)
   {
      this.listName = playListName;
   }

   public void setRandomPlay (boolean booleanValue)
   {
      this.randomPlay = booleanValue;
   }

   public void addSong (String songName)
   {
      songs[this.numSongs] = songName;
      this.numSongs++;
      System.out.println("\t" + songName + " added to " + this.listName);
   }

   public String getPlayList ()
   {
      String output = "\n" + this.listName + "\n";
      for (int inner = 0; inner < this.numSongs; inner++) {
         output += "\t" + inner + "." + this.songs[inner] + "\n";
      }
      return output;
   }

   public void nextSong ()
   {
      Random rnd = new Random();
      if (randomPlay) {
         this.currentSongIndex = rnd.nextInt(this.numSongs);
      }
      else {
         if (this.currentSongIndex == this.numSongs - 1) {
            this.currentSongIndex = 0;
         }
         else {
            this.currentSongIndex++;
         }
      }
      this.updateDisplay();
   }

   public void volumeUp ()
   {
      if (this.volume < 10) {
         volume++;
      }
      this.updateDisplay();
   }

   public void updateDisplay ()
   {
      String playMode;
      if (this.randomPlay) {
         playMode = "Random";
      }
      else {
         playMode = "Normal";
      }
      System.out.println("\t" + "Playlist: " + this.listName + "  -  " + "Current Song: " + this.songs[this.currentSongIndex] + "   -   " + "Volume: " + this.volume + "  -  " + "Play mode: " + playMode);
   }

   public void volumeDown ()
   {
      if (this.volume > 0) {
         volume--;
      }
      this.updateDisplay();
   }

   public void mute ()
   {
      this.volume = 0;
      this.updateDisplay();
   }


   //bonus got a question? what if the song searched is not in the playlist. how to throw error.

   public int findSongPosition (String songName) throws Exception
   {
      int output = 0;
      for (int i = 0; i < this.numSongs; i++) {
         if (this.songs[i].equalsIgnoreCase(songName)) {
            output = i;
         }
      }
      return output;
   }

   public void gotoSongIndex (int songIndex)
   {
      this.currentSongIndex = songIndex;
      this.randomPlay = false;
      this.updateDisplay();
   }
}
