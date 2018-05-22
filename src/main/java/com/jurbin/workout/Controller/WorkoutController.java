package com.jurbin.workout.Controller;

import com.jurbin.workout.Entity.Workout;
import com.jurbin.workout.Entity.WorkoutSet;
import com.jurbin.workout.Repository.WorkoutRepository;
import com.jurbin.workout.Repository.WorkoutSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    WorkoutSetRepository workoutSetRepository;

    @PostMapping("/workout")
    public Workout createWorkout(@RequestBody Workout workout) {
        workout = workoutRepository.save(workout);

        for (WorkoutSet workoutSet : workout.getWorkoutSetList()) {
            workoutSet.setWorkout(workout);
            workoutSetRepository.save(workoutSet);
        }

        return workout;
    }

    @GetMapping("/workout")
    public List<Workout> getWorkouts() {
        List<Workout> workoutList = new ArrayList<>();
        workoutRepository.findAll().forEach(workoutList::add);
        return workoutList;
    }

    @GetMapping("/workout/date")
    public List<Workout> getWorkouts(@RequestParam(value = "date") @DateTimeFormat(pattern = "MMddyyyy") Date date) {
        List<Workout> workoutList = new ArrayList<>();
        workoutRepository.findAllByDate(date).forEach(workoutList::add);
        return workoutList;
    }

    @PatchMapping("/workout")
    public Workout updateWorkout(@RequestBody Workout workout){
        for (WorkoutSet workoutSet : workout.getWorkoutSetList()) {
            workoutSet.setWorkout(workout);
            workoutSetRepository.save(workoutSet);
        }

        workout = workoutRepository.save(workout);

        return workout;
    }

    @DeleteMapping("/workout/{id}")
    public Boolean deleteWorkout(@PathVariable Integer id){
        Optional<Workout> workout = workoutRepository.findById(id);

        if(workout.isPresent()){
            for (WorkoutSet workoutSet : workout.get().getWorkoutSetList()) {
                workoutSetRepository.deleteById(workoutSet.getId());
            }
        }

        workoutRepository.deleteById(id);
        return true;
    }

    @DeleteMapping("set/{id}")
    public Boolean deleteSet(@PathVariable Integer id){
        workoutSetRepository.deleteById(id);
        return true;
    }
}
