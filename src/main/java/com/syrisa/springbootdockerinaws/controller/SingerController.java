package com.syrisa.springbootdockerinaws.controller;

import com.syrisa.springbootdockerinaws.dto.SingerDto;
import com.syrisa.springbootdockerinaws.entity.Singer;
import com.syrisa.springbootdockerinaws.service.SingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/springawsdocker/singer")
@RequiredArgsConstructor
public class SingerController {
    private final SingerService singerService;

    @PostMapping("/create")
    public SingerDto crate(@RequestBody SingerDto singerDto){
        try{
            return singerService.create(singerDto.toSinger()).toSingerDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        }
    }

    @PutMapping("/update")
    public SingerDto update(@RequestBody SingerDto singerDto){
        try{
            return singerService.update(singerDto.toSinger()).toSingerDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public SingerDto getSingerByID(@PathVariable("id") Long id){
        try{
            return singerService.getByID(id).toSingerDto();
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        }
    }

    @GetMapping(value = "/all")
    public List<SingerDto> getAll(){
        return singerService.getAll().stream().map(Singer::toSingerDto).collect(Collectors.toList());
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        try{
            return singerService.delete(id);
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        }
    }
}
