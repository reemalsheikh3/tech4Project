package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = false;

        // Send me InterviewQuestions OR JavaHomework
        System.out.println("The student is okay (OR): " + (isInterviewQuestionsSent || isJavaHomeworkSent));
        //If there is a single TRUE for OR || it is TRUE

        System.out.println("The student is okay (AND): " + (isInterviewQuestionsSent && isJavaHomeworkSent));

        System.out.println("\nThe student did NOT send the homework " + !isInterviewQuestionsSent);
    }
}
