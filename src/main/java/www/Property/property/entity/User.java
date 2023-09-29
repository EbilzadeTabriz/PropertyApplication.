package www.Property.property.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "UserMapper")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotEmpty
    @Column(name = "FullName")
    private String userFullName;
    @NotEmpty
    @NotBlank
    @Column(name = "Password")
    private String password;
    @NotEmpty
    @NotBlank
    @Column(name = "Email")
    private String email;
    @NotEmpty
    @NotBlank
    @Column(name = "PhoneNumber")
    private Integer phoneNumber;
    @NotNull
    @Column(name = "BirthInformation")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthInformation;
    private Boolean isActive;


//    @OneToMany(mappedBy = "user")
//    private List<Notification> notifications;

//   @OneToMany(mappedBy = "user")
// private List<Property1> property1s;

    @Enumerated(EnumType.STRING)
    Role role;
@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Notification> notifications;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Property1> properties;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecentlyViewedProperty> recentlyViewedProperties;

}
