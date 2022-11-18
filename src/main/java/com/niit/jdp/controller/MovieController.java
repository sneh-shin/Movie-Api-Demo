/*
 *Author Name: Sneha Shinde
 *Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.controller;

import com.niit.jdp.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private MovieServiceImpl movieServiceImpl;

    @Autowired

    public MovieController(MovieServiceImpl movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }
}
