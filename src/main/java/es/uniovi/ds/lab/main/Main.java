/**
 * # IMPORTANT: The code provided for this exercise is the minimum necessary to understand
 * the assignment and should NEVER be taken as an example of proper use of exceptions,
 * assertions, and tests. All of the above, which should be done in a real program, has been
 * intentionally omitted to simplify the exercise.
 */

package es.uniovi.ds.lab.main;

import java.io.IOException;

import es.uniovi.ds.lab.survey.Survey;

public class Main {

    public static void main(String[] args) throws IOException {

        Survey survey = new Survey("Are you in favor of nuclear energy?");

        TextUserInterface userInterface = new TextUserInterface();
        userInterface.collectSurveyResponses(survey);
    }

}
