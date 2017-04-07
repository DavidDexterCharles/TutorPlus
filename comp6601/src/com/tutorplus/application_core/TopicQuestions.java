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
public class TopicQuestions implements Serializable {
    
    protected String courseNumber;
    protected String courseName;
    protected String topicId;
    protected String topicName;
    protected String questionId;
    protected String question;
    protected String answer;
    
    
    
    public TopicQuestions (String courseNumber, String courseName, 
            String topicId, String topicName, String questionId, String question,
            String answer){
        
        
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.topicId = topicId;
        this.topicName = topicName;
        this.questionId =  questionId;
        this.question = question;
        this.answer = answer;
                
    }
    
    /**
     * Check a user submitted answer to the correct answer of the question
     * @param userAnswer
     * @return true if answer if correct otherwise false
     */
    public boolean checkAnswer(String userAnswer){
        
        return userAnswer.equalsIgnoreCase(this.answer);
    }
    
    //Getters
    public String getAnswer() {
        return answer;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "TopicQuestions{" + "courseNumber=" + courseNumber 
                + ", courseName=" + courseName + ", topicId=" + topicId 
                + ", topicName=" + topicName + ", questionId=" + questionId 
                + ", question=" + question + ", answer=" + answer + '}';
    }
    
    
    
    
}
