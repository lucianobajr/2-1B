package pkg2.pkg1b.controller;

import pkg2.pkg1b.model.User.NormalUser;
import pkg2.pkg1b.model.User.User.Sex;

public class NormalUserController {

    public NormalUser newUser;

    public float getScore() {
        float FinalScore;
        float time = (float) newUser.getTempoPermanenciaLocal();
        int age = newUser.getAge();
        float ScoreMask = newUser.getScoreMask();
        float ScoreEnvi = newUser.getScoreEnvi();
        float ScoreDesease = newUser.getScoreDesease();
        if (ScoreDesease == 0) {
            ScoreDesease = 1;
        }
        if (ScoreEnvi == 0) {
            return 1;
        }
        
        time = time / 60; // conver to hour 

        FinalScore = age;
        FinalScore += time * 2;
        FinalScore += ScoreMask * 3;
        FinalScore += ScoreEnvi * 4;
        FinalScore += ScoreDesease * 5;
        FinalScore = FinalScore / 15;

        return (float) FinalScore;
    }

    public void init_new_user(String Name, int Age, String Sexo) {
        Sex SS;
        if (Sexo.equals("Masculino")) {
            SS = Sex.Male;
        } else {
            SS = Sex.Female;
        }
        newUser = new NormalUser(Name, Age, SS);

    }

}
