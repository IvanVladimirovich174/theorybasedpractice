package com.mapstruct.mapstruct.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "authors")
public class Author {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_generator")
    @SequenceGenerator(name = "author_id_generator", sequenceName = "seq_author_id", allocationSize = 1)
    @Column(name = "author_id")
    private Long id;

    @Basic
    @Column(name = "author_fio")
    private String authorFIO;

    @Basic
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date")
    private Date birthDate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "books_authors",
            joinColumns = @JoinColumn(name = "author_id"),
            foreignKey = @ForeignKey(name = "FK_AUTHORS_BOOKS"),
            inverseJoinColumns = @JoinColumn(name = "book_id"),
            inverseForeignKey = @ForeignKey(name = "FK_BOOKS_AUTHORS"))
    private Set<Book> books = new HashSet<>();
}