package movie.userservice.http.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import movie.userservice.entities.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HttpUser {
    // cannot have ID here so separate class is needed
    @NotNull
    @Size(min=50)
    private String name;

    @NotNull
    @Size(min=8)
    private String userName;


    @NotNull
    @Size(min=8)
    private String password;

    @NotNull
    @Size(min=50)
    private String address;

    @NotNull
    @Size(min=20)
    private String city;

    @Size(min=16, max=16)   //enforce only digits
    private String creditCardNumber;

    @Size(min=7, max=7)   //MM-yyyy
    private String expiryDate;

    public static HttpUser convert(User user ){
//        return HttpUser.builder()
//                .fullName(user.getFullName())
//                .userName(user.getUserName())   //password is not repeated
//                .streetAddress(user.getBillingStreetAddress())
//                .creditCardNumber(user.getCreditCardNumber())
//                .expiryDate(user.getExpiryDate())
//                .city(user.getBillingCity())
//                .state(user.getBillingState())
//                .zipcode(user.getBillingZipcode())
//                .build();
        return null;

    }



}
