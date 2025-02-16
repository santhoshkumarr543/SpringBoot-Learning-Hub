package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class StudentService {
    List<Student> ls = new ArrayList<>(Arrays.asList(new Student(61,"Santhosh Kumar R" , "JAVA FULLSTACK"),
            new Student(62,"Sanjay","Blockchain")));
    public List<Student> getStudents() {
        return ls;
    }

    public Student getStudentByRno(int rno) {
        int index = 0;
        boolean flag = false;
        for(int i = 0;i < ls.size();i++) {
            if (ls.get(i).getRno() == rno)
            {
                index = i;
                flag = true;
            }
        }
        if(flag) return ls.get(index);
        else return new Student(0,"","");
    }

    public void addStudent(Student student) {
        ls.add(student);
    }

    public String updateStudent(Student student) {
        int index = 0;
        boolean flag = false;
        for(int i = 0;i < ls.size();i++)
        {
            if(ls.get(i).getRno() == student.getRno())
            {
                flag = true;
                index = i;
                break;
            }
        }
        if(!flag) return "Check the RNO";
        else {
            ls.set(index,student);
            return "Successfully updated";
        }
    }

    public String deleteStudent(int rno) {
        int index = 0;
        boolean flag = false;
        for(int i = 0;i < ls.size();i++) {
            if (ls.get(i).getRno() == rno)
            {
                index = i;
                flag = true;
            }
        }
        if(flag)
        {
            ls.remove(index);
            return"Deleted Successfully";
        }
        else return "No such element";
    }
}
