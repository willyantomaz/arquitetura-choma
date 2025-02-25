package system.scheduling.model.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "service_providers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private List<Job> jobs = new ArrayList<>();

    @OneToOne(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private Schedule schedule;
}

