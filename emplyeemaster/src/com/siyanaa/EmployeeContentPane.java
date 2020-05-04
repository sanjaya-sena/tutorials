package com.siyanaa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeContentPane {
    private JPanel mainPanel;
    private JPanel formEmployee;
    private JTextField txtEmployeeID;
    private JTextField txtEmployeeName;
    private JButton btnSave;

    public EmployeeContentPane() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Employee employee = new Employee();
               employee.setEmployeeId(Integer.parseInt(txtEmployeeID.getText()));
               employee.setName(txtEmployeeName.getText());

                System.out.println("Employee Name - "+ employee.getName());
                System.out.println("Employee ID - "+ employee.getEmployeeId());

                MySql mySql = new MySql();
                mySql.saveEmployee(employee);
            }
        });
    }

    public static void main(String[] args) {
        JFrame rootFrame = new JFrame("Employee Master");
        rootFrame.setContentPane(new EmployeeContentPane().mainPanel);
        rootFrame.pack();
        rootFrame.setVisible(true);
    }
}
