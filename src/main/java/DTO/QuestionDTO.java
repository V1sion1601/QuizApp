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

    String Content, Option1, Option2, Option3, Option4, OptionTrue;
    Integer ID_Question, ID_QuestionSet;

    public QuestionDTO() {
    }
    
    public QuestionDTO(String Content, String Option1, String Option2, String Option3, String Option4, String OptionTrue) {
        this.Content = Content;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
        this.Option4 = Option4;
        this.OptionTrue = OptionTrue;
    }

    public QuestionDTO(Integer ID_Question, String Content, String Option1, String Option2, String Option3, String Option4, String OptionTrue, Integer ID_QuestionSet) {
        this.ID_Question = ID_Question;
        this.Content = Content;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
        this.Option4 = Option4;
        this.OptionTrue = OptionTrue;
        this.ID_QuestionSet = ID_QuestionSet;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String Option1) {
        this.Option1 = Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String Option2) {
        this.Option2 = Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String Option3) {
        this.Option3 = Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public void setOption4(String Option4) {
        this.Option4 = Option4;
    }

    public String getOptionTrue() {
        return OptionTrue;
    }

    public void setOptionTrue(String OptionTrue) {
        this.OptionTrue = OptionTrue;
    }

    public Integer getID_Question() {
        return ID_Question;
    }

    public void setID_Question(Integer ID_Question) {
        this.ID_Question = ID_Question;
    }

    public Integer getID_QuestionSet() {
        return ID_QuestionSet;
    }

    public void setID_QuestionSet(Integer ID_QuestionSet) {
        this.ID_QuestionSet = ID_QuestionSet;
    }

   

}
