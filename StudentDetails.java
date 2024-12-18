package university_managment_system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener {
    JLabel heading;
    JTable table;
    JButton searchbutton,updatebutton,cancelbutton,addbutton,printbutton;
    Choice cRollNo;//class to make a dropdown instead of using JComboBox

    StudentDetails(){
        setSize(900,700);
        setLocation(300,100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("STUDENTS DETAIL");




        heading= new JLabel("Search By Roll Number");
        heading.setBounds(20,20,150,20);
        add(heading);

        cRollNo= new Choice();
        cRollNo.setBounds(180,20,150,20);
        add(cRollNo);

        //adding the button
        searchbutton=new JButton("Search");
        cancelbutton= new JButton("Cancel");
        updatebutton = new JButton("Update");
        addbutton= new JButton("Add");
        printbutton = new JButton("Print");

        searchbutton.setBounds(20,70,80,20);
        updatebutton.setBounds(120,70,80,20);
        printbutton.setBounds(220,70,80,20);
        addbutton.setBounds(320,70,80,20);
        cancelbutton.setBounds(420,70,80,20);
        
        searchbutton.addActionListener(this);
        cancelbutton.addActionListener(this);
        addbutton.addActionListener(this);
        updatebutton.addActionListener(this);
        printbutton.addActionListener(this);

        add(searchbutton);
        add(addbutton);
        add(printbutton);
        add(cancelbutton);
        add(updatebutton);




        //fetching the rollno data from students table
        try{
            Conn con=new Conn();
            ResultSet rs =con.s.executeQuery("select * from student ");
            //fetch while data is empty
            while (rs.next()){
                cRollNo.add(rs.getString("rollno"));//fetch the data from coloumn name
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //creating the table to get the information
        table =new JTable();
        //fetching the student detail data from students table
        try {
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from student ");

            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            e.printStackTrace();
        }
        JScrollPane scroll=new JScrollPane(table);
        scroll.setBounds(0,100,900,600);
        add(scroll);


        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==searchbutton){
            String query = "select * from student where rollno ='"+cRollNo.getSelectedItem()+"'";
            try{
                Conn con =new Conn();
                ResultSet rs =con.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource()==cancelbutton) {
            setVisible(false);
        } else if (ae.getSource()==printbutton) {
            try {
                table.print();//method to open the command of printer
            }catch (Exception e){
                e.printStackTrace();
            }
            
        } else if (ae.getSource()==updatebutton) {
            setVisible(false);
            //new UpdateStudent();
        } else if (ae.getSource()==addbutton) {
            setVisible(false);
            new AddStudent();
        }

    }

    public static void main(String[] args) {
        new StudentDetails();
    }
}