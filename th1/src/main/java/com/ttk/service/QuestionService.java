/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttk.service;

import com.ttk.pojo.Choice;
import com.ttk.pojo.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuestionService {

    public boolean addQuestion(Question question, List<Choice> choices) throws SQLException {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConn();
            String q1 = "INSERT TO question(id, content, category_id) VALUES(?, ?, ?)";
            String q2 = "INSERT TO choice(id, content, question_id, is_correct) VALUES(?, ?, ?, ?, ?)";

            connection.setAutoCommit(false);

            PreparedStatement stm = connection.prepareStatement(q1);
            stm.setString(1, question.getId());
            stm.setString(2, question.getContent());
            stm.setInt(3, question.getCategory_id());
            stm.executeUpdate();

            for (Choice choice : choices) {
                stm = connection.prepareStatement(q2);
                stm.setString(1, choice.getId());
                stm.setString(2, choice.getContent());
                stm.setString(3, choice.getQuestion_id());
                stm.setBoolean(4, choice.isIs_correct());
            }
            connection.commit();

            connection.close();

            return true;
        }
        catch(SQLException ex){
            if(connection != null){
                connection.rollback();
            }
        }
        return false;          
    }
}
