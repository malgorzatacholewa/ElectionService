package pl.sda.electionsService.domein.voting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.sda.electionsService.domein.Candidate.CandidateDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class VotingCardDto {
    private Long numberOfParty;
    private List<CandidateDto> candidateDtos;





}
