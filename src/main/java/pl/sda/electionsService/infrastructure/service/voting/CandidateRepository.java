package pl.sda.electionsService.infrastructure.service.voting;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.sda.electionsService.domein.Candidate.CandidateDto;
import pl.sda.electionsService.domein.Candidate.CandidateResponse;

@Component
@AllArgsConstructor
public class CandidateRepository {


    private RestTemplate restTemplate;

    public CandidateDto getCandidateByPesel (Long pesel) {
        ResponseEntity<CandidateResponse> response = restTemplate.getForEntity("http://localhost:8081/candidate/" + pesel, CandidateResponse.class);
        return response.getBody().getCandidateDto();
    }
}
