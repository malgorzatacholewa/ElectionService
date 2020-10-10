package pl.sda.electionsService.domein.voting;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class VotingFacade {

    VotingRepository repository;


    public VotingCard getVotingList(Long idElections) {
        Optional<VotingCard> card = repository.findAll().stream()
                .filter(votingCard -> votingCard.idElection == idElections)
                .findFirst();

        if (card.isPresent()){
            return card.get();
        }
         return null;
    }
}
