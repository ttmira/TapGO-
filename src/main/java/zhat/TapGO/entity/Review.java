package zhat.TapGO.entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, name="MySequenceGenerator")
    @SequenceGenerator(allocationSize=1, schema="public",
            name="MySequenceGenerator", sequence="mysequence")
    private Long reviewId;

    @Column
    private String description;

    @Column
    private float rating;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
