package org.verifications;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private Trainer trainer;
    private List<Trainee> trainees;

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public void startLesson() {
        trainer.teach();
        if( trainees != null)
            for (Trainee trainee : trainees){
                trainee.learn();
        }
    }

    public void endLesson(){
        trainer.prepareLesson();
    }

    public void startExam(String topic) {
        trainer.invigilateExam(topic);
    }

    public void reviewAllTraineeCode() {
        for(Trainee trainee : trainees) {
            trainer.reviewTraineeCode(trainee);
        }
    }
}
