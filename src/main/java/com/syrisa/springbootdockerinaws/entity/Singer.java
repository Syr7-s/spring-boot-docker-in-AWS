package com.syrisa.springbootdockerinaws.entity;

import com.syrisa.springbootdockerinaws.dto.SingerDto;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Singer {
    private Long singerID;
    private String singerName;
    private String singerCountry;
    private LocalDate singerBirthDate;

    public SingerDto toSingerDto(){
        return SingerDto.builder()
                .singerID(this.singerID)
                .singerName(this.singerName)
                .singerCountry(this.singerCountry)
                .singerBirthDate(this.singerBirthDate)
                .build();
    }
}
