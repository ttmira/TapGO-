package zhat.TapGO.entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, name="MySequenceGenerator")
    @SequenceGenerator(allocationSize=1, schema="public",
            name="MySequenceGenerator", sequence="mysequence")
    private Long placeId;

    @Column
    private String placeName;

    @Column
    private String location;

    @Column
    private String category;

    @Column
    private List<String> photos;

    @OneToMany
    @JoinColumn(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Event> events;


    @OneToMany
    @JoinColumn(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> reviews;
}
