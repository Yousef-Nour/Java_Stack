package com.axsos.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.lookify.models.Songs;
import com.axsos.lookify.services.SongsService;

@Controller
public class SongsController {
	public final SongsService songsService;

	public SongsController(SongsService songsService) {
		this.songsService = songsService;
	}
	
	@RequestMapping("")
	public String welcome() {
//		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		return "welcome.jsp";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("song")Songs song) {
		model.addAttribute("songs",songsService.allSongs());
		return "dashboard.jsp";
	}
	
//	@RequestMapping("/search")
//	public String search(@RequestParam("song") String song,Model model) {
//		model.addAttribute("ArtistSongs", songsService.getSon)
//	}
	
	
	//add new song
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song")Songs songs) {
		return "new.jsp";
	}
	
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Songs songs, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		else {
			songsService.createSongs(songs);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String details(@PathVariable("id") Long id, Model model) {
		Songs song = songsService.findSong(id);
		model.addAttribute("song", song);
		return "details.jsp";
	}
	//top ten
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		List<Songs> songs = songsService.topTen();
		model.addAttribute("songs", songs);
		return "topTen.jsp";
	}
	//search
	@GetMapping("/search")
	public String search(@RequestParam("q") String q, Model model) {
		List<Songs> songs = songsService.search(q);
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
}