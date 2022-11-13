package demo.com.example.demo.repository;

import demo.com.example.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByName(String name);
}
