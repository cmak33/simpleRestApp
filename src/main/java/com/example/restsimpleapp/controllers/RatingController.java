package com.example.restsimpleapp.controllers;

import com.example.restsimpleapp.models.Rating;
import com.example.restsimpleapp.repositories.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
@RequiredArgsConstructor
public class RatingController {
    private final RatingRepository ratingRepository;

    @PostMapping("/add")
    public void addRating(@RequestBody Rating rating){
        ratingRepository.save(rating);
    }
}
