package zhat.TapGO.entity;

import jakarta.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, name="MySequenceGenerator")
    @SequenceGenerator(allocationSize=1, schema="public",
            name="MySequenceGenerator", sequence="mysequence")
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String role;

    @OneToMany
    @JoinColumn(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> reviews;
}
