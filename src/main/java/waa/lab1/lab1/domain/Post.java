package waa.lab1.lab1.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;
    String content;
    String author;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="comment_id")
    private List<Comments> comments;


}
