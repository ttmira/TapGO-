package zhat.TapGO.entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, name="MySequenceGenerator")
    @SequenceGenerator(allocationSize=1, schema="public",
            name="MySequenceGenerator", sequence="mysequence")
    private Long eventId;

    @Column
    private String eventName;

    @Column
    private String description;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;


}
