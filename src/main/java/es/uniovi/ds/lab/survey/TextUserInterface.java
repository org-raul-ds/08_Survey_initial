package es.uniovi.ds.lab.survey;

import java.io.*;

public class TextUserInterface {

    public void collectSurveyResponses(Survey survey) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {

            System.out.printf("%n%s (yes/no/exit)> ", survey.getQuestion());

            var answer = input.readLine();

            if (answer.startsWith("ex"))
                return;

            if (answer.startsWith("y"))
                survey.addYesVote();

            if (answer.startsWith("n"))
                survey.addNoVote();

        } while (true);

    }

}
