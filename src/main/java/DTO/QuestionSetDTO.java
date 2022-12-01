/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuestionSetDTO {
    Integer ID_QuestionSet, Point, Time;
    ArrayList<DTO.QuestionDTO> questionArrayList = new ArrayList<>();
    public QuestionSetDTO() {
    }
    
    public QuestionSetDTO(Integer ID_QuestionSet, Integer Point, Integer Time) {
        this.ID_QuestionSet = ID_QuestionSet;
        this.Point = Point;
        this.Time = Time;
    }

    public QuestionSetDTO(Integer ID_QuestionSet, Integer Point, Integer Time, ArrayList<DTO.QuestionDTO> questionArrayList ) {
        this.ID_QuestionSet = ID_QuestionSet;
        this.Point = Point;
        this.Time = Time;
        this.questionArrayList = questionArrayList;
    }

    public ArrayList<QuestionDTO> getQuestionArrayList() {
        return questionArrayList;
    }

    public void setQuestionArrayList(ArrayList<QuestionDTO> questionArrayList) {
        this.questionArrayList = questionArrayList;
    }

    
    public Integer getID_QuestionSet() {
        return ID_QuestionSet;
    }

    public void setID_QuestionSet(Integer ID_QuestionSet) {
        this.ID_QuestionSet = ID_QuestionSet;
    }

    public Integer getPoint() {
        return Point;
    }

    public void setPoint(Integer Point) {
        this.Point = Point;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer Time) {
        this.Time = Time;
    }

    

}
