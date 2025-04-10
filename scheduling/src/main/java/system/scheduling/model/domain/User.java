package system.scheduling.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import system.scheduling.interfaces.PersonInterface;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements PersonInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Appointment> appointments = new ArrayList<>();

    @Column(nullable = false)
    private String document;

    @Override
    public String getBasicInfo() {
        return "Nome: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Telefone: " + this.phone;
    }
}

