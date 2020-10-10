package pl.sda.electionsService.domein.voting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "votingList")
public class VotingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long numberOfParty;
    @ElementCollection
    List<Long> listOfCandidateId;

}
