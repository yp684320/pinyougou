package com.itheima.service;
import com.itheima.Student;
import com.itheima.StudentDao;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
        //��ѯ�������ݵķ���

        public List<Student> query(){
            StudentDao studentDao = new StudentDao();
            List<Student> list = null;
            try {
                list = studentDao.query();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;

        }


    public String insert(int id,String name) {

            StudentDao studentDao = new StudentDao();
        try {
            int flag = studentDao.inSert(id,name);
            if (flag == 1) {
                return "��ӳɹ�";
            } else {
                return"���ʧ��";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "�����쳣";
    }
}
