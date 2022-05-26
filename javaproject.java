import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class javaproject {

	public static void main(String[] args) {
		//Create a linked list of integers
		LinkedList<Integer> l=new LinkedList<>();
		//to print 10 random numbers `q`
		for(int i=0;i<10;i++) {
			l.add((int)(Math.random()*200+1));
		}
		//Creating a new gui based frame 
		JFrame frame=new JFrame();
		//setting the location and size of the frame
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//Setting the name and layout of the frame
		frame.setTitle("MY JAVA PROJECT");
		frame.setLayout(null);
		frame.setVisible(true);
		//Creating radiobuttons named stack and queue
		//also creating JButton of the name of the operations push,pop,add,delete
		JRadioButton btn1 = new JRadioButton("Stack");
		JButton s1=new JButton("Push");
		JButton s2=new JButton("Pop");
		JRadioButton btn2 = new JRadioButton("Queue");
		JButton q1=new JButton("Add");
		JButton q2=new JButton("Delete");
		//Setting location and size of all the buttons
		btn1.setBounds(20, 200, 80, 20);
		btn2.setBounds(20, 350, 80, 50);
		s1.setBounds(120, 250, 70, 30);
		s2.setBounds(300, 250, 80, 30);
		q1.setBounds(120, 400, 80, 30);
		q2.setBounds(300, 400, 80, 30);
		//creating JTextField object
        JTextField field=new JTextField();
        //setting dimension and font
        field.setBounds(50, 30, 700, 80);
        field.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        JTextField f2=new JTextField();
      //creating string buffer to convert
        //list elements to string
       StringBuffer str=new StringBuffer();

       //converting list elements to string
        //and adding them to the end of StringBuffer
       str.append("[ ");
       for(int i=0;i< l.size();i++){
           str.append(l.get(i)+", ");
       }
        str.append("]");

       //setting text of field
        field.setText("Linked List-\n"+str.toString());

        f2.setPreferredSize(new Dimension(400,50));
        f2.setBackground(Color.cyan);
        f2.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        f2.setHorizontalAlignment(JTextField.CENTER);
      //creating button group for working of radio buttons
        ButtonGroup group=new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        //adding buttons and fields to the gui frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(s1);
        frame.add(s2);
        frame.add(q1);
        frame.add(q2);
		frame.add(field);
		frame.add(f2);
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 s1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(btn1.isSelected()){
	                    try {
	                        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter number push:"));
	                        l.add(value);

	                        //updating text field
	                        StringBuffer str1=new StringBuffer();
	                        str1.append("{ ");
	                        for(int i=0;i< l.size();i++){
	                            str1.append(l.get(i)+", ");
	                        }
	                        str1.append("}");
	                        field.setText("List-"+str1.toString());
	                        f2.setText("Successfully Pushed "+value+" to List");

	                    }catch(Exception ex){
	                        JOptionPane.showMessageDialog(null,"Enter Integer to be Push","Error",JOptionPane.WARNING_MESSAGE);
	                    }
	                }
	                else{
	                    //showing error option in case of invalid choice
	                    JOptionPane.showMessageDialog(null,"Invalid Choice","Error Message",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        });

	        //adding logic to pop button
	        s2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(btn1.isSelected()){
	                    int value=l.removeLast();
	                    //updating text field
	                    StringBuffer str1=new StringBuffer();
	                    str1.append("{ ");
	                    for(int i=0;i< l.size();i++){
	                        str1.append(l.get(i)+", ");
	                    }
	                    str1.append("}");
	                    field.setText("List-"+str1.toString());
	                    f2.setText("Successfully Popped "+value+" from List");
	                }
	                else{
	                    //showing error option in case of invalid choice
	                    JOptionPane.showMessageDialog(null,"Invalid Choice","Error Message",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        });

	        //adding logic to add button
	        q1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(btn2.isSelected()){
	                    try{
	                    int value=Integer.parseInt(JOptionPane.showInputDialog("Enter number to be added:"));
	                    l.add(value);
	                    //updating text field
	                    StringBuffer str1=new StringBuffer();
	                    str1.append("{ ");
	                    for(int i=0;i< l.size();i++){
	                        str1.append(l.get(i)+", ");
	                    }
	                    str1.append("}");
	                    field.setText("Linked List-"+str1.toString());
	                    f2.setText("Successfully Added "+value+" to List");

	                    }catch(Exception ex){
	                        JOptionPane.showMessageDialog(null,"Enter Only Integer to Add","Error",JOptionPane.WARNING_MESSAGE);
	                    }
	                }
	                else{
	                    //showing error option in case of invalid choice
	                    JOptionPane.showMessageDialog(null,"Invalid Choice","Error Message",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        });

	        //adding logic to delete button
	        q2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(btn2.isSelected()){
	                    int value=l.removeFirst();
	                    //updating text field
	                    StringBuffer str1=new StringBuffer();
	                    str1.append("{ ");
	                    for(int i=0;i< l.size();i++){
	                        str1.append(l.get(i)+", ");
	                    }
	                    str1.append("}");
	                    field.setText("Linked List-"+str1.toString());

	                    f2.setText("Successfully Deleted "+value+" from List");
	                }
	                else{
	                    //showing error option in case of invalid choice
	                    JOptionPane.showMessageDialog(null,"Invalid Choice","Error Message",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        });

	}

}

