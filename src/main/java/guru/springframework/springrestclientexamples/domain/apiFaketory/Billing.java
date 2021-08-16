package guru.springframework.springrestclientexamples.domain.apiFaketory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Billing {
    private Card card;
    private String iban;
    private String swift;
}
