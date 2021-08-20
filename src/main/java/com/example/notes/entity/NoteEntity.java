package com.example.notes.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "notes")
@Data
public class NoteEntity {

    @Id
    private String id;

    private String content;
    private Timestamp createdAt;

}
