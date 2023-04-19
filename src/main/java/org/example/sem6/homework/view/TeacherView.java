package org.example.sem6.homework.view;



import org.example.sem6.homework.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
    Logger loggerTeacher = Logger.getLogger(TeacherView.class.getName());
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            loggerTeacher.info(user.toString());
        }

    }
}
