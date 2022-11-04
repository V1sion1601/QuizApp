/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class QuestionDTO {

    String Content;
    Integer ID_Question, ID_Answer, ID_TypeOfQuestion;

    public QuestionDTO() {
    }

    public QuestionDTO(Integer ID_Question, String Content, Integer ID_Answer, Integer ID_TypeOfQuestion) {
        this.ID_Question = ID_Question;
        this.Content = Content;
        this.ID_Answer = ID_Answer;
        this.ID_TypeOfQuestion = ID_TypeOfQuestion;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public Integer getID_Question() {
        return ID_Question;
    }

    public void setID_Question(Integer ID_Question) {
        this.ID_Question = ID_Question;
    }

    public Integer getID_Answer() {
        return ID_Answer;
    }

    public void setID_Answer(Integer ID_Answer) {
        this.ID_Answer = ID_Answer;
    }

    public Integer getID_TypeOfQuestion() {
        return ID_TypeOfQuestion;
    }

    public void setID_TypeOfQuestion(Integer ID_TypeOfQuestion) {
        this.ID_TypeOfQuestion = ID_TypeOfQuestion;
    }

}
