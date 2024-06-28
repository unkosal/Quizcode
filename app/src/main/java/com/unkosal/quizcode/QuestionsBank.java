package com.unkosal.quizcode;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestion(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of variable?", "16 bit", "8 bit", "32 bit", "64 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the default value boolean of variable?", "true", "false", "null", "not defined", "false", "");
        final QuestionsList question3 = new QuestionsList("What of the following is the default value of an instance variable?", "Depends upon the type of variable", "null", "0", "not assigned", "Depends upon the type of variable", "");
        final QuestionsList question4 = new QuestionsList("Which is a reserved word in the java programming language?", "method", "native", "reference", "array", "native", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is Not a keyword or reserved words in java?", "if", "then", "goto", "while", "then", "");
        final QuestionsList question6 = new QuestionsList("What is the valid declarations within an interface definition?", "public double methoda();", "public final double methoda();", "static void methoda(double d1);", " protected void methoda(double d1);", "public double methoda();", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static  List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does PHP stand for stand for?", "Professional Home page ", "Hypertext Preprocessor", "Pretext hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?", "Rasmus Lerdorf", "Willam Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("PHP files have a default file extension of.", ".html", ".php", ".xml", ".json", ".php", "");
        final QuestionsList question4 = new QuestionsList("A PHP script should start with... and end with...:", "< php >", "< php />", "< ? ? >", "< ?php ? >", "< ?php ? >", "");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced Try/catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "", "");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will be returned when ($a == 12) ? 5 : 1 is executed?", "12", "1", "5", "error", "5", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    private static  List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does HTML stand for stand for?", "Hyper Text Markup Language", "Hyper Tabular Markup Language", "High Text Markup Language", "None of these", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("Which of the following tag is used to mark a beginning of paragraph?", "<TD>", "<br>", "<p>", "<TR>", "<p>", "");
        final QuestionsList question3 = new QuestionsList("From which tage descriptive list starts?", "<LL>", "<DD>", "<DL>", "<DS>", "<DL>", "");
        final QuestionsList question4 = new QuestionsList("Correct HTML tag for the largest heading is.", "<head>", "<large>", "<heading>", "<h6>", "<h6>", "");
        final QuestionsList question5 = new QuestionsList("The attribute of <form> tag", "Method", "Action", "Both (a)&(b)", "None of these", "Both (a)&(b)", "");
        final QuestionsList question6 = new QuestionsList("Markup tags tell the web browser", "How to organise the page", "How to display the page", "How to display message box on page", "None of these", "How to display the page", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static  List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Select a component which is Not part of Android architecture.", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A...... makes a specific set of the application data available to other application", "Content Provider", "Broadcast receivers", "Intent", "None of these", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among of these are Not a part of Android's native libraries?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an Activity life-cycle, what is the first callback method invoked by the system?", "onStop()", "onStart()", "onCreate()", "onRestore()", "onCreate()", "");
        final QuestionsList question5 = new QuestionsList("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML?", "findViewByReference(int id);", "findViewById(int id);", "findViewById(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from content provider class is handle by method", "onCreate", "onSelect", "ContentResolver", "OnClick", "ContentResolver", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestion();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}
