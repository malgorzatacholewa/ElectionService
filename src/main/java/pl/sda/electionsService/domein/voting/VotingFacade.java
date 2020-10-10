package pl.sda.electionsService.domein.voting;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor
@Component
public class VotingFacade {

    VotingRepository repository;


    public VotingCard getVotingList(Long idElections) {
        Optional<VotingCard> votingCard = repository.findById(idElections);
        if (votingCard.isPresent()){
            return votingCard.get();
        }
         return null;
    }
}
