import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public  class Webapp extends Applet implements ActionListener{
	Button b1,b2,b3;
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4,t5,t6;
	public void init()
	{
		l1=new Label("First Name:");
		t1=new TextField(30);
		l2=new Label("Last Name:");
		t2=new TextField(30);
		l3=new Label("ID");
		t3=new TextField(30);
		l4=new Label("year");
		t4=new TextField(20);
		l5=new Label("designation");
		t5=new TextField(20);
		l6=new Label("salary");
		t6=new TextField(20);
		b1=new Button("push");
		b1.addActionListener(this);
		b2=new Button("get");
		b2.addActionListener(this);
		b3=new Button("go to home page");
		b3.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(b1);
		add(b2);
		add(b3);
	}
	
  
	public void actionPerformed()
	{
		//  b1.getString();
	try
	{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection( 
	"jdbc:mysql://localhost:8080/iyan","admin","admin");    
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}
	


	
public void paint(Graphics g )
{
	Connection con;
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from emp");
	while(rs.next())
	{
		String str=rs.getString("firstname");
		String displayOutput="firstname"+str;
		g.drawString(displayOutput, containerSerializedDataVersion, containerSerializedDataVersion);
		stmt.close();
	}
}
}
public static void main(Strings[] args)
{
	Webapp w=new Webapp();
	w.Webapp();
	paint p=new paint();
	p.paint();
}
