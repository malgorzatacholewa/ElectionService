package pl.sda.electionsService.applications;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.electionsService.domein.elections.Election;
import pl.sda.electionsService.domein.elections.ElectionType;
import pl.sda.electionsService.domein.voting.VotingCard;
import pl.sda.electionsService.domein.voting.VotingList;
import pl.sda.electionsService.domein.voting.VotingRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

@Component
@AllArgsConstructor
public class ElectionsService {

    VotingRepository votingRepository;

    @PostConstruct
    void save (){
        Election election = new Election(10L, LocalDate.now(), ElectionType.PARLIAMENTARY);
        VotingList votingList = new VotingList(1L,1L, Arrays.asList(1456L,1457L,1458L));
        VotingList votingList2 = new VotingList(2L,2L, Arrays.asList(1459L,1457L));
        VotingCard votingCard = new VotingCard(1L,10L,Arrays.asList(votingList,votingList2));
        votingRepository.save(votingCard);
    }

}
