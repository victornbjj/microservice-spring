package  com.devdojo.core.database.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity 
@Table(name = "course")
@Data 
@AllArgsConstructor 
@NoArgsConstructor 

public class CourseEntity {
     
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
  
    @NotNull(message = "The field 'title' is mandatory" )
    @Column(nullable = false)
    private String title;


}
