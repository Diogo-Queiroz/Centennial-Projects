package exercise1;

import javax.swing.*;
import java.security.SecureRandom;

class QuestionsCollection {
    private String[] QuestionsArr = new String[5];
    private String[][] AnswersArr = new String[5][5];
    private float Grade = 0;
    private final float qtdQuestion = 5;

    public void setQuestionsArr() {
        QuestionsArr[0] = "What is called the pieces that consists Java Programs?";
        QuestionsArr[1] = "Java programs normally go through _______ phases";
        QuestionsArr[2] = "What is the command to compile a program in the command line prompt?";
        QuestionsArr[3] = "What is the correct way to declare a variable using Camel Case?";
        QuestionsArr[4] = "What kind of method is declared so that we can invoke without instantiate a class";
    }

    public void setAnswersArr() {
        AnswersArr[0][0] = "Classes";
        AnswersArr[0][1] = "Things";
        AnswersArr[0][2] = "Cups";
        AnswersArr[0][3] = "Jars";
        AnswersArr[0][4] = "Classes";

        AnswersArr[1][0] = "Four";
        AnswersArr[1][1] = "Three";
        AnswersArr[1][2] = "Five";
        AnswersArr[1][3] = "Six";
        AnswersArr[1][4] = "Five";

        AnswersArr[2][0] = "cjava";
        AnswersArr[2][1] = "compilejar";
        AnswersArr[2][2] = "compilejava";
        AnswersArr[2][3] = "javac";
        AnswersArr[2][4] = "javac";

        AnswersArr[3][0] = "vArIAblEnAmE";
        AnswersArr[3][1] = "variableName";
        AnswersArr[3][2] = "VARIABLENAME";
        AnswersArr[3][3] = "variablename";
        AnswersArr[3][4] = "variableName";

        AnswersArr[4][0] = "perfect";
        AnswersArr[4][1] = "available";
        AnswersArr[4][2] = "static";
        AnswersArr[4][3] = "invokative";
        AnswersArr[4][4] = "static";
    }

    public String[] getQuestionsArr() {
        return QuestionsArr;
    }

    public String[] getAnswersArr(int question) {

        String[] test = new String[4];

        System.arraycopy(this.AnswersArr[question], 0, test, 0, 4);

        return test;
    }

    public void InputAnswer() {
        this.setQuestionsArr();
        this.setAnswersArr();
        String[] message = getQuestionsArr();
        int inputAnswer = 0;
        for (int i = 0; i < message.length; i++) {
            String[] answers = getAnswersArr(i);
            inputAnswer = JOptionPane.showOptionDialog(null, message[i], "Question " + i + ".",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    answers, null);
            checkAnswer(answers, inputAnswer, i);
        }
        showGrade();
    }

    private void showGrade() {
        float totalGrade = this.Grade / this.qtdQuestion * 100f;
        String message = String.format("Your test is finished\nCorrect Answers = %.0f\nYour Grade = %.2f%%",this.Grade, totalGrade);
        JOptionPane.showMessageDialog(null, message);
    }

    private void checkAnswer(String[] answers, int inputAnswer, int index) {
        if (answers[inputAnswer].equals(this.AnswersArr[index][4])) {
            correctAnswer();
            String feedback = generateMessage(true);
            JOptionPane.showMessageDialog(null, feedback);
        }
        else {
            String feedback = generateMessage(false);
            JOptionPane.showMessageDialog(null, feedback);
        }
    }

    private String generateMessage(boolean correct) {
        String messageGenerated = "";
        if (correct) {
            messageGenerated = getPositiveFeedback();
        } else {
            messageGenerated = getNegativeFeedback();
        }
        return messageGenerated;
    }

    private String getNegativeFeedback() {
        SecureRandom secureRandom = new SecureRandom();
        String message = "";
        switch (secureRandom.nextInt(4)) {
            case 0:
                message = "No, please try again";
                break;
            case 1:
                message = "Wrong, try once more.";
                break;
            case 2:
                message = "Don't give up";
                break;
            case 3:
                message = "No, keep working";
                break;
        }
        return message;
    }

    private String getPositiveFeedback() {
        SecureRandom secureRandom = new SecureRandom();
        String message = "";
        switch (secureRandom.nextInt(4)) {
            case 0:
                message = "Good Work";
                break;
            case 1:
                message = "Excellent.";
                break;
            case 2:
                message = "Keep up!";
                break;
            case 3:
                message = "Nice job!";
                break;
        }
        return message;
    }

    public void correctAnswer() {
        this.Grade++;
    }
}