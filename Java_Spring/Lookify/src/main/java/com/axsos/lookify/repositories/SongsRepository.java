package com.axsos.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.lookify.models.Songs;

@Repository
public interface SongsRepository extends CrudRepository<Songs, Long>{
	List<Songs> findAll();
	List<Songs> findTop10ByOrderByRatingDesc();
	List<Songs> findByArtistContaining(String search);
}
