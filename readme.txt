Import the Netbeans Module (.zip) file into Netbeans and rename it to ZOP1-<your name>-TH4
You have been given the IPod class which will result in an output that looks something like this:
 
 
 
Write the PlayList class make our code work:
•	Instance Variables:
o	listName – contains the name of the playlist
o	volume  - stores the volume of music
o	songs – is an array of Strings with 10 elements that will contain a song name in each element
o	numSongs  - keeps track of how many songs have been added to the list –starts at 0.  Note that numSongs refers to how many songs have been added to the playlist. 
o	currentSongIndex – contains the index in the song array of the song currently being played – starts at 0.  Note that currentSongIndex refers to the song that is currently being played by the iPod.  It is different than numSongs.
o	randomPlay  - is a boolean.  If randomPlay is set to false, calling nextSong will move the currentSongIndex to the next song in the list.  (If the songIndex is at the end, make it loop back to song [0]
•	Methods
o	a constructor that takes the name of the playlist and uses it to set the appropriate instance variable
o	a setter for the randomPlay instance variable
o	updateDisplay which will print out:
	the playlist name
	the current song name that is playing
	the volume
	the current playmode – Random or Normal
	Note that updateDisplay  and addSong should be the only methods in your entire class that use sout!!!
o	volumeUp – will increment the volume but will not let the volume go past 10.  Do NOT throw an exception in this method
o	volumeDown – will decrease the volume but will not let the volume go negative.  Don NOT throw an exception in this method.
o	mute – will instantly set the volume to 0
o	addSong will accept a String containing a song name and will add it to the playlist.  It will also print out which song was added.  Note that updateDisplay  and addSong should be the only methods in your entire class that use sout!!!

o	getPlaylist will return a String containing the name of the playlist and all of the songs that are in the playlist
o	nextSong 
	 if randomPlay is set to false, this method will set the currentSongIndex to point to the next song in the playlist.  If the playlist is at the last song, it will set the currentSongIndex to be 0 or the first song in the playlist. (So the songs will start playing at the beginning again)
	if randomPlay is set to true, this method will set the current song to any random song in the playlist.  Note that all songs must have an equal chance of being played each time the nextSong method is called when randomPlay is set to true.
o	BONUS:
	findSongPosition which will return the index of the song name that matches the String passed into the method.  For instance, calling findSongPosition (“Aiko Aiko”) would return a 3 if our songs array had “Aiko Aiko” in the element at 3.
	gotoSongPosition which will allow the calling method to pass an int which it will use to set the song to that index in songs.
Once you have completed the assignment, export the project into a .zip file from Netbeans and submit it to the dropbox.  Make sure that the project has your name in the title!  I will deduct marks for incorrectly submitted projects.
