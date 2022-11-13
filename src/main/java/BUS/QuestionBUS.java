/*
 * To change GUI.ManHinhCapNhatCauHoi license header, choose License Headers in Project Properties.
 * To change GUI.ManHinhCapNhatCauHoi template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.QuestionDTO;
import static GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung;
import static GUI.ManHinhQuanLyCauHoi.qt;
import java.util.ArrayList;
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
        GUI.ManHinhQuanLyCauHoi.model.setRowCount(0);
        QuestionList.forEach(Question -> {
            GUI.ManHinhQuanLyCauHoi.model.addRow(new Object[]{Question.getID_Question(),
                Question.getContent(), Question.getOption1(), Question.getOption2(), Question.getOption3(),
                Question.getOption4(), Question.getOptionTrue(), Question.getType()});
        });
        return QuestionList;
    }
   
    public static void showInfoQuestion(DTO.QuestionDTO qt)
    {
        GUI.ManHinhCapNhatCauHoi frame = new GUI.ManHinhCapNhatCauHoi();
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
            if(qt.getType().toLowerCase().equals("normal")){
                frame.comboBoxLoai.setSelectedItem("Normal");
            }
            if(qt.getType().toLowerCase().equals("iq")){
                frame.comboBoxLoai.setSelectedItem("IQ");
            }
    }
    
    public static void insert1() {
        if (GUI.ManHinhThemCauHoi.textFieldNoiDungCauHoi.equals("")||
            GUI.ManHinhThemCauHoi.textFieldPhuongAn1.equals("")||
            GUI.ManHinhThemCauHoi.textFieldPhuongAn2.equals("")||
            GUI.ManHinhThemCauHoi.textFieldPhuongAn3.equals("")||
            GUI.ManHinhThemCauHoi.textFieldPhuongAn4.equals("")  
                ) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.QuestionDTO qt = new DTO.QuestionDTO(
                    GUI.ManHinhThemCauHoi.textFieldNoiDungCauHoi.getText(),
                    GUI.ManHinhThemCauHoi.textFieldPhuongAn1.getText(),
                    GUI.ManHinhThemCauHoi.textFieldPhuongAn2.getText(),
                    GUI.ManHinhThemCauHoi.textFieldPhuongAn3.getText(),
                    GUI.ManHinhThemCauHoi.textFieldPhuongAn4.getText(),
                    GUI.ManHinhThemCauHoi.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    GUI.ManHinhThemCauHoi.comboBoxLoai.getSelectedItem().toString()
            );
            if (qt != null) {
                DAO.QuestionDAO.insert(qt);
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
    }
    
//    public static void updatecombobox(StringDTO.QuestionDTO question){
//        
//    }
    
    public static void updateToGui() {
        DTO.QuestionDTO question = new QuestionDTO();
        question = BUS.QuestionBUS.update1();
        comboBoxPhuongAnDung.removeAllItems();
        if(question.getOption1().equals(question.getOptionTrue()))
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
                }
                else
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption1());
                }
                if(question.getOption2().equals(question.getOptionTrue()))
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
                }
                else
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption2());
                }
                if(question.getOption3().equals(question.getOptionTrue()))
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
                }
                else
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption3());
                }
                if(question.getOption4().equals(question.getOptionTrue()))
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOptionTrue());
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.setSelectedItem(question.getOptionTrue());
                }
                else
                {
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.addItem(question.getOption4());
                }
        if(question.getType().toLowerCase().equals("normal"))
        {
            GUI.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("Normal");
        }
        else
        {
            GUI.ManHinhCapNhatCauHoi.comboBoxLoai.setSelectedItem("IQ");
        }
    }
    public static DTO.QuestionDTO update1() {
        DTO.QuestionDTO question1 = new DTO.QuestionDTO();
        if (GUI.ManHinhCapNhatCauHoi.textFieldNoiDungCauHoi.equals("") ||
            GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn1.equals("") ||
            GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn2.equals("") ||
            GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn3.equals("") ||
            GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn4.equals("")
                ) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin câu hỏi");
        } else {
            DTO.QuestionDTO question = new DTO.QuestionDTO(
                    Integer.parseInt((GUI.ManHinhCapNhatCauHoi.labelMaCauHoiTuCSDL.getText())),
                    GUI.ManHinhCapNhatCauHoi.textFieldNoiDungCauHoi.getText(),
                    GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn1.getText(),
                    GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn2.getText(),
                    GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn3.getText(),
                    GUI.ManHinhCapNhatCauHoi.textFieldPhuongAn4.getText(),
                    GUI.ManHinhCapNhatCauHoi.comboBoxPhuongAnDung.getSelectedItem().toString(),
                    GUI.ManHinhCapNhatCauHoi.comboBoxLoai.getSelectedItem().toString()
            );
            if (question != null) {
                question1 = DAO.QuestionDAO.update(question);
                showQuestion();
                return question1;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
        return null;
    }
    
    public static void delete1() {
        int selectedRow = GUI.ManHinhQuanLyCauHoi.tableDanhSachCauHoi.getSelectedRow();
        if (selectedRow >= 0) {
            ArrayList<DTO.QuestionDTO> questionList = DAO.QuestionDAO.getListQuestion();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.QuestionDTO qt = questionList.get(selectedRow);
            DAO.QuestionDAO.delete(qt.getID_Question());
            showQuestion();
        }
        selectedRow = -1;
    }
}
