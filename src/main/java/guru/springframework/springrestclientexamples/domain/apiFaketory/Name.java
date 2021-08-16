package guru.springframework.springrestclientexamples.domain.apiFaketory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Name {
    private String tittle;
    private String first;
    private String last;
}
