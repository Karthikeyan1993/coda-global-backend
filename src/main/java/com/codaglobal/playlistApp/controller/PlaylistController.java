package com.codaglobal.playlistApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codaglobal.playlistApp.domain.Playlist;
import com.codaglobal.playlistApp.payload.ApiResponse;
import com.codaglobal.playlistApp.repository.PlaylistRepository;

@RestController
@RequestMapping("api/v1/playlist")
@CrossOrigin("*")
public class PlaylistController {

	@Autowired
	private PlaylistRepository repo;

	@GetMapping("test")
	public String test() {
		return "welcome";
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllSongs() {
		ApiResponse response = null;
		try {
			List<Playlist> data = (List<Playlist>) this.repo.findTop50ByOrderByRankAsc();
			response = new ApiResponse(data, true, "success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("{artist}")
	public ResponseEntity<?> searchByArtist(@PathVariable("artist") String artist) {
		ApiResponse response = null;
		try {
			List<Playlist> data = (List<Playlist>) this.repo.findByArtists(artist);
			response = new ApiResponse(data, true, "success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("find/{rank}")
	public ResponseEntity<?> findByRank(@PathVariable("rank") Long rank) {
		ApiResponse response = null;
		try {
			Optional<Playlist> data = this.repo.findById(rank);
			response = new ApiResponse(data, true, "success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
