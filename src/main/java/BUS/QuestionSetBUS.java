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
public class QuestionSetBUS {
    public static List showQuestionSet() {
        List<DTO.QuestionSetDTO> QuestionSetList = DAO.QuestionSetDAO.getListQuestionSet();
        System.out.println(QuestionSetList);
        GUI.QuestionSetDAO.model.setRowCount(0);
        QuestionSetList.forEach(QuestionSet -> {
            GUI.QuestionSetDAO.model.addRow(new Object[]{QuestionSet.getID_QuestionSet(),
                QuestionSet.getPoint(), QuestionSet.getTime()});
        });
        return QuestionSetList;
    }

    public static void insert1() {
        if (GUI.QuestionSetUpdate.tf_idquestionset.getText().equals("") || GUI.QuestionSetUpdate.tf_point.getText().equals("")
                || GUI.QuestionSetUpdate.tf_time.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionSetDTO qts = new DTO.QuestionSetDTO(
                    GUI.QuestionSetUpdate.tf_idquestionset.getText(),
                    GUI.QuestionSetUpdate.tf_point.getText(),
                    GUI.QuestionSetUpdate.tf_time.getText(),
            );
            if (qts != null) {
                DAO.QuestionSetDAO.insert(qts);
                showQuestionSet();
                GUI.QuestionSetUpdate.tf_idquestionset.setText("");
                GUI.QuestionSetUpdate.tf_point.setText("");
                GUI.QuestionSetUpdate.tf_time.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }
    
    public static void update1() {
        if (GUI.QuestionSetUpdate.tf_idquestionset.getText().equals("") || GUI.QuestionSetUpdate.tf_point.getText().equals("")
                || GUI.QuestionSetUpdate.tf_time.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionSetDTO qts = new DTO.QuestionSetDTO(
                    GUI.QuestionSetUpdate.tf_idquestionset.getText(),
                    GUI.QuestionSetUpdate.tf_point.getText(),
                    GUI.QuestionSetUpdate.tf_time.getText(),
            );
            if (qts != null) {
                DAO.QuestionSetDAO.insert(qts);
                showQuestionSet();
                GUI.QuestionSetUpdate.tf_idquestionset.setText("");
                GUI.QuestionSetUpdate.tf_point.setText("");
                GUI.QuestionSetUpdate.tf_time.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }
    
    public static void delete() {

        int selectedRow = GUI.QuestionSetDAO.table.getSelectedRow();
        if (selectedRow >= 0) {
            List<DTO.QuestionSetDTO> QuestionSetList = DAO.QuestionSetDAO.getListQuestionSet();
            //lấy dữ liệu của bộ câu hỏi cần xoá ra 1 obj
            DTO.QuestionSetDTO qt = QuestionSetList.get(selectedRow);
            int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa bộ câu hỏi này không ?");

            if (option == 0) {
                DAO.QuestionSetDAO.delete(qt.getID_QuestionSet());
                showQuestionSet();
                GUI.QuestionSetUpdate.tf_idquestionset.setText("");
                GUI.QuestionSetUpdate.tf_point.setText("");
                GUI.QuestionSetUpdate.tf_time.setText("");
            }

        }
        selectedRow = -1;
    }
}
