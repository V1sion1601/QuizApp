/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.QuestionDAO;
import DTO.QuestionDTO;
import DTO.QuestionSetDTO;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {
    private static ArrayList<DTO.QuestionDTO> arrcauhoi = new ArrayList<>();
    private static DTO.QuestionSetDTO object = new QuestionSetDTO();
    public static void main(String[] args) {
        arrcauhoi = DAO.QuestionSetDAO.getAllQuestion(1);
        System.out.println(arrcauhoi.get(0).getContent());
        System.out.println(DAO.QuestionSetDAO.getQuestionSet(0));
        object = DAO.QuestionSetDAO.getQuestionSet(0);
        System.out.println(object.getQuestionArrayList().get(0).getContent());
    }
}
