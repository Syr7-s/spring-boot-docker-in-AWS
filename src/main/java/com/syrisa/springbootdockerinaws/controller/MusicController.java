package com.syrisa.springbootdockerinaws.controller;

import com.syrisa.springbootdockerinaws.dto.MusicDto;
import com.syrisa.springbootdockerinaws.entity.Music;
import com.syrisa.springbootdockerinaws.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/springawsdocker/music")
@RequiredArgsConstructor
public class MusicController {
    private final MusicService musicService;

    @PostMapping("/create")
    public MusicDto create(@RequestBody MusicDto musicDto){
        try{
            return musicService.create(musicDto.toMusic()).toMusicDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }

    @PutMapping("/update")
    public MusicDto update(@RequestBody MusicDto musicDto){
        try{
            return musicService.update(musicDto.toMusic()).toMusicDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }

    @GetMapping("/music/{id}/{musicName}")
    public MusicDto getMusicByAndMusicName(@PathVariable("id") Long id,@PathVariable("musicName") String musicName){
        try{
            return musicService.getMusicByIdAndMusicName(id,musicName).toMusicDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public List<MusicDto> getMusicBy(@PathVariable("id") Long id){
        try{
            return musicService.getMusicBy(id).stream().map(Music::toMusicDto).collect(Collectors.toList());
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        try{
            return musicService.delete(id);
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}/{musicName}")
    public String delete(@PathVariable("id") Long id,@PathVariable("musicName") String musicName){
        try{
            return musicService.deleteMusicByMusicIdAndMusicName(id,musicName);
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        }
    }
}
