package com.syrisa.springbootdockerinaws.dto;

import com.syrisa.springbootdockerinaws.entity.Singer;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SingerDto {

    private Long singerID;
    private String singerName;
    private String singerCountry;
    private LocalDate singerBirthDate;

    public Singer toSinger(){
        return Singer.builder()
                .singerID(this.singerID)
                .singerName(this.singerName)
                .singerCountry(this.singerCountry)
                .singerBirthDate(this.singerBirthDate)
                .build();
    }
}
