package pl.sda.electionsService.domein.voting;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class VotingFacade {

    public VotingCard getVotingList(Long idElections) {
        return new VotingCard(1L,1L,new ArrayList<>());
    }
}
