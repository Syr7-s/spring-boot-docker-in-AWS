package com.syrisa.springbootdockerinaws.entity;

import com.syrisa.springbootdockerinaws.dto.MusicDto;
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
    private Singer singer;
    private String musicName;
    private MusicType musicType;
    private LocalDate releaseDate;

    public MusicDto toMusicDto(){
        return MusicDto.builder()
                .id(this.id)
                .singer(this.singer)
                .musicName(this.musicName)
                .musicType(this.musicType)
                .releaseDate(this.releaseDate)
                .build();
    }
}
