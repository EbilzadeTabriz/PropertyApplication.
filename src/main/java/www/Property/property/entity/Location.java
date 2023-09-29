package www.Property.property.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.yaml.snakeyaml.introspector.Property;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long locationId;
    @NotEmpty
    @NotEmpty
    @Column(name ="District")
    private String district;
    @NotEmpty
    @NotEmpty
    @Column(name= "City")
    private String city;
    @NotEmpty
    @NotBlank
    @Column(name = "Neighborhood")
    private String neighborhood;
//    @OneToMany(mappedBy = "location")
//    private List<Property> properties;
}
