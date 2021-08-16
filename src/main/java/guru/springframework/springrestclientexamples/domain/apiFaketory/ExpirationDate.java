package guru.springframework.springrestclientexamples.domain.apiFaketory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.TimeZone;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ExpirationDate {
    private LocalDateTime date;
    private int timeZoneType;
    private TimeZone timeZone;
}
