package com.syrisa.springbootdockerinaws.entity;

import com.syrisa.springbootdockerinaws.utilties.musictype.MusicType;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Music {
    private Long id;
    private String singer;
    private String musicName;
    private MusicType musicType;
    private LocalDate releaseDate;
}
