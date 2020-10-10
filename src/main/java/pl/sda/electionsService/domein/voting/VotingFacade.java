package pl.sda.electionsService.domein.voting;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.electionsService.domein.Candidate.CandidateDto;
import pl.sda.electionsService.infrastructure.service.voting.CandidateRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class VotingFacade {

    VotingRepository repository;
    CandidateRepository candidateRepository;


    public List<VotingCardDto> getVotingList(Long idElections) {
        List<VotingCardDto> votingCardList = new ArrayList<>();
        Optional<VotingCard> card = repository.findAll().stream()
                .filter(votingCard -> votingCard.idElection == idElections)
                .findFirst();
        List<VotingList> electionList = card.get().electionList;
        for (VotingList partyNumber: electionList){
            VotingCardDto cardDto = new VotingCardDto();
            List<CandidateDto> listOfcandidate = new ArrayList<>();
            for (Long pesel : partyNumber.listOfCandidateId){
               CandidateDto candidateDto = candidateRepository.getCandidateByPesel(pesel);
               listOfcandidate.add(candidateDto);
            }
            cardDto.setNumberOfParty(partyNumber.numberOfParty);
            cardDto.setCandidateDtos(listOfcandidate);
            votingCardList.add(cardDto);
        }
        return votingCardList;
    }
}
