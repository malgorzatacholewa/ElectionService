package pl.sda.electionsService.domein.Candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDto {

    Long pesel;
    String firstName;
    String lastName;

}
