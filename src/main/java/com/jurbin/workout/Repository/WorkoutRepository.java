package com.jurbin.workout.Repository;

import com.jurbin.workout.Entity.Workout;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
    public List<Workout> findAllByDate(Date date);
}
