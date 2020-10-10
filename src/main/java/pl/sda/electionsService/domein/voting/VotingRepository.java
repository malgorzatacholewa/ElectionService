package pl.sda.electionsService.domein.voting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<VotingCard,Long> {
}
