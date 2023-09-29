package www.Property.property.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "property_images")
public class PropertyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "image_link")
    private String property_images;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property1 property;

//    @ManyToOne
//    @JoinColumn(name = "property_id")
//    private Property1 property;


}
