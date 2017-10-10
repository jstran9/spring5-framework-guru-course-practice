package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(exclude = "recipes")
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    // there is a data member named "categories" in the Recipe class
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
