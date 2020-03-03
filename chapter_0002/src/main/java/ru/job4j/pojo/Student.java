package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date receipt;

        public void setFio(String fio) {
        this.fio = fio;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setReceipt(Date receipt) {
        this.receipt = receipt;
    }

    public String getFio() {
        return fio;
    }

    public String getGroup() {
        return group;
    }

    public Date getReceipt() {
        return receipt;
    }
}
