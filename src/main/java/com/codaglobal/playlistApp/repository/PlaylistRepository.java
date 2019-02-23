package com.codaglobal.playlistApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codaglobal.playlistApp.domain.Playlist;

public interface PlaylistRepository extends CrudRepository<Playlist, Long> {
	List<Playlist> findTop50ByOrderByRankAsc();

	List<Playlist> findByArtists(String name);

	List<Playlist> findByName(String name);
}
