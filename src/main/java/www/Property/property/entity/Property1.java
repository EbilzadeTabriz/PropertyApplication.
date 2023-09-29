package www.Property.property.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Property")
public class Property1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long propertyId;

    @NotEmpty
    @NotBlank
    @Column(name = "TEXT")
    private String title;
    @NotNull
    @Column(name = "Price")
    private Double price;


    @NotEmpty
    @NotBlank
    @Column(name = "City")
    private String city;

    @NotEmpty
    @NotBlank
    @Column(name = "Distirict")
    private String distirict;

    @NotEmpty
    @NotBlank
    @Column(name = "bedrooms")
    private Integer bedrooms;
    @NotEmpty
    @NotBlank
    @Column(name = "Bathroom")
    private Integer bathroom;

    @NotEmpty
    @NotBlank
    @Column(name = "ContactInformation")
    private String contactInformation;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PropertyImage> images;


    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;




}
