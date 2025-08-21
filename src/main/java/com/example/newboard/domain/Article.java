package com.example.newboard.domain;

import com.example.newboard.domain.User;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)  // 여기만 PUBLIC으로 변경
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
@Builder
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
