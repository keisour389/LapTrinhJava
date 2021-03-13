/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.th1;

import com.ttk.pojo.Choice;
import com.ttk.pojo.Question;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class EnglishApp {
    public static void main(String[] args) {
        Question q = new Question();
        q.setId(UUID.randomUUID().toString());
        q.setContent("This is ... book");
        
        List<Choice> choices = new ArrayList<>();
        Choice c1 = new Choice();
        c1.setId(UUID.randomUUID().toString());
    }
}
