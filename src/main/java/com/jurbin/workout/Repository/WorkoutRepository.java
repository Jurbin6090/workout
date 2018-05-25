package com.jurbin.workout.Repository;

import com.jurbin.workout.Entity.Workout;
import com.jurbin.workout.Enum.WorkoutType;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
    public List<Workout> findAllByDate(Date date);
    public List<Workout> findAllByUserId(String userId);
    public List<Workout> findAllByUserIdAndWorkoutTypeOrderByDateDesc(String userId, WorkoutType workoutType);

}
