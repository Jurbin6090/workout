package com.jurbin.workout.workout.Repository;

import com.jurbin.workout.workout.Entity.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
}
