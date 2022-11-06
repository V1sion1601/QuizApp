/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QuestionBUS {

    public static List showQuestion() {
        List<DTO.QuestionDTO> QuestionList = DAO.QuestionDAO.getListQuestion();
        System.out.println(QuestionList);
        GUI.ManHinhQuanLyCauHoi.model1.setRowCount(0);
        QuestionList.forEach(Question -> {
            GUI.ManHinhQuanLyCauHoi.model1.addRow(new Object[]{Question.getID_Question(),
                Question.getContent(), Question.getOption1(), Question.getOption2(), Question.getOption3(),
                Question.getOption4(), Question.getOptionTrue(), Question.getID_QuestionSet()});
        });
        return QuestionList;
    }

    public static void insert1() {
        if (GUI.QuestionUpdate.tf_idquestion.getText().equals("") || GUI.QuestionUpdate.tf_content.getText().equals("")
                || GUI.QuestionUpdate.tf_Option1.getText().equals("") || GUI.QuestionUpdate.tf_ID_questionset.getText().equals("")
                || GUI.QuestionUpdate.tf_Option2.getText().equals("") || GUI.QuestionUpdate.tf_Option3.getText().equals("")
                || GUI.QuestionUpdate.tf_Option4.getText().equals("") || GUI.QuestionUpdate.tf_OptionTrue.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionDTO qt = new DTO.QuestionDTO(
                    GUI.QuestionUpdate.tf_idquestion.getText(),
                    GUI.QuestionUpdate.tf_content.getText(),
                    GUI.QuestionUpdate.tf_Option1.getText(),
                    GUI.QuestionUpdate.tf_Option2.getText(),
                    GUI.QuestionUpdate.tf_Option3.getText(),
                    GUI.QuestionUpdate.tf_Option4.getText(),
                    GUI.QuestionUpdate.tf_OptionTrue.getText(),
                    GUI.QuestionUpdate.tf_ID_questionset.getText(),
            );
            if (qt != null) {
                DAO.QuestionDAO.insert(qt);
                showQuestion();
                GUI.QuestionGUI.tf_idquestion.setText("");
                GUI.QuestionGUI.tf_content.setText("");
                GUI.QuestionGUI.tf_Option1.setText("");
                GUI.QuestionGUI.tf_Option2.setText("");
                GUI.QuestionGUI.tf_Option3.setText("");
                GUI.QuestionGUI.tf_Option4.setText("");
                GUI.QuestionGUI.tf_Optiontrue.setText("");
                GUI.QuestionGUI.tf_ID_questionset.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }
    
    public static void update1() {
        if (GUI.QuestionUpdate.tf_idquestion.getText().equals("") || GUI.QuestionUpdate.tf_content.getText().equals("")
                || GUI.QuestionUpdate.tf_Option1.getText().equals("") || GUI.QuestionUpdate.tf_ID_questionset.getText().equals("")
                || GUI.QuestionUpdate.tf_Option2.getText().equals("") || GUI.QuestionUpdate.tf_Option3.getText().equals("")
                || GUI.QuestionUpdate.tf_Option4.getText().equals("") || GUI.QuestionUpdate.tf_OptionTrue.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionDTO qt = new DTO.QuestionDTO(
                    GUI.QuestionUpdate.tf_idquestion.getText(),
                    GUI.QuestionUpdate.tf_content.getText(),
                    GUI.QuestionUpdate.tf_Option1.getText(),
                    GUI.QuestionUpdate.tf_Option2.getText(),
                    GUI.QuestionUpdate.tf_Option3.getText(),
                    GUI.QuestionUpdate.tf_Option4.getText(),
                    GUI.QuestionUpdate.tf_OptionTrue.getText(),
                    GUI.QuestionUpdate.tf_ID_questionset.getText(),
            );
            if (qt != null) {
                DAO.QuestionDAO.update(qt);
                showQuestion();
                GUI.QuestionGUI.tf_idquestion.setText("");
                GUI.QuestionGUI.tf_content.setText("");
                GUI.QuestionGUI.tf_Option1.setText("");
                GUI.QuestionGUI.tf_Option2.setText("");
                GUI.QuestionGUI.tf_Option3.setText("");
                GUI.QuestionGUI.tf_Option4.setText("");
                GUI.QuestionGUI.tf_Optiontrue.setText("");
                GUI.QuestionGUI.tf_ID_questionset.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }
    
    public static void delete() {

        int selectedRow = GUI.QuestionGUI.table.getSelectedRow();
        if (selectedRow >= 0) {
            List<DTO.QuestionDTO> QuestionList = DAO.QuestionDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = QuestionList.get(selectedRow);
            int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa câu hỏi này không ?");

            if (option == 0) {
                DAO.QuestionDAO.delete(qt.getID_Question());
                showQuestion();
                GUI.QuestionGUI.tf_idquestion.setText("");
                GUI.QuestionGUI.tf_content.setText("");
                GUI.QuestionGUI.tf_Option1.setText("");
                GUI.QuestionGUI.tf_Option2.setText("");
                GUI.QuestionGUI.tf_Option3.setText("");
                GUI.QuestionGUI.tf_Option4.setText("");
                GUI.QuestionGUI.tf_Optiontrue.setText("");
                GUI.QuestionGUI.tf_ID_questionset.setText("");
            }

        }
        selectedRow = -1;
    }
}
