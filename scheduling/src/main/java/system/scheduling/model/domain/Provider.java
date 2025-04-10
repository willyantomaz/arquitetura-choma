package system.scheduling.model.domain;

import jakarta.persistence.*;
import lombok.*;
import system.scheduling.interfaces.PersonInterface;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "service_providers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider implements PersonInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Job> jobs = new ArrayList<>();

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule = new Schedule();

    @Override
    public String getBasicInfo() {
        return "Nome: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Telefone: " + this.phone;
    }
}

