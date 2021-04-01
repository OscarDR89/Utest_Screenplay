package questions;

//import Tasks.Search;
//import UserInterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
//import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question {

    private String question;
    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        //String nameCurse = Text.of(SearchCoursePage.Name_Course).viewedBy(actor).asString();
        // if (question.equals(nameCurse)){
        //    result=true;
        //}
        //else {
        //    result=false;
        //}
        return result;
    }
}
