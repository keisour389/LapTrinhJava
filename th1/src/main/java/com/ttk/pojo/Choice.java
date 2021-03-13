/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttk.pojo;

/**
 *
 * @author Admin
 */
public class Choice {
    private String id;
    private String content;
    private String question_id;
    private boolean is_correct;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the question_id
     */
    public String getQuestion_id() {
        return question_id;
    }

    /**
     * @param question_id the question_id to set
     */
    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    /**
     * @return the is_correct
     */
    public boolean isIs_correct() {
        return is_correct;
    }

    /**
     * @param is_correct the is_correct to set
     */
    public void setIs_correct(boolean is_correct) {
        this.is_correct = is_correct;
    }
}
