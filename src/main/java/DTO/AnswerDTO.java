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
public class AnswerDTO {

    String Solution, Result;
    Integer ID_Answer, ID_Question;

    public AnswerDTO(Integer ID_Answer, String Solution, Integer ID_Question, String Result) {
        this.ID_Answer = ID_Answer;
        this.Solution = Solution;
        this.ID_Question = ID_Question;
        this.Result = Result;
    }

    public AnswerDTO() {
    }

    public String getSolution() {
        return Solution;
    }

    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public Integer getID_Answer() {
        return ID_Answer;
    }

    public void setID_Answer(Integer ID_Answer) {
        this.ID_Answer = ID_Answer;
    }

    public Integer getID_Question() {
        return ID_Question;
    }

    public void setID_Question(Integer ID_Question) {
        this.ID_Question = ID_Question;
    }
}
