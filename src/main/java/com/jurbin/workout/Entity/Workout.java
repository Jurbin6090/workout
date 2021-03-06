package com.jurbin.workout.Entity;

import com.jurbin.workout.Enum.WorkoutType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "workout")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_id")
    @NotNull
    private String userId;

    @Column(name="workout_date")
    @NotNull
    private Date date;

    @Column(name="workout_type")
    @NotNull
    private WorkoutType workoutType;

    @OneToMany(mappedBy = "workout")
    private List<WorkoutSet> workoutSetList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

    public List<WorkoutSet> getWorkoutSetList() {
        return workoutSetList;
    }

    public void setWorkoutSetList(List<WorkoutSet> workoutSetList) {
        this.workoutSetList = workoutSetList;
    }
}
