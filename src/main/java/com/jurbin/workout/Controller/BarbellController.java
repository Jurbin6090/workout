package com.jurbin.workout.Controller;

import com.jurbin.workout.Entity.Weights;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BarbellController {

    @PostMapping("/calc")
    public Weights calc(@RequestBody int weightReceived){
        int barbellWeight;
        Weights weights = new Weights();

        if (weightReceived > 45) {
            barbellWeight = weightReceived - 45;
            while (barbellWeight > 0) {
                if (barbellWeight >= 90) {
                    barbellWeight = barbellWeight - 90;
                    weights.setFortyFives(weights.getFortyFives() + 2);
                } else if (barbellWeight >= 50) {
                    barbellWeight = barbellWeight - 50;
                    weights.setTwentyFives(weights.getTwentyFives() + 2);
                } else if (barbellWeight >= 20) {
                    barbellWeight = barbellWeight - 20;
                    weights.setTens(weights.getTens() + 2);
                } else if (barbellWeight >= 10) {
                    barbellWeight = barbellWeight - 10;
                    weights.setFives(weights.getFives() + 2);
                } else if (barbellWeight >= 5) {
                    barbellWeight = barbellWeight - 5;
                    weights.setTwoPointFives(weights.getTwoPointFives() + 2);
                } else {
                    weights.setExtraWeight(barbellWeight);
                    break;
                }
            }
        } else {
            weights.setErrors("Too little weight");
        }
        return weights;
    }
}
