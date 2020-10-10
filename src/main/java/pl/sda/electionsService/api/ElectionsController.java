package pl.sda.electionsService.api;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.electionsService.domein.voting.VotingCard;
import pl.sda.electionsService.domein.voting.VotingFacade;
import pl.sda.electionsService.domein.voting.VotingResponse;

@RestController
@AllArgsConstructor
public class ElectionsController {

    private VotingFacade facade;

    @GetMapping("/voting/{idElections}")
    ResponseEntity<VotingResponse> getVotingList (@PathVariable Long idElections) {
        VotingResponse response = new VotingResponse();
        try {
            VotingCard votingCard = facade.getVotingList(idElections);
            response.setVotingCard(votingCard);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setErrorMessage(e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
