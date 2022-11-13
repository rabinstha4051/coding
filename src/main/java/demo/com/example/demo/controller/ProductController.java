package demo.com.example.demo.controller;


import demo.com.example.demo.entity.Movie;
import demo.com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){

        return  movieService.saveMovie(movie);
    }

    @PostMapping("/addMovies")
    public  List<Movie> addMovies(@RequestBody List<Movie> movies){
        return  movieService.saveMovies(movies);
    }

    @GetMapping("/movies")
    public  List<Movie> findAllMovies() {

    return  movieService.getMovies();
    }
    @GetMapping("/movie/{id}")
    public  Movie findMovieById(@PathVariable int id){

        return  movieService.getMovieById(id);
    }
    @GetMapping("/movie/{name}")
    public  Movie findMovieByName(@PathVariable  String name){
        return  movieService.getMovieByName(name);
    }

    @PutMapping("/update")
    public  Movie updateMovie(@RequestBody Movie movie){
        return  movieService.updateMovie(movie);}
   @DeleteMapping("/delete/{id}")
    public  String deleteMovie(@PathVariable int id){
        return  movieService.deleteMovie(id);
    }

}
