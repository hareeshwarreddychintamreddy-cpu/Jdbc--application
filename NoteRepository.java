package com.example.notesapp.repository;

import com.example.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

// REPOSITORY: gives ready-made save, findAll, deleteById, etc.
public interface NoteRepository extends JpaRepository<Note, Long> {
}
