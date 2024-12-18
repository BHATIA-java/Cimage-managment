package university_managment_system;
import javax.swing. *;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    Project(){
        setSize(1540,850);//use to set the screen size to the frame

//adding image to the login screen
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));//to display the login image
        Image icon2 = icon.getImage().getScaledInstance(1540, 800, Image.SCALE_DEFAULT);//to display the first image with default scale factor
        ImageIcon icon3=new ImageIcon(icon2);//converting the image into an imageicon to display on the label
        JLabel image=new JLabel(icon3);// pasting that image into label and displaying
        add(image);//adding the label to the jframe       

//adding menubar
        JMenuBar menuBar = new JMenuBar();//creating a menu bar

//new information menu
        JMenu newInformation = new JMenu("Information");//creating the menu that going to show on menu bar
        newInformation.setForeground(Color.blue);//setting the color of menu
        menuBar.add(newInformation);//adding menu to the menu bar
//faculty information   menu
        JMenuItem facultyinfo = new JMenuItem("New Faculty Information");//creatin menu item that show on menu
        facultyinfo.setBackground(Color.WHITE);//setting the color of faculty info
        newInformation.add(facultyinfo);//adding menuitem to the menu
//student information   menu
        JMenuItem studentinfo = new JMenuItem("New Student Information");//creatin menu item that show on menu
        studentinfo.setBackground(Color.WHITE);//setting the color of faculty info
        newInformation.add(studentinfo);//adding menuitem to the menu

//Details menu
        JMenu details = new JMenu("View Details");//creating the menu that going to show on menu bar
        details.setForeground(Color.RED);//setting the color of menu
        menuBar.add(details);//adding menu to the menu bar
//faculty Details   menuItem
        JMenuItem facultyDetails = new JMenuItem(" View Faculty Details");//creatin menu item that show on menu
        facultyDetails.setBackground(Color.WHITE);//setting the color of faculty details
        details.add(facultyDetails);//adding menuitem to the menu
//student details   menu
        JMenuItem studentDetails = new JMenuItem(" View Student Details");//creatin menu item that show on menu
        studentDetails.setBackground(Color.WHITE);//setting the color of student detials
        details.add(studentDetails);//adding menuitem to the menu

//Leave menu
        JMenu leave = new JMenu("Apply Leave");//creating the menu that going to show on menu bar
        leave.setForeground(Color.blue);//setting the color of menu
        menuBar.add(leave);//adding menu to the menu bar
//faculty Details   menuItem
        JMenuItem facultyleave = new JMenuItem("  Faculty Leave");//creatin menu item that show on menu
        facultyleave.setBackground(Color.WHITE);//setting the color of faculty leave
        leave.add(facultyleave);//adding menuitem to the menu
//student details   menu
        JMenuItem studentLeave = new JMenuItem("  Student Leave ");//creatin menu item that show on menu
        studentLeave.setBackground(Color.WHITE);//setting the color of student leave
        leave.add(studentLeave);//adding menuitem to the menu

//Leave Deatils menu
        JMenu leaveDetails = new JMenu("Leave Detils");//creating the menu that going to show on menu bar
        leaveDetails.setForeground(Color.red);//setting the color of menu
        menuBar.add(leaveDetails);//adding menu to the menu bar
//faculty Details   menuItem
        JMenuItem facultyleavedetails = new JMenuItem("  Faculty Leave Details");//creatin menu item that show on menu
        facultyleavedetails.setBackground(Color.WHITE);//setting the color of faculty leave Details
        leaveDetails.add(facultyleavedetails);//adding menuitem to the menu
//student details   menu
        JMenuItem studentLeaveDetails = new JMenuItem("  Student Leave Details");//creatin menu item that show on menu
        studentLeaveDetails.setBackground(Color.WHITE);//setting the color of student leave Detials
        leaveDetails.add(studentLeaveDetails);//adding menuitem to the menu

//Exam  menu
        JMenu exam  = new JMenu("Examinations");//creating the menu that going to show on menu bar
        exam.setForeground(Color.BLUE);//setting the color of menu
        menuBar.add(exam);//adding menu to the menu bar
//Examaination Details   menuItem
        JMenuItem examinationdetails = new JMenuItem("  Examination Details");//creatin menu item that show on menu
        examinationdetails.setBackground(Color.WHITE);//setting the color of faculty leave Details
        exam.add(examinationdetails);//adding menuitem to the menu
//Examination Result  menuItem
        JMenuItem examresult = new JMenuItem("  Exam Result");//creatin menu item that show on menu
        examresult.setBackground(Color.WHITE);//setting the color of student leave Detials
        exam.add(examresult);//adding menuitem to the menu


//update information menu
        JMenu updateInformation = new JMenu("Update Information");//creating the menu that going to show on menu bar
        updateInformation.setForeground(Color.RED);
        menuBar.add(updateInformation);
//faculty information   menu
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Information");
        facultyinfo.setBackground(Color.WHITE);
        updateInformation.add(updatefacultyinfo);
//student information   menu
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Information");
        updatestudentinfo.setBackground(Color.WHITE);
        updateInformation.add(updatestudentinfo);


//fee information menu
        JMenu fee = new JMenu("Fee Details");//creating the menu that going to show on menu bar
        fee.setForeground(Color.blue);
        menuBar.add(fee);
//faculty information   menu
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        fee.add(feestructure);
//student information   menu
        JMenuItem feeform = new JMenuItem("Fee Form");
        studentinfo.setBackground(Color.WHITE);
        fee.add(feeform);

//utility menu
        JMenu utility = new JMenu("Utility");//creating the menu that going to show on menu bar
        utility.setForeground(Color.red);
        menuBar.add(utility);
//faculty information   menu
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener( this);
        utility.add(notepad);
//student information   menu
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
        utility.add(calculator);

//Exit menu
        JMenu exit = new JMenu("Exit");//creating the menu that going to show on menu bar
        exit.setForeground(Color.blue);
        menuBar.add(exit);
//faculty information   menu
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(menuBar);//setting the menu bar on the frame

        setVisible(true);//use to make the frame visible
        
    }
    //adding the actionlistner
    @SuppressWarnings("deprecation")//using outdate code

public void actionPerformed(ActionEvent ae) {
        String msg= ae.getActionCommand(); //that compares the click basis on the string cpmparison
        if (msg.equals("Exit")){
                setVisible(false);
        }
        else if (msg.equals("Calculator")){
                try{
                        Runtime.getRuntime().exec("calc.exe");
                }catch(Exception E){
                    E.printStackTrace();

                }
        }
        else if (msg.equals("Notepad")){
                try{
                        Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception E){
                    E.printStackTrace();

                }

        }

    }

    public static void main(String[] args) {
        new Project();
        
    }

}