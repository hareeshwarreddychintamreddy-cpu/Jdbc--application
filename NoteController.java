package com.example.notesapp.controller;

import com.example.notesapp.model.Note;
import com.example.notesapp.repository.NoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// CONTROLLER: handles browser requests and picks the view (HTML page)
@Controller
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("notes", noteRepository.findAll());
        model.addAttribute("note", new Note());
        return "index";
    }

    @PostMapping("/add")
    public String add(Note note) {
        noteRepository.save(note);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        noteRepository.deleteById(id);
        return "redirect:/";
    }
}
