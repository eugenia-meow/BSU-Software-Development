package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Grade {
    private StringProperty course = new SimpleStringProperty();
    private IntegerProperty grade = new SimpleIntegerProperty();

    public Grade(String course, Integer grade) {
        this.course.set(course);
        this.grade.set(grade);
    }

    public String getCourse() {
        return course.get();
    }

    public StringProperty courseProperty() {
        return course;
    }

    public int getGrade() {
        return grade.get();
    }

    public IntegerProperty gradeProperty() {
        return grade;
    }
}