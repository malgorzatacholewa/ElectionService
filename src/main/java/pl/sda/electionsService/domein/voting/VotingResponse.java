package pl.sda.electionsService.domein.voting;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VotingResponse {
    List<VotingCardDto> votingCard;
    String errorMessage;


}
