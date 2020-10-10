package pl.sda.electionsService.domein.voting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class VotingList {

    Long id;
    Long numberOfParty;
    List<Integer> listOfCandidateId;

}
