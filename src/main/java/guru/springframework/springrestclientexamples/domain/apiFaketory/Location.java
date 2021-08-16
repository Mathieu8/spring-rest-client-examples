package guru.springframework.springrestclientexamples.domain.apiFaketory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Location {
    private String street;
    private String city;
    private String state;
    private String postcode;
}
