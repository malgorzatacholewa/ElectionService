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
@Table (name = "VotingCard")
public class VotingCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long idElection;
    @ElementCollection
    List<Long> electionList;
}
