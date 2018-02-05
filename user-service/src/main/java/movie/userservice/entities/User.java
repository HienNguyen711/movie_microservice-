package movie.userservice.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name="USERS")
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "USERNAME")
    @NotNull
    private String userName;

    @Column(name="PASSWORD")
    @NotNull
    private String password;

    @Column(name="ADDRESS")
    @NotNull
    private String address;

    @Column(name="CITY")
    @NotNull
    private String city;

    @Column(name="CREDITCARDNUMBER")
    @NotNull
    private String creditCardNumber;


    @Column(name="EXPIRYDATE")
    @NotNull
    private String expiryDate;


}
