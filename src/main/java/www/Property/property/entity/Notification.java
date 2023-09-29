package www.Property.property.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long notificationId;

    @Column(name ="MessageSent")
    private LocalDate sentAt;
    @NotBlank
    @NotEmpty
    @Column(name ="Message")
    private String message;


//    @ManyToOne
//    @JoinColumn(name="user_id",referencedColumnName = "id")
//    private User user;
//
@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
