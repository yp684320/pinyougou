package com.itheima.view;

import com.itheima.service.AccountService;

public class AccountAPP {
    public static void main(String[] args) {
        //������
        String outName = "rose";
        String inName = "tom";
        double money = 200;
        //����service
        AccountService accountService = new AccountService();
        boolean success = accountService.transfer(outName, inName, money);
        if (success) {
            System.out.println("��ϲ��,ת�˳ɹ�");
        } else {
            System.out.println("ת��ʧ��");
        }

    }
}
