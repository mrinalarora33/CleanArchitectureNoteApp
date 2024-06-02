package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import java.util.concurrent.Flow

interface NoteRepository {

    fun getNotes(): kotlinx.coroutines.flow.Flow<List<Note>>

    suspend fun getNoteById(id:Int):Note?

    suspend fun insertNote(note:Note)

    suspend fun deleteNote(note:Note)
}