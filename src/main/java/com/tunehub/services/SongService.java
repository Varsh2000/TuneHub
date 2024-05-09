package com.tunehub.services;

import java.util.List;

import com.tunehub.entities.Song;

public interface SongService {

	public void addSong(Song song);
	public void updateSong(Song song);

	public List<Song> fetchAllSongs();

	boolean songExists(String name);

}
