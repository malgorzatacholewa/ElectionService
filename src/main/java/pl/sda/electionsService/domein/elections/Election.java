package pl.sda.electionsService.domein.elections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Election {

    Long id;
    LocalDate date;
    ElectionType type;

}
