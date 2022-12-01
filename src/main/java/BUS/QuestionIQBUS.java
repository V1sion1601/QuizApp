/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

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
    public static String tempdapan="";
    public static List showQuestionIQ() {
        List<DTO.QuestionDTO> QuestionIQList = DAO.QuestionIQDAO.getListQuestion();
        System.out.println(QuestionIQList);
        GUI.admin.ManHinhQuanLyCauHoiIQ.model2.setRowCount(0);
        QuestionIQList.forEach(Question -> {
            GUI.admin.ManHinhQuanLyCauHoiIQ.model2.addRow(new Object[]{Question.getID_Question(),
                Question.getContent(), Question.getOption1(), Question.getOption2(), Question.getOption3(),
                Question.getOption4(), Question.getOptionTrue(), Question.getType()});
        });
        return QuestionIQList;
    }

    public static DTO.QuestionDTO selectQuestionIQByID(int ID) {
        DTO.QuestionDTO question = new QuestionDTO();
        question = DAO.QuestionIQDAO.getQuestionIQByID(ID);
        return question;
    }
    
    public static void showInfoQuestionIQ(DTO.QuestionDTO qt) {
        GUI.admin.ManHinhCapNhatCauHoiIQ frame = new GUI.admin.ManHinhCapNhatCauHoiIQ();
        frame.setVisible(true);
        frame.labelMaCauHoiIQTuCSDL.setText(String.valueOf(qt.getID_Question()));
        frame.textFieldNoiDungCauHoi.setText(qt.getContent());
        frame.textFieldPhuongAn1.setText(qt.getOption1());
        frame.textFieldPhuongAn2.setText(qt.getOption2());
        frame.textFieldPhuongAn3.setText(qt.getOption3());
        frame.textFieldPhuongAn4.setText(qt.getOption4());
        tempdapan = qt.getOptionTrue();
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
//        if (qt.getType().toLowerCase().equals("normal")) {
//            frame.comboBoxLoai.setSelectedItem("Normal");
//        }
//        if (qt.getType().toLowerCase().equals("iq")) {
//            frame.comboBoxLoai.setSelectedItem("IQ");
//        }
    }

    public static void insert1() {

        if (GUI.admin.ManHinhThemCauHoiIQ.textFieldNoiDungCauHoi.equals("")
                || GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn1.equals("")
                || GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn2.equals("")
                || GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn3.equals("")
                || GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn4.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionDTO qt = new DTO.QuestionDTO(
                    GUI.admin.ManHinhThemCauHoiIQ.textFieldNoiDungCauHoi.getText(),
                    GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn1.getText(),
                    GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn2.getText(),
                    GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn3.getText(),
                    GUI.admin.ManHinhThemCauHoiIQ.textFieldPhuongAn4.getText(),
                    GUI.admin.ManHinhThemCauHoiIQ.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    "IQ"
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
        ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.removeAllItems();
        if (question.getOption1().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOption1());
        }
        if (question.getOption2().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOption2());
        }
        if (question.getOption3().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOption3());
        }
        if (question.getOption4().equals(question.getOptionTrue())) {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
        } else {
            GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.addItem(question.getOption4());
        }
    }

    public static DTO.QuestionDTO update1() {
        DTO.QuestionDTO question1 = new DTO.QuestionDTO();
        if (GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldNoiDungCauHoi.equals("")
                || GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn1.equals("")
                || GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn2.equals("")
                || GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn3.equals("")
                || GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn4.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin câu hỏi");
        } else {
            DTO.QuestionDTO question = new DTO.QuestionDTO(
                    Integer.parseInt((GUI.admin.ManHinhCapNhatCauHoiIQ.labelMaCauHoiIQTuCSDL.getText())),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldNoiDungCauHoi.getText(),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn1.getText(),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn2.getText(),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn3.getText(),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.textFieldPhuongAn4.getText(),
                    GUI.admin.ManHinhCapNhatCauHoiIQ.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    "IQ"
            );
            if (question != null) {
                question1 = DAO.QuestionIQDAO.update(question);
                showQuestionIQ();
                return question1;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
        return null;
    }

    public static void delete1() {
        int selectedRow = GUI.admin.ManHinhQuanLyCauHoiIQ.tableDanhSachCauHoiIQ.getSelectedRow();
        if (selectedRow >= 0) {
            ArrayList<DTO.QuestionDTO> questionList = DAO.QuestionIQDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = questionList.get(selectedRow);
            DAO.QuestionIQDAO.delete(qt.getID_Question());
            showQuestionIQ();
        }
        selectedRow = -1;
    }
}
