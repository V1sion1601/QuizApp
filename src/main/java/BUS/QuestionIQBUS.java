/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import static BUS.QuestionIQBUS.showQuestion;
import DTO.QuestionDTO;
import GUI.admin.*;
import static GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuestionIQBUS {
     public static List showQuestion() {
        List<DTO.QuestionDTO> QuestionList = DAO.QuestionIQDAO.getListQuestion();
        System.out.println(QuestionList);
        GUI.admin.ManHinhQuanLyCauHoi.model.setRowCount(0);
        QuestionList.forEach(Question -> {
            GUI.admin.ManHinhQuanLyCauHoi.model.addRow(new Object[]{Question.getID_Question(),
                Question.getContent(), Question.getOption1(), Question.getOption2(), Question.getOption3(),
                Question.getOption4(), Question.getOptionTrue(), Question.getType()});
        });
        return QuestionList;
    }

     public static void showInfoQuestion(DTO.QuestionDTO qt) {
        GUI.admin.ManHinhCapNhatCauHoi frame = new GUI.admin.ManHinhCapNhatCauHoi();
        frame.setVisible(true);
        frame.labelMaCauHoiTuCSDL.setText(String.valueOf(qt.getID_Question()));
        frame.textFieldNoiDungCauHoi.setText(qt.getContent());
        frame.textFieldPhuongAn1.setText(qt.getOption1());
        frame.textFieldPhuongAn2.setText(qt.getOption2());
        frame.textFieldPhuongAn3.setText(qt.getOption3());
        frame.textFieldPhuongAn4.setText(qt.getOption4());
        if (qt.getOption1().equals(qt.getOptionTrue())) {
            frame.comboBoxPhuongAnDung.addItem(qt.getOptionTrue());
            frame.comboBoxPhuongAnDung.setSelectedItem(qt.getOptionTrue());
        } else {
            frame.comboBoxPhuongAnDung.addItem(qt.getOption1());
        }
        if (qt.getOption2().equals(qt.getOptionTrue())) {
            frame.comboBoxPhuongAnDung.addItem(qt.getOptionTrue());
            frame.comboBoxPhuongAnDung.setSelectedItem(qt.getOptionTrue());
        } else {
            frame.comboBoxPhuongAnDung.addItem(qt.getOption2());
        }
        if (qt.getOption3().equals(qt.getOptionTrue())) {
            frame.comboBoxPhuongAnDung.addItem(qt.getOptionTrue());
            frame.comboBoxPhuongAnDung.setSelectedItem(qt.getOptionTrue());
        } else {
            frame.comboBoxPhuongAnDung.addItem(qt.getOption3());
        }
        if (qt.getOption4().equals(qt.getOptionTrue())) {
            frame.comboBoxPhuongAnDung.addItem(qt.getOptionTrue());
            frame.comboBoxPhuongAnDung.setSelectedItem(qt.getOptionTrue());
        } else {
            frame.comboBoxPhuongAnDung.addItem(qt.getOption4());
        }
        if (qt.getType().toLowerCase().equals("normal")) {
            frame.comboBoxLoai.setSelectedItem("Normal");
        }
        if (qt.getType().toLowerCase().equals("iq")) {
            frame.comboBoxLoai.setSelectedItem("IQ");
        }
    }
     
     public static void insert1() {

        if (GUI.admin.ManHinhThemCauHoi.textFieldNoiDungCauHoi.equals("")
                || GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn1.equals("")
                || GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn2.equals("")
                || GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn3.equals("")
                || GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn4.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionDTO qt = new DTO.QuestionDTO(
                    GUI.admin.ManHinhThemCauHoi.textFieldNoiDungCauHoi.getText(),
                    GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn1.getText(),
                    GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn2.getText(),
                    GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn3.getText(),
                    GUI.admin.ManHinhThemCauHoi.textFieldPhuongAn4.getText(),
                    GUI.admin.ManHinhThemCauHoi.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    GUI.admin.ManHinhThemCauHoi.comboBoxLoai.getSelectedItem().toString()
            );
            if (qt != null) {
                DAO.QuestionIQDAO.insert(qt);
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
    }
     
     public static void updateToGui() {
        DTO.QuestionDTO question = new QuestionDTO();
        question = BUS.QuestionIQBUS.update1();
        comboBoxPhuongAnDung.removeAllItems();
        if (question.getOption1().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption1());
        }
        if (question.getOption2().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption2());
        }
        if (question.getOption3().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption3());
        }
        if (question.getOption4().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption4());
        }
        if (question.getType().toLowerCase().equals("normal")) {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("Normal");
        } else {
            GUI.admin.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("IQ");
        }
    }

    public static DTO.QuestionDTO update1() {
        DTO.QuestionDTO question1 = new DTO.QuestionDTO();
        if (GUI.admin.ManHinhCapNhatCauHoi.textFieldNoiDungCauHoi.equals("")
                || GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn1.equals("")
                || GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn2.equals("")
                || GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn3.equals("")
                || GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn4.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin câu hỏi");
        } else {
            DTO.QuestionDTO question = new DTO.QuestionDTO(
                    Integer.parseInt((GUI.admin.ManHinhCapNhatCauHoi.labelMaCauHoiTuCSDL.getText())),
                    GUI.admin.ManHinhCapNhatCauHoi.textFieldNoiDungCauHoi.getText(),
                    GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn1.getText(),
                    GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn2.getText(),
                    GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn3.getText(),
                    GUI.admin.ManHinhCapNhatCauHoi.textFieldPhuongAn4.getText(),
                    GUI.admin.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    GUI.admin.ManHinhCapNhatCauHoi.comboBoxLoai.getSelectedItem().toString()
            );
            if (question != null) {
                question1 = DAO.QuestionIQDAO.update(question);
                showQuestion();
                return question1;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
        return null;
    }

    public static void delete1() {
        int selectedRow = GUI.admin.ManHinhQuanLyCauHoiIQ.tableDanhSachCauHoi.getSelectedRow();
        if (selectedRow >= 0) {
            ArrayList<DTO.QuestionDTO> questionList = DAO.QuestionIQDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = questionList.get(selectedRow);
            DAO.QuestionIQDAO.delete(qt.getID_Question());
            showQuestion();
        }
        selectedRow = -1;
    }
}
