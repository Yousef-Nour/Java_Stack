package com.axsos.lookify.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.axsos.lookify.models.Songs;
import com.axsos.lookify.repositories.SongsRepository;

@Service
public class SongsService {
	
	private final SongsRepository songsRepository;

	public SongsService(SongsRepository songsRepository) {
		this.songsRepository = songsRepository;
	}
	
	//retrieves all songs
	public List<Songs> allSongs(){
		return songsRepository.findAll();
	}
	
	//retrieves a specified song chosen by id
	public Songs findSong(Long id) {
		Optional<Songs> optionalSong =  songsRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		}
		else {
			return null;
		}
	}

	public Songs createSongs(Songs b) {
        return songsRepository.save(b);
    }
	
	public List<Songs> topTen(){
		return songsRepository.findTop10ByOrderByRatingDesc();
	}
	
	public List<Songs> search(String search) {
		return songsRepository.findByArtistContaining(search);
	}
	
	
}
