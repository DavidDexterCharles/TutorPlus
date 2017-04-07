/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorplus.application_core;

import java.io.Serializable;

/**
 *
 * @author jason
 */
public class QuestionOptions implements Serializable{
    
    protected String optionId;
    protected String option;
    protected String questionId;
    protected String ansVal;
    protected String topicId;

    public QuestionOptions(String optionId, String option,
            String questionId, String ansVal, String topicId) {
        
        this.optionId = optionId;
        this.option = option;
        this.questionId = questionId;
        this.ansVal = ansVal;
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "QuestionOptions{" + "optionId=" + optionId + ", option=" +
                option + ", questionId=" + questionId + ", ansVal=" + ansVal 
                + ", topicId=" + topicId + '}';
    }
    
    
    
    //getters 
    public String getOptionId() {
        return optionId;
    }

    public String getOption() {
        return option;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getAnsVal() {
        return ansVal;
    }

    public String getTopicId() {
        return topicId;
    }
    
    
    public int compareTo(String optionId){
        return this.optionId.compareTo(option);
    }
    
    
}
