/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorplus.application_core;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jason
 */
public class TopicQuestionsOptionsManager {
    
    
        ArrayList<HashMap<String,TopicQuestions>> allTopicQuestionList;
        ArrayList<HashMap<String,QuestionOptions>> allQuestionOptionsList;

    public TopicQuestionsOptionsManager() {
        
        
        this.allTopicQuestionList = new ArrayList<>();
        this.allQuestionOptionsList = new ArrayList<>();
    }

    public HashMap<String, TopicQuestions> getTopicQuestionList(String topicId) {
//        return topicQuestionList;

              
      
//      System.out.println(topicQuestions.toString());
        
         return TutorPlusApplication.dbHelper.getTopicQuestions(topicId);
    }

    public HashMap<String, QuestionOptions> getQuestionOptionsList(String topicId) {
//        return questionOptionsList;

           return TutorPlusApplication.dbHelper.getQuestionOptions(topicId);

//        return null;

    }
    
    
    public void populateTopicQuestionsList(){
        
        
    }
    
        
        
        

    
}
