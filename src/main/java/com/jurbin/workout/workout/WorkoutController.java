package com.jurbin.workout.workout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/workout")
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutRepository.save(workout);
    }

    @GetMapping
    public List<Workout> getWorkouts() {
        List<Workout> workoutList = new ArrayList<>();
        workoutRepository.findAll().forEach(workoutList::add);
        return workoutList;
    }
}
