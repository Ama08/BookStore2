package org.verifications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ClasroomTest {
    private Classroom classRoom;
    @Mock
    private Trainer trainer;
    @Mock
    private Trainee trainee1;
    @Mock
    private Trainee trainee2;
    @Mock
    private Trainee trainee3;
    @Mock
    private Trainee trainee4;
    @Mock
    private Trainee trainee5;

    private List<Trainee> firstList;
    private List<Trainee> secondList;

    @BeforeEach
    void setUp(){
      classRoom  = new Classroom();

      classRoom.setTrainer(trainer);

      firstList = new ArrayList<>(List.of(trainee1,trainee2,trainee3));

      secondList = new ArrayList<>(List.of(trainee1, trainee2, trainee3, trainee4, trainee5));

        //  classRoom.setTrainees(secondList);

    }

    @Test
    void test_classroomStartLessonMethodCalled_trainerTeachMethodCalled(){
        classRoom.startLesson();

        verify(trainer, times(1)).teach();
    }

    @Test
    void test_classroomEndLessonMethodCalled_trainerPrepareLessonMethodCalled(){
        classRoom.endLesson();
        verify(trainer, times(1)).prepareLesson();
    }

    @Test
    void test_whenStartExamIsCalled_trainerInvigilateExamMethodIsPassed(){
        String examName = "exam";
        classRoom.startExam(examName);
        verify(trainer, times(1)).invigilateExam(examName);
    }

    @Test
    void test_whenClassRoomReviewTraineeCodeMethodIsCalled_callesTrainerReviewTraineeCode3Times(){
        classRoom.setTrainees(firstList);
        classRoom.reviewAllTraineeCode();
        verify(trainer, times(3)).reviewTraineeCode(any(Trainee.class));
    }

    @Test
    void test_whenClassRoomReviewTraineeCodeMethodIsCalled_callesTrainerReviewTraineeCode5Times(){
        classRoom.setTrainees(secondList);
        classRoom.reviewAllTraineeCode();
        verify(trainer, times(5)).reviewTraineeCode(any(Trainee.class));
    }

    @Test
    void test_verifyWhenClassroomStartLessonIsCalled_itCallsTheLearnMethodOnEachOfThe3Trainees(){
        classRoom.setTrainees(firstList);
        classRoom.startLesson();

        verify(trainee1, times(1)).learn();
        verify(trainee2, times(1)).learn();
        verify(trainee3, times(1)).learn();
    }

    @Test
    void test_verifyWhenClassroomStartLessonIsCalled_itCallsTheLearnMethodOnEachOfThe5Trainees(){
        classRoom.setTrainees(secondList);
        classRoom.startLesson();

        verify(trainee1, times(1)).learn();
        verify(trainee2, times(1)).learn();
        verify(trainee3, times(1)).learn();
        verify(trainee4, times(1)).learn();
        verify(trainee5, times(1)).learn();
    }





}
