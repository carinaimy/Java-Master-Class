import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            Song newSong = new Song(title,duration);
            songs.add(newSong);
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        Iterator<Song> songIterator = songs.iterator();
        while(songIterator.hasNext()){
            Song currSong = songIterator.next();
            if(currSong.getTitle().equals(title)){
                return currSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumberInAlbum, LinkedList<Song> playList){
        //the track number of the song in the album
        if(songs.size()>=trackNumberInAlbum && trackNumberInAlbum>0){
            Song currSong = songs.get(trackNumberInAlbum-1);
            playList.add(currSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        //ArrayList<Album> albums = new ArrayList<>();
        //LinkedList<Song> playList = new LinkedList<Song>();
        //albums.get(0).addToPlayList("You can't do it right", playList);
        if(findSong(title)!=null){
            Song currSong = findSong(title);
            playList.add(currSong);
            return true;
        }
        return false;
    }


}
