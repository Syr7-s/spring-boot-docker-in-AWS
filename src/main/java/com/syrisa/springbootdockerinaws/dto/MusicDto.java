package com.syrisa.springbootdockerinaws.dto;

import com.syrisa.springbootdockerinaws.entity.Music;
import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.utilties.musictype.MusicType;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MusicDto {
    private Long id;
    private Singer singer;
    private String musicName;
    private MusicType musicType;
    private LocalDate releaseDate;

    public Music toMusic(){
        return Music.builder()
                .id(this.id)
                .singer(this.singer)
                .musicName(this.musicName)
                .musicType(this.musicType)
                .releaseDate(this.releaseDate)
                .build();
    }
}
