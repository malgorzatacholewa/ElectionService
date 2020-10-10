package pl.sda.electionsService.domein.elections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Election {

    Long id;
    Date date;
    ElectionType type;

}
