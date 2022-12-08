/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.QuestionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuestionIQBUS {
    
    public static ArrayList showQuestionIQ() {
        ArrayList<DTO.QuestionDTO> QuestionIQList = DAO.QuestionIQDAO.getListQuestion();
        
        return QuestionIQList;
    }

    public static DTO.QuestionDTO selectQuestionIQByID(int ID) {
        DTO.QuestionDTO question = new QuestionDTO();
        question = DAO.QuestionIQDAO.getQuestionIQByID(ID);
        return question;
    }
    
    public static void showInfoQuestionIQ(DTO.QuestionDTO qt) {
        
//        if (qt.getType().toLowerCase().equals("normal")) {
//            frame.comboBoxLoai.setSelectedItem("Normal");
//        }
//        if (qt.getType().toLowerCase().equals("iq")) {
//            frame.comboBoxLoai.setSelectedItem("IQ");
//        }
    }

    public static boolean insert1(DTO.QuestionDTO qt) {
            if (qt != null) {
                if(DAO.QuestionIQDAO.insert(qt)==true){
                    return true;
                }
                else
                {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "");
                return false;
            }           
        }
    


    public static DTO.QuestionDTO update1(int id,String cauhoi,String pa1,String pa2,String pa3,String pa4,String pad) {
        DTO.QuestionDTO question1 = new DTO.QuestionDTO();       
            DTO.QuestionDTO question = new DTO.QuestionDTO(
                    id,
                    cauhoi,
                    pa1,
                    pa2,
                    pa3,
                    pa4,
                    pad,
                    "IQ"
            );
            if (question != null) {
                question1 = DAO.QuestionIQDAO.update(question);
                showQuestionIQ();
                return question1;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
            return null;   
    }

    public static boolean delete1(int selectedRow) {
        if (selectedRow >= 0) {
            ArrayList<DTO.QuestionDTO> questionList = DAO.QuestionIQDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = questionList.get(selectedRow);
            if(DAO.QuestionIQDAO.delete(qt.getID_Question())==true)
            {
                selectedRow = -1;
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
