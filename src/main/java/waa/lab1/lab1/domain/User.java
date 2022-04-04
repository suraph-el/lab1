package waa.lab1.lab1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_posts",referencedColumnName = "id")
    private List<Post> posts;
}
