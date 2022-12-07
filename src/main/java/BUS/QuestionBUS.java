/*
 * To change GUI.ManHinhCapNhatCauHoi license header, choose License Headers in Project Properties.
 * To change GUI.ManHinhCapNhatCauHoi template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.QuestionDTO;
import static GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QuestionBUS {
    
    public static ArrayList showQuestion() {
        ArrayList<DTO.QuestionDTO> QuestionList = DAO.QuestionDAO.getListQuestion(); 
        return QuestionList;
    }

    
    public static DTO.QuestionDTO selectQuestionByID(int ID) {
        DTO.QuestionDTO question = new QuestionDTO();
        question = DAO.QuestionDAO.getQuestionByID(ID);
        return question;
    }
    public static void showInfoQuestion(DTO.QuestionDTO qt) {
        
      
    }

    public static boolean insert1(DTO.QuestionDTO qt) {
            if (qt != null) {
                if(DAO.QuestionDAO.insert(qt)==true){
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
    

//    public static void updatecombobox(StringDTO.QuestionDTO question){
//        
//    }
    public static void updateToGui() {
        
//        if (question.getType().toLowerCase().equals("normal")) {
//            GUI.admin.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("Normal");
//        } else {
//            GUI.admin.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("IQ");
//        }
    }

    public static DTO.QuestionDTO update1(int id,String  cauhoi,String pa1,String pa2,String pa3,String pa4,String pad) {
        DTO.QuestionDTO question1 = new DTO.QuestionDTO();         
            DTO.QuestionDTO question = new DTO.QuestionDTO(
                    id,
                    cauhoi,
                    pa1,
                    pa2,
                    pa3,
                    pa4,
                    pad,
                    "Normal"
            );
            if (question != null) {
                question1 = DAO.QuestionDAO.update(question);
                return question1;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }        
        return null;
    }

    public static boolean delete1(int selectedRow) {
        if (selectedRow >= 0) {
            ArrayList<DTO.QuestionDTO> questionList = DAO.QuestionDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = questionList.get(selectedRow);
            if(DAO.QuestionDAO.delete(qt.getID_Question())==true)
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
    
    
    
//    public boolean checkIDQuestion(int id_question) {
//        return QuestionDAO.has(isbn);
//    }
}
