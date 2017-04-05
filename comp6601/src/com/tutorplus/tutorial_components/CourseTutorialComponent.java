package com.tutorplus.tutorial_components;

import java.util.ArrayList;

/**
 * Created by jason on 29/03/2017.
 */
public class CourseTutorialComponent extends TutorialComponent {

    private String courseNumber;
    private String courseName;
    private int courseLevel;
    private String topic;
    private ArrayList<String> questions;
    private ArrayList<String> options;

    public CourseTutorialComponent(String courseNumber, String courseName,
                                   int courseLevel, String topic,
                                   ArrayList<String> questions, ArrayList<String> options) {

        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseLevel = courseLevel;
        this.topic = topic;
        this.questions = questions;
        this.options = options;
    }

    public CourseTutorialComponent() {
    }
    //================================getters=============================

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseLevel() {
        return courseLevel;
    }

    public String getTopic() {
        return topic;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    //=================================Setters===============================

    @Override
    public String toString() {
        return "CourseTutorialComponent{" +
                "courseNumber='" + courseNumber + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseLevel=" + courseLevel +
                ", topic='" + topic + '\'' +
                ", questions=" + questions.toString() +
                ", options=" + options.toString() +
                '}';
    }

    @Override
    public String getComponentName() {
        return "courses";
    }

    @Override
    public boolean isRegisteredComponent() {
        return true;
    }


}
