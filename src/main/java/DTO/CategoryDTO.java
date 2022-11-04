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
public class CategoryDTO {

    Integer ID_TypeOfQuestion, Level, Point, Time;

    public CategoryDTO() {
    }

    public CategoryDTO(Integer ID_TypeOfQuestion, Integer Level, Integer Point, Integer Time) {
        this.ID_TypeOfQuestion = ID_TypeOfQuestion;
        this.Level = Level;
        this.Point = Point;
        this.Time = Time;
    }

    public Integer getID_TypeOfQuestion() {
        return ID_TypeOfQuestion;
    }

    public void setID_TypeOfQuestion(Integer ID_TypeOfQuestion) {
        this.ID_TypeOfQuestion = ID_TypeOfQuestion;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
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
