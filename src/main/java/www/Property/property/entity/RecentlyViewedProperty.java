package www.Property.property.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Recently_Viewed_Property")
public class RecentlyViewedProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long RecentlyViewedPropertyId;

    @Column(name = "Viewed")
    private LocalDate viewedAt;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    /**  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

    @ManyToOne
    @JoinColumn(name = "propertyType_id")
    private PropertyType propertyType;

   **/



}
