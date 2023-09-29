package www.Property.property.entity;

import io.micrometer.common.lang.NonNullApi;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="PropertyType")
public class PropertyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long propertyTypeId;
    @NotBlank
    @NotEmpty
    @Column(name="Name")
    private String name;
    @NotBlank
    @NotEmpty
    @Column(name = "Description")
    private String description;
    @Column(name = "Image")
    private String image;


}
