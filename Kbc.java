import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class Kbc implements ActionListener,MouseListener
{
	JFrame f=new JFrame("Kaun Banega Crorepati");
	Panel p=new Panel();
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	Panel p6=new Panel();
	Panel p7=new Panel();
	Panel p8=new Panel();
	Panel p9=new Panel();
	Panel p10=new Panel();
	Panel p11=new Panel();
	Panel p12=new Panel();
	Panel p13=new Panel();
	Panel lastpane=new Panel();

	JLabel jl;
	Label l=new Label("Welcome To Kaun Banega Crorepati");
	Label l1,l2,l3;
	Font font=new Font("Algerian",Font.BOLD,28);
	Font fontlabel=new Font("Algerian",Font.BOLD,28);
	Font fontwelcome=new Font("Algerian",Font.BOLD,34);
	Label nextpage;
	Label next[]=new Label[11];
	Label quit[]=new Label[11];
	Label fifty[]=new Label[11];
	Label swap[]=new Label[11];
	Label mssg[]=new Label[11];
	Label greet,winamt;
	JTextField t,t1,t2;
	// Button Area
	Button[] opt=new Button[44];
	Button show[]=new Button[11];
	//opt[0]=("");
	Object oo;
	static int j=0,k=0,m=0;
	String name;
	static int n,san,ban;   // n variable for next Button  , san ban variable for 50-50 option
	static int stop=0;  // this variable for stoping 50-50 option
	static int swapstop=0;
	static int back2que=0;
	static int pointer=0;
	static int amt,amount,value=0; 
	Kbc()	
	{
		f.setSize(1400,800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.BLACK);
		p.setBounds(5,20,1400,100);			//welcome to kbc panel
		p.setBackground(Color.CYAN);
		p.setLayout(null);
		// p.setLayout(new FlowLayout());
		f.add(p);

		// Adding kbc image
		Container c=f.getContentPane();
        c.setLayout(null);
        ImageIcon icon=new ImageIcon("C:/Users/hkr/Pictures/pics/kbclogo.png");
        Image db=icon.getImage();
        Image md=db.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        icon=new ImageIcon(md);
        jl=new JLabel(icon);
        jl.setBounds(5,20,100,100);
        c.add(jl);

	}
	void infopage()
	{
		l.setFont(font);
		l.setBounds(400,30,600,60);
		p.add(l);
		f.add(p);

		// Panel p1=new Panel();
		// p1.setLayout(null);
		// p1.setBackground(Color.PINK);
		// p1.setBounds(400,300,500,400);
		// //f.add(p1);

		 l1=new Label("Name");
		 l2=new Label("Code");
		 l3=new Label("Layout Color");
		l1.setBounds(50,50,100,50);
		l2.setBounds(50,150,100,50);
		l3.setBounds(50,250,100,50);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);

		t=new JTextField();
		t1=new JTextField();
		t2=new JTextField();
		t.setBounds(200,50,200,50);
		t1.setBounds(200,150,200,50);
		t2.setBounds(200,250,200,50);
		p1.add(t);
		p1.add(t1);
		p1.add(t2);

		// creating dialog box for getting name and password

		Object[] fields={"Name",t,"Password",t1};
		int get=JOptionPane.showConfirmDialog(null,fields);
		System.out.println("coming output  "+get);
		if(get==JOptionPane.YES_OPTION)	// if user click the yes option after filling details
		{
			name=t.getText();
			String password=t1.getText();
			System.out.println(password);
			if(password.equals("kapil"))
			{
				this.introduceFirstPage(name);
			}
		}
		else if(get==JOptionPane.NO_OPTION)	//if user click the no option 
		{
			int quit=JOptionPane.showConfirmDialog(null,"do you want to quit the game");
			f.dispose();
		}
		//else if(get==JOptionPane.)
	}  
	void introduceFirstPage(String x)
	{
		// black portion is panel 2
		p2=new Panel();
		p2.setLayout(null);
		p2.setBounds(20,130,1320,700);
		p2.setBackground(Color.BLACK);
		f.add(p2);
		Font logofont=new Font("algerian",Font.BOLD,200);

		Label heading= new Label("There are 10 Questions to win this game");
		Label welcome= new Label("Hello "+x+" Welcome to Fun Play Game.");
		Label q1=new Label("1.  $1000");
		Label q2=new Label("2.  $2000");
		Label q3=new Label("3.  $5000");
		Label q4=new Label("4.  $10000 win value");
		Label q5=new Label("5.  $50000");
		Label q6=new Label("6.  $100000");
		Label q7=new Label("7.  $1000000 win value");
		Label q8=new Label("8.  $5000000");
		Label q9=new Label("9.  $10000000 win value");
		Label q0=new Label("10. $20000000");
		q1.setBounds(200,230,250,30);
		q2.setBounds(200,260,250,30);
		q3.setBounds(200,290,250,30);
		q4.setBounds(200,320,250,30);
		q5.setBounds(200,350,250,30);
		q6.setBounds(200,380,250,30);
		q7.setBounds(200,410,250,30);
		q8.setBounds(200,440,250,30);
		q9.setBounds(200,470,250,30);
		q0.setBounds(200,500,250,30);
		p2.add(q1); q1.setFont(fontlabel); q1.setForeground(Color.WHITE);
		p2.add(q2); q2.setFont(fontlabel); q2.setForeground(Color.WHITE);
		p2.add(q3); q3.setFont(fontlabel); q3.setForeground(Color.WHITE);
		p2.add(q4); q4.setFont(fontlabel); q4.setForeground(Color.WHITE);
		p2.add(q5); q5.setFont(fontlabel); q5.setForeground(Color.WHITE);
		p2.add(q6); q6.setFont(fontlabel); q6.setForeground(Color.WHITE);
		p2.add(q7); q7.setFont(fontlabel); q7.setForeground(Color.WHITE);
		p2.add(q8); q8.setFont(fontlabel); q8.setForeground(Color.WHITE);
		p2.add(q9); q9.setFont(fontlabel); q9.setForeground(Color.WHITE);
		p2.add(q0); q0.setFont(fontlabel); q0.setForeground(Color.WHITE);

		welcome.setBounds(360,50,750,50);
		welcome.setFont(fontwelcome);
		heading.setBounds(400,130,1000,50);
		heading.setFont(fontlabel);
		p2.add(welcome);
		p2.add(heading);
		heading.setForeground(Color.GREEN);
		welcome.setForeground(Color.CYAN);

		Label logo=new Label("KBC");
		logo.setBounds(500,170,500,350);
		p2.add(logo);
		logo.setFont(logofont);
		logo.setForeground(Color.BLUE);

		nextpage=new Label("       Next");
		nextpage.setBounds(1130,350,180,50);
		nextpage.addMouseListener(this);
		nextpage.setBackground(Color.CYAN);
		nextpage.setForeground(Color.WHITE);
		nextpage.setFont(fontlabel);
		p2.add(nextpage);

	}
	public void Page1()
	{
		
		j=0;k=3;n=0;back2que=1;pointer=1;amt=1000;
		Label que1=new Label("Q1.  Who made the google search engine in 1996 ?");
		opt[0]=new Button("(A) larry page");
		opt[1]=new Button("(B) Brin");
		opt[2]=new Button("(C) Both A & B");
		opt[3]=new Button("(D) Mark Zukerberg");
		p3=new Panel();
		p3.setLayout(null);
		p3.setBounds(20,130,1320,700);
		p3.setBackground(Color.BLACK);
		f.add(p3);
		que1.setBounds(100,100,700,50);
		que1.setFont(font);
		que1.setForeground(Color.WHITE);
		opt[0].setBounds(100,200,300,50);
		opt[0].setBackground(Color.CYAN);
		p3.add(opt[0]);
		opt[1].setBounds(500,200,300,50);
		opt[1].setBackground(Color.CYAN);
		p3.add(opt[1]);
		opt[2].setBounds(100,300,300,50);
		opt[2].setBackground(Color.CYAN);
		p3.add(opt[2]);
		opt[3].setBounds(500,300,300,50);
		opt[3].setBackground(Color.CYAN);
		p3.add(opt[3]);
		p3.add(que1);

		// next button for go further

		next[0]=new Label("                 next");
		quit[0]=new Label("                 quit");
		next[0].setBounds(1130,300,180,50);
		next[0].addMouseListener(this);
		next[0].setBackground(Color.CYAN) ;
		next[0].setForeground(Color.WHITE);
		quit[0].setBounds(1130,400,180,50);
		quit[0].addMouseListener(this);
		quit[0].setBackground(Color.CYAN);
		quit[0].setForeground(Color.WHITE);
		p3.add(quit[0]);

		
			opt[0].addActionListener(this);
			opt[1].addActionListener(this);
			opt[2].addActionListener(this);
			opt[3].addActionListener(this);

			
			//Label fifty=new Label("      50-50");

			fifty[0]=new Label("      50-50");
			fifty[0].setBounds(800,50,200,50);
			fifty[0].setForeground(Color.GREEN);
			fifty[0].setFont(fontlabel);
			fifty[0].addMouseListener(this);
			p3.add(fifty[0]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[0].setForeground(Color.red);
			}

			// Label for question change option
			swap[0]=new Label("     Swap");
			swap[0].setBounds(1050,50,200,50);
			swap[0].setForeground(Color.GREEN);
			swap[0].setFont(fontlabel);
			swap[0].addMouseListener(this);
			p3.add(swap[0]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
			{
			 	System.out.println("swapstop enter ");
			 	swap[0].setForeground(Color.RED);
			}

			// show button to show the correct answer
			show[0]=new Button("Show Ans");
			show[0].setBounds(1130,500,180,50);
			show[0].setForeground(Color.WHITE);
			show[0].setBackground(Color.CYAN);
			show[0].addActionListener(this);

			//to show winning message
			mssg[0]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[0].setBounds(300,450,700,50);
			mssg[0].setFont(fontlabel);
			mssg[0].setForeground(Color.CYAN);
			// timer option 

			/*Label timer=new Label("");
			timer.setBounds(800,300,100,50);   
			timer.setBackground(Color.CYAN);
			p3.add(timer);
			try{
				timer.setText(String.valueOf(sec));
				TimeUnit.SECONDS.sleep(1);

			}
			catch(InterruptedException e5)
			{
				System.err.format("IOException: %s%n",e5);
			}*/
		
	}
	public void Page2()
	{
		//System.out.println(".....hello kapil.... ");
		j=4;k=7;n=1;san=1;ban=1;back2que=2;pointer=2;amt=2000;
		Label que2=new Label("Q2. which team won the worldcup most"); 
		opt[3+1]=new Button("(A) Australia");
		opt[4+1]=new Button("(B) India");
		opt[5+1]=new Button("(C) New zealand");
		opt[6+1]=new Button("(D) South Africa");
		p4=new Panel();
		p4.setLayout(null);
		p4.setBounds(20,130,1320,700);
		p4.setBackground(Color.BLACK);
		f.add(p4);
		
		que2.setBounds(100,100,700,50);
		que2.setFont(font);
		que2.setForeground(Color.WHITE);
		opt[4].setBounds(100,200,300,50);
		opt[4].setBackground(Color.CYAN);
		p4.add(opt[4]);  
		opt[4].addActionListener(this);
		opt[5].setBounds(500,200,300,50);
		opt[5].setBackground(Color.CYAN);
		p4.add(opt[5]);
		opt[5].addActionListener(this);
		opt[6].setBounds(100,300,300,50);
		opt[6].setBackground(Color.CYAN);
		p4.add(opt[6]);
		opt[6].addActionListener(this);
		opt[7].setBounds(500,300,300,50);
		opt[7].setBackground(Color.CYAN);
		p4.add(opt[7]);
		opt[7].addActionListener(this);
		p4.add(que2); 

		// next button for go further

		next[1]=new Label("                 next");
		quit[1]=new Label("                 quit");
		next[1].setBounds(1130,300,180,50);
		next[1].addMouseListener(this);
		next[1].setBackground(Color.CYAN) ;
		next[1].setForeground(Color.WHITE);
		quit[1].setBounds(1130,400,180,50);
		quit[1].addMouseListener(this);
		quit[1].setBackground(Color.CYAN);
		quit[1].setForeground(Color.WHITE);
		p4.add(quit[1]);

		// show button to show the correct answer
			show[1]=new Button("Show Ans");
			show[1].setBounds(1130,500,180,50);
			show[1].setForeground(Color.WHITE);
			show[1].setBackground(Color.CYAN);
			show[1].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[1]=new Label("      50-50");
			fifty[1].setBounds(800,50,200,50);
			fifty[1].setForeground(Color.GREEN);
			fifty[1].setFont(fontlabel);
			fifty[1].addMouseListener(this);
			p4.add(fifty[1]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[1].setForeground(Color.red);
			}

			// Label for question change option 
			swap[1]=new Label("     Swap");
			swap[1].setBounds(1050,50,200,50);
			swap[1].setForeground(Color.GREEN);
			swap[1].setFont(fontlabel);
			swap[1].addMouseListener(this);
			p4.add(swap[1]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[1].setForeground(Color.RED);
				}

			//to show winning message
			mssg[1]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[1].setBounds(300,450,700,50);
			mssg[1].setFont(fontlabel);
			mssg[1].setForeground(Color.CYAN);
			
	}

	void Page3()
	{
		//System.out.println(".....hello kapil.... ");
		j=8;k=11;n=2;san=2;ban=2;back2que=3;pointer=3;amt=5000;
		System.out.println("j and k values are "+j+" "+k);
		Label que4=new Label("Q3. The Language of Lakshadweep.A union territory of india,is"); 
		opt[8]=new Button("(A) Tamil");
		opt[9]=new Button("(B) Hindi");
		opt[10]=new Button("(C) Malayalam");
		opt[11]=new Button("(D) Telugu");
		p6=new Panel();
		p6.setLayout(null);
		p6.setBounds(20,130,1320,700);
		p6.setBackground(Color.BLACK);
		f.add(p6);
		
		//System.out.println("value of opt[10]"+opt[10]);
		que4.setBounds(100,100,850,100);
		que4.setFont(font);
		que4.setForeground(Color.WHITE);
		opt[8].setBounds(100,200,300,50);
		opt[8].setBackground(Color.CYAN);
		p6.add(opt[8]);
		//System.out.println("value of opt[4]"+opt[8]);
		opt[8].addActionListener(this);
		opt[9].setBounds(500,200,300,50);
		opt[9].setBackground(Color.CYAN);
		p6.add(opt[9]);
		opt[9].addActionListener(this);
		opt[10].setBounds(100,300,300,50);
		opt[10].setBackground(Color.CYAN);
		p6.add(opt[10]);
		opt[10].addActionListener(this);
		opt[11].setBounds(500,300,300,50);
		opt[11].setBackground(Color.CYAN);
		p6.add(opt[11]);
		opt[11].addActionListener(this);
		p6.add(que4); 

		// next button for go further

		next[2]=new Label("                 next");
		quit[2]=new Label("                 quit");
		next[2].setBounds(1130,300,180,50);
		next[2].addMouseListener(this);
		next[2].setBackground(Color.CYAN) ;
		next[2].setForeground(Color.WHITE);
		quit[2].setBounds(1130,400,180,50);
		quit[2].addMouseListener(this);
		quit[2].setBackground(Color.CYAN);
		quit[2].setForeground(Color.WHITE);
		p6.add(quit[2]);

		// show button to show the correct answer
			show[2]=new Button("Show Ans");
			show[2].setBounds(1130,500,180,50);
			show[2].setForeground(Color.WHITE);
			show[2].setBackground(Color.CYAN);
			show[2].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[2]=new Label("      50-50");
			fifty[2].setBounds(800,50,200,50);
			fifty[2].setForeground(Color.GREEN);
			fifty[2].setFont(fontlabel);
			fifty[2].addMouseListener(this);
			p6.add(fifty[2]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[2].setForeground(Color.red);
			}

			// Label for question change option
			swap[2]=new Label("     Swap");
			swap[2].setBounds(1050,50,200,50);
			swap[2].setForeground(Color.GREEN);
			swap[2].setFont(fontlabel);
			swap[2].addMouseListener(this);
			p6.add(swap[2]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[2].setForeground(Color.RED);
				}

			//to show winning message
			mssg[2]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[2].setBounds(300,450,700,50);
			mssg[2].setFont(fontlabel);
			mssg[2].setForeground(Color.CYAN);
			j=8;k=11;n=2;san=2;ban=2;
			System.out.println("page 3 ends ");
			
	}
	void Page4()
	{
		System.out.println("page 4 starts ");
		j=12;k=15;n=3;san=3;ban=3;back2que=4;pointer=4;amt=10000;
		Label que5=new Label("Q4. The first month of the Indian national calendar is"); 
		opt[12]=new Button("(A) Magha");
		opt[13]=new Button("(B) Chaitra");
		opt[14]=new Button("(C) Ashadha");
		opt[15]=new Button("(D) Vaishakha");
		p7=new Panel();
		p7.setLayout(null);
		p7.setBounds(20,130,1320,700);
		p7.setBackground(Color.BLACK);
		f.add(p7);
		
		que5.setBounds(100,100,850,100);
		que5.setFont(font);
		que5.setForeground(Color.WHITE);
		opt[12].setBounds(100,200,300,50);
		opt[12].setBackground(Color.CYAN);
		p7.add(opt[12]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[12].addActionListener(this);
		opt[13].setBounds(500,200,300,50);
		opt[13].setBackground(Color.CYAN);
		p7.add(opt[13]);
		opt[13].addActionListener(this);
		opt[14].setBounds(100,300,300,50);
		opt[14].setBackground(Color.CYAN);
		p7.add(opt[14]);
		opt[14].addActionListener(this);
		opt[15].setBounds(500,300,300,50);
		opt[15].setBackground(Color.CYAN);
		p7.add(opt[15]);
		opt[15].addActionListener(this);
		p7.add(que5); 

		// next button for go further

		next[3]=new Label("                 next");
		quit[3]=new Label("                 quit");
		next[3].setBounds(1130,300,180,50);
		next[3].addMouseListener(this);
		next[3].setBackground(Color.CYAN) ;
		next[3].setForeground(Color.WHITE);
		quit[3].setBounds(1130,400,180,50);
		quit[3].addMouseListener(this);
		quit[3].setBackground(Color.CYAN);
		quit[3].setForeground(Color.WHITE);
		p7.add(quit[3]);

		// show button to show the correct answer
			show[3]=new Button("Show Ans");
			show[3].setBounds(1130,500,180,50);
			show[3].setForeground(Color.WHITE);
			show[3].setBackground(Color.CYAN);
			show[3].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[3]=new Label("      50-50");
			fifty[3].setBounds(800,50,200,50);
			fifty[3].setForeground(Color.GREEN);
			fifty[3].setFont(fontlabel);
			fifty[3].addMouseListener(this);
			p7.add(fifty[3]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[3].setForeground(Color.red);
			}

			// Label for question change option
			swap[3]=new Label("     Swap");
			swap[3].setBounds(1050,50,200,50);
			swap[3].setForeground(Color.GREEN);
			swap[3].setFont(fontlabel);
			swap[3].addMouseListener(this);
			p7.add(swap[3]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[3].setForeground(Color.RED);
				}

			//to show winning message
			mssg[3]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[3].setBounds(300,450,700,50);
			mssg[3].setFont(fontlabel);
			mssg[3].setForeground(Color.CYAN);
			
	}

	void Page5()
	{
		System.out.println("page 5 starts ");
		j=16;k=19;n=4;san=4;ban=4;back2que=5;pointer=5;amt=50000;value=10000;
		Label que6=new Label("Q5. Dogri is spoken in which of the following states "); 
		opt[16]=new Button("(A) Bihar");
		opt[17]=new Button("(B) Orissa");
		opt[18]=new Button("(C) Assam");
		opt[19]=new Button("(D) Jammu & Kashmir");
		p8=new Panel();
		p8.setLayout(null);
		p8.setBounds(20,130,1320,700);
		p8.setBackground(Color.BLACK);
		f.add(p8);
		
		que6.setBounds(100,100,850,100);
		que6.setFont(font);
		que6.setForeground(Color.WHITE);
		opt[16].setBounds(100,200,300,50);
		opt[16].setBackground(Color.CYAN);
		p8.add(opt[16]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[16].addActionListener(this);
		opt[17].setBounds(500,200,300,50);
		opt[17].setBackground(Color.CYAN);
		p8.add(opt[17]);
		opt[17].addActionListener(this);
		opt[18].setBounds(100,300,300,50);
		opt[18].setBackground(Color.CYAN);
		p8.add(opt[18]);
		opt[18].addActionListener(this);
		opt[19].setBounds(500,300,300,50);
		opt[19].setBackground(Color.CYAN);
		p8.add(opt[19]);
		opt[19].addActionListener(this);
		p8.add(que6); 

		// next button for go further

		next[4]=new Label("                 next");
		quit[4]=new Label("                 quit");
		next[4].setBounds(1130,300,180,50);
		next[4].addMouseListener(this);
		next[4].setBackground(Color.CYAN) ;
		next[4].setForeground(Color.WHITE);
		quit[4].setBounds(1130,400,180,50);
		quit[4].addMouseListener(this);
		quit[4].setBackground(Color.CYAN);
		quit[4].setForeground(Color.WHITE);
		p8.add(quit[4]);

		// show button to show the correct answer
			show[4]=new Button("Show Ans");
			show[4].setBounds(1130,500,180,50);
			show[4].setForeground(Color.WHITE);
			show[4].setBackground(Color.CYAN);
			show[4].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[4]=new Label("      50-50");
			fifty[4].setBounds(800,50,200,50);
			fifty[4].setForeground(Color.GREEN);
			fifty[4].setFont(fontlabel);
			fifty[4].addMouseListener(this);
			p8.add(fifty[4]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[4].setForeground(Color.red);
			}

			// Label for question change option
			swap[4]=new Label("     Swap");
			swap[4].setBounds(1050,50,200,50);
			swap[4].setForeground(Color.GREEN);
			swap[4].setFont(fontlabel);
			swap[4].addMouseListener(this);
			p8.add(swap[4]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[4].setForeground(Color.RED);
				}

			//to show winning message
			mssg[4]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[4].setBounds(300,450,700,50);
			mssg[4].setFont(fontlabel);
			mssg[4].setForeground(Color.CYAN);
			
	
	}
	void Page6()
	{
		System.out.println("page 5 starts ");
		j=20;k=23;n=5;san=5;ban=5;back2que=6;pointer=6;amt=100000;
		Label que7=new Label("Q6. Which of the-following is wrongly matched? "); 
		opt[20]=new Button("(A) Qutab Minar- Delhi");
		opt[21]=new Button("(B) Charminar-Lucknow");
		opt[22]=new Button("(C) Taj Mahal -Agra");
		opt[23]=new Button("(D) Ajanta Caves -Maharashtra");
		p9=new Panel();
		p9.setLayout(null);
		p9.setBounds(20,130,1320,700);
		p9.setBackground(Color.BLACK);
		f.add(p9);
		
		que7.setBounds(100,100,850,100);
		que7.setFont(font);
		que7.setForeground(Color.WHITE);
		opt[20].setBounds(100,200,300,50);
		opt[20].setBackground(Color.CYAN);
		p9.add(opt[20]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[20].addActionListener(this);
		opt[21].setBounds(500,200,300,50);
		opt[21].setBackground(Color.CYAN);
		p9.add(opt[21]);
		opt[21].addActionListener(this);
		opt[22].setBounds(100,300,300,50);
		opt[22].setBackground(Color.CYAN);
		p9.add(opt[22]);
		opt[22].addActionListener(this);
		opt[23].setBounds(500,300,300,50);
		opt[23].setBackground(Color.CYAN);
		p9.add(opt[23]);
		opt[23].addActionListener(this);
		p9.add(que7); 

		// next button for go further

		next[5]=new Label("                 next");
		quit[5]=new Label("                 quit");
		next[5].setBounds(1130,300,180,50);
		next[5].addMouseListener(this);
		next[5].setBackground(Color.CYAN) ;
		next[5].setForeground(Color.WHITE);
		quit[5].setBounds(1130,400,180,50);
		quit[5].addMouseListener(this);
		quit[5].setBackground(Color.CYAN);
		quit[5].setForeground(Color.WHITE);
		p9.add(quit[5]);

		// show button to show the correct answer
			show[5]=new Button("Show Ans");
			show[5].setBounds(1130,500,180,50);
			show[5].setForeground(Color.WHITE);
			show[5].setBackground(Color.CYAN);
			show[5].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[5]=new Label("      50-50");
			fifty[5].setBounds(800,50,200,50);
			fifty[5].setForeground(Color.GREEN);
			fifty[5].setFont(fontlabel);
			fifty[5].addMouseListener(this);
			p9.add(fifty[5]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[5].setForeground(Color.red);
			}

			// Label for question change option
			swap[5]=new Label("     Swap");
			swap[5].setBounds(1050,50,200,50);
			swap[5].setForeground(Color.GREEN);
			swap[5].setFont(fontlabel);
			swap[5].addMouseListener(this);
			p9.add(swap[5]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[5].setForeground(Color.RED);
				}

			//to show winning message
			mssg[5]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[5].setBounds(300,450,700,50);
			mssg[5].setFont(fontlabel);
			mssg[5].setForeground(Color.CYAN);
			
	
	}
	void Page7()
	{
		System.out.println("page 5 starts ");
		j=24;k=27;n=6;san=6;ban=6;back2que=7;pointer=7;amt=1000000;
		Label que8=new Label("Q7. The 227 year old 'Nawab Saheb Ki Haveli' is Iocated at "); 
		opt[24]=new Button("(A) Hyderabad");
		opt[25]=new Button("(B) Jaipur");
		opt[26]=new Button("(C) New Delhi");
		opt[27]=new Button("(D) Agra");
		p10=new Panel();
		p10.setLayout(null);
		p10.setBounds(20,130,1320,700);
		p10.setBackground(Color.BLACK);
		f.add(p10);
		
		que8.setBounds(100,100,850,100);
		que8.setFont(font);
		que8.setForeground(Color.WHITE);
		opt[24].setBounds(100,200,300,50);
		opt[24].setBackground(Color.CYAN);
		p10.add(opt[24]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[24].addActionListener(this);
		opt[25].setBounds(500,200,300,50);
		opt[25].setBackground(Color.CYAN);
		p10.add(opt[25]);
		opt[25].addActionListener(this);
		opt[26].setBounds(100,300,300,50);
		opt[26].setBackground(Color.CYAN);
		p10.add(opt[26]);
		opt[26].addActionListener(this);
		opt[27].setBounds(500,300,300,50);
		opt[27].setBackground(Color.CYAN);
		p10.add(opt[27]);
		opt[27].addActionListener(this);
		p10.add(que8); 

		// next button for go further

		next[6]=new Label("                 next");
		quit[6]=new Label("                 quit");
		next[6].setBounds(1130,300,180,50);
		next[6].addMouseListener(this);
		next[6].setBackground(Color.CYAN) ;
		next[6].setForeground(Color.WHITE);
		quit[6].setBounds(1130,400,180,50);
		quit[6].addMouseListener(this);
		quit[6].setBackground(Color.CYAN);
		quit[6].setForeground(Color.WHITE);
		p10.add(quit[6]);

		// show button to show the correct answer
			show[6]=new Button("Show Ans");
			show[6].setBounds(1130,500,180,50);
			show[6].setForeground(Color.WHITE);
			show[6].setBackground(Color.CYAN);
			show[6].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[6]=new Label("      50-50");
			fifty[6].setBounds(800,50,200,50);
			fifty[6].setForeground(Color.GREEN);
			fifty[6].setFont(fontlabel);
			fifty[6].addMouseListener(this);
			p10.add(fifty[6]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[6].setForeground(Color.red);
			}

			// Label for question change option
			swap[6]=new Label("     Swap");
			swap[6].setBounds(1050,50,200,50);
			swap[6].setForeground(Color.GREEN);
			swap[6].setFont(fontlabel);
			swap[6].addMouseListener(this);
			p10.add(swap[6]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[6].setForeground(Color.RED);
				}

			//to show winning message
			mssg[6]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[6].setBounds(300,450,700,50);
			mssg[6].setFont(fontlabel);
			mssg[6].setForeground(Color.CYAN);
			
	
	}
	void Page8()
	{
		System.out.println("page 8 starts ");
		j=28;k=31;n=7;san=7;ban=7;back2que=8;pointer=8;amt=5000000;value=1000000;
		Label que9=new Label("Q8. Pongal is a popular festival of which state? "); 
		opt[28]=new Button("(A) Karnataka");
		opt[29]=new Button("(B) Kerala");
		opt[30]=new Button("(C) Tamil Nadu");
		opt[31]=new Button("(D) Andra Pradesh");
		p11=new Panel();
		p11.setLayout(null);
		p11.setBounds(20,130,1320,700);
		p11.setBackground(Color.BLACK);
		f.add(p11);
		
		que9.setBounds(100,100,850,100);
		que9.setFont(font);
		que9.setForeground(Color.WHITE);
		opt[28].setBounds(100,200,300,50);
		opt[28].setBackground(Color.CYAN);
		p11.add(opt[28]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[28].addActionListener(this);
		opt[29].setBounds(500,200,300,50);
		opt[29].setBackground(Color.CYAN);
		p11.add(opt[29]);
		opt[29].addActionListener(this);
		opt[30].setBounds(100,300,300,50);
		opt[30].setBackground(Color.CYAN);
		p11.add(opt[30]);
		opt[30].addActionListener(this);
		opt[31].setBounds(500,300,300,50);
		opt[31].setBackground(Color.CYAN);
		p11.add(opt[31]);
		opt[31].addActionListener(this);
		p11.add(que9); 

		// next button for go further

		next[7]=new Label("                 next");
		quit[7]=new Label("                 quit");
		next[7].setBounds(1130,300,180,50);
		next[7].addMouseListener(this);
		next[7].setBackground(Color.CYAN) ;
		next[7].setForeground(Color.WHITE);
		quit[7].setBounds(1130,400,180,50);
		quit[7].addMouseListener(this);
		quit[7].setBackground(Color.CYAN);
		quit[7].setForeground(Color.WHITE);
		p11 .add(quit[7]);

		// show button to show the correct answer
			show[7]=new Button("Show Ans");
			show[7].setBounds(1130,500,180,50);
			show[7].setForeground(Color.WHITE);
			show[7].setBackground(Color.CYAN);
			show[7].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[7]=new Label("      50-50");
			fifty[7].setBounds(800,50,200,50);
			fifty[7].setForeground(Color.GREEN);
			fifty[7].setFont(fontlabel);
			fifty[7].addMouseListener(this);
			p11.add(fifty[7]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[7].setForeground(Color.red);
			}

			// Label for question change option
			swap[7]=new Label("     Swap");
			swap[7].setBounds(1050,50,200,50);
			swap[7].setForeground(Color.GREEN);
			swap[7].setFont(fontlabel);
			swap[7].addMouseListener(this);
			p11.add(swap[7]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[7].setForeground(Color.RED);
				}

			//to show winning message
			mssg[7]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[7].setBounds(300,450,700,50);
			mssg[7].setFont(fontlabel);
			mssg[7].setForeground(Color.CYAN);
			
	
	}
	void Page9()
	{
		System.out.println("page 8 starts ");
		j=32;k=35;n=8;san=8;ban=8;back2que=9;pointer=9;amt=10000000;
		Label que10=new Label("Q9. Which of the following Muslim Festivals is based on the 'Holy Quran'? "); 
		opt[32]=new Button("(A) Id-ul-zuha");
		opt[33]=new Button("(B) Id-ul-Fitr");
		opt[34]=new Button("(C) Bakri-id");
		opt[35]=new Button("(D) Moharram");
		p12=new Panel();
		p12.setLayout(null);
		p12.setBounds(20,130,1320,700);
		p12.setBackground(Color.BLACK);
		f.add(p12);
		
		que10.setBounds(100,100,900,100);
		que10.setFont(font);
		que10.setForeground(Color.WHITE);
		opt[32].setBounds(100,200,300,50);
		opt[32].setBackground(Color.CYAN);
		p12.add(opt[32]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[32].addActionListener(this);
		opt[33].setBounds(500,200,300,50);
		opt[33].setBackground(Color.CYAN);
		p12.add(opt[33]);
		opt[33].addActionListener(this);
		opt[34].setBounds(100,300,300,50);
		opt[34].setBackground(Color.CYAN);
		p12.add(opt[34]);
		opt[34].addActionListener(this);
		opt[35].setBounds(500,300,300,50);
		opt[35].setBackground(Color.CYAN);
		p12.add(opt[35]);
		opt[35].addActionListener(this);
		p12.add(que10); 

		// next button for go further

		next[8]=new Label("                 next");
		quit[8]=new Label("                 quit");
		next[8].setBounds(1130,300,180,50);
		next[8].addMouseListener(this);
		next[8].setBackground(Color.CYAN) ;
		next[8].setForeground(Color.WHITE);
		quit[8].setBounds(1130,400,180,50);
		quit[8].addMouseListener(this);
		quit[8].setBackground(Color.CYAN);
		quit[8].setForeground(Color.WHITE);
		p12.add(quit[8]);

		// show button to show the correct answer
			show[8]=new Button("Show Ans");
			show[8].setBounds(1130,500,180,50);
			show[8].setForeground(Color.WHITE);
			show[8].setBackground(Color.CYAN);
			show[8].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[8]=new Label("      50-50");
			fifty[8].setBounds(800,50,200,50);
			fifty[8].setForeground(Color.GREEN);
			fifty[8].setFont(fontlabel);
			fifty[8].addMouseListener(this);
			p12.add(fifty[8]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[8].setForeground(Color.red);
			}

			// Label for question change option
			swap[8]=new Label("     Swap");
			swap[8].setBounds(1050,50,200,50);
			swap[8].setForeground(Color.GREEN);
			swap[8].setFont(fontlabel);
			swap[8].addMouseListener(this);
			p12.add(swap[8]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[8].setForeground(Color.RED);
				}

			//to show winning message
			mssg[8]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[8].setBounds(300,450,700,50);
			mssg[8].setFont(fontlabel);
			mssg[8].setForeground(Color.CYAN);
			
	
	}
	void Page10()
	{
		System.out.println("page 8 starts ");
		j=36;k=39;n=9;san=9;ban=9;back2que=10;pointer=10;amt=20000000;value=10000000;
		Label que11=new Label("Q10. Which city of india was first of all affected by plague? "); 
		opt[36]=new Button("(A) Jaipur");
		opt[37]=new Button("(B) Bombay");
		opt[38]=new Button("(C) Surat");
		opt[39]=new Button("(D) Kanpur");
		p13=new Panel();
		p13.setLayout(null);
		p13.setBounds(20,130,1320,700);
		p13.setBackground(Color.BLACK);
		f.add(p13);
		
		que11.setBounds(100,100,850,100);
		que11.setFont(font);
		que11.setForeground(Color.WHITE);
		opt[36].setBounds(100,200,300,50);
		opt[36].setBackground(Color.CYAN);
		p13.add(opt[36]);
		//System.out.println("value of opt[4]"+opt[4]);
		opt[36].addActionListener(this);
		opt[37].setBounds(500,200,300,50);
		opt[37].setBackground(Color.CYAN);
		p13.add(opt[37]);
		opt[37].addActionListener(this);
		opt[38].setBounds(100,300,300,50);
		opt[38].setBackground(Color.CYAN);
		p13.add(opt[38]);
		opt[38].addActionListener(this);
		opt[39].setBounds(500,300,300,50);
		opt[39].setBackground(Color.CYAN);
		p13.add(opt[39]);
		opt[39].addActionListener(this);
		p13.add(que11); 

		// next button for go further

		next[9]=new Label("                 next");
		quit[9]=new Label("                 quit");
		next[9].setBounds(1130,300,180,50);
		next[9].addMouseListener(this);
		next[9].setBackground(Color.CYAN) ;
		next[9].setForeground(Color.WHITE);
		quit[9].setBounds(1130,400,180,50);
		quit[9].addMouseListener(this);
		quit[9].setBackground(Color.CYAN);
		quit[9].setForeground(Color.WHITE);
		p13.add(quit[9]);

		// show button to show the correct answer
			show[9]=new Button("Show Ans");
			show[9].setBounds(1130,500,180,50);
			show[9].setForeground(Color.WHITE);
			show[9].setBackground(Color.CYAN);
			show[9].addActionListener(this);


		//Label fifty=new Label("      50-50");
			fifty[9]=new Label("      50-50");
			fifty[9].setBounds(800,50,200,50);
			fifty[9].setForeground(Color.GREEN);
			fifty[9].setFont(fontlabel);
			fifty[9].addMouseListener(this);
			p13.add(fifty[9]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[9].setForeground(Color.red);
			}

			// Label for question change option
			swap[9]=new Label("     Swap");
			swap[9].setBounds(1050,50,200,50);
			swap[9].setForeground(Color.GREEN);
			swap[9].setFont(fontlabel);
			swap[9].addMouseListener(this);
			p13.add(swap[9]);
			if(swapstop==1)// this condition is used to change the color of swap into red after using it
				{
				 	System.out.println("swapstop enter ");
				 	swap[9].setForeground(Color.RED);
				}

			//to show winning message
			mssg[9]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[9].setBounds(300,450,700,50);
			mssg[9].setFont(fontlabel);
			mssg[9].setForeground(Color.CYAN);
			
	
	}
	void Swap()
	{
		System.out.println("swap page enter");
		//System.out.println(".....hello kapil.... ");
		j=40;k=43;n=10;san=10;ban=10;back2que=11;

		Label que3=new Label("Q"+pointer+". when was the first corona case arrive in india ?"); 
		opt[40]=new Button("(A) 31 jan");
		opt[41]=new Button("(B) 1 feb");
		opt[42]=new Button("(C) 30 jan");
		opt[43]=new Button("(D) 21 jan");
		p5=new Panel();
		p5.setLayout(null);
		p5.setBounds(20,130,1320,700);
		p5.setBackground(Color.BLACK);
		f.add(p5);
		
		que3.setBounds(100,100,700,50);
		que3.setFont(font);
		que3.setForeground(Color.WHITE);
		opt[40].setBounds(100,200,300,50);
		opt[40].setBackground(Color.CYAN);
		p5.add(opt[40]);
		//System.out.println("value of opt[4]"+opt[40]);
		opt[40].addActionListener(this);
		opt[41].setBounds(500,200,300,50);
		opt[41].setBackground(Color.CYAN);
		p5.add(opt[41]);
		opt[41].addActionListener(this);
		opt[42].setBounds(100,300,300,50);
		opt[42].setBackground(Color.CYAN);
		p5.add(opt[42]);
		opt[42].addActionListener(this);
		opt[43].setBounds(500,300,300,50);
		opt[43].setBackground(Color.CYAN);
		p5.add(opt[43]);
		opt[43].addActionListener(this);
		p5.add(que3);

		//next button to go further

		next[10]=new Label("                 next");
		quit[10]=new Label("                 quit");
		next[10].setBounds(1130,300,180,50);
		next[10].addMouseListener(this);
		next[10].setBackground(Color.CYAN) ;
		next[10].setForeground(Color.WHITE);
		quit[10].setBounds(1130,400,180,50);
		quit[10].addMouseListener(this);
		quit[10].setBackground(Color.CYAN);
		quit[10].setForeground(Color.WHITE);
		p5.add(quit[10]);

		// show-button to show the correct answer
			show[10]=new Button("Show Ans");
			show[10].setBounds(1130,500,180,50);
			show[10].setForeground(Color.WHITE);
			show[10].setBackground(Color.CYAN);
			show[10].addMouseListener(this);


		//Label fifty=new Label("      50-50");
			fifty[10]=new Label("      50-50");
			fifty[10].setBounds(800,50,200,50);
			fifty[10].setForeground(Color.GREEN);
			fifty[10].setFont(fontlabel);
			fifty[10].addMouseListener(this);
			p5.add(fifty[10]);
			if(stop==1)// this condition is used to change the color of 50-50 into red after using it
			{
				fifty[10].setForeground(Color.red);
			}

			// Label for question change option
			swap[10]=new Label("     Swap");
			swap[10].setBounds(1050,50,200,50);
			swap[10].setFont(fontlabel);
			//swap[10].addMouseListener(this);
			p5.add(swap[10]);
			if(swapstop==1)
			{
				swap[10].setForeground(Color.RED);
			}
			else
			{
				swap[10].setForeground(Color.WHITE);
			}

			//to show winning message
			mssg[10]=new Label("Nice Playing "+name+" you have won "+amt+" Rupees");
			mssg[10].setBounds(300,450,700,50);
			mssg[10].setFont(fontlabel);
			mssg[10].setForeground(Color.CYAN);

	}

	public void lastPage()
	{
		lastpane=new Panel();
		lastpane.setLayout(null);
		lastpane.setBounds(20,130,1320,700);
		lastpane.setBackground(Color.BLACK);
		f.add(lastpane);
		
		greet.setBounds(350,100,600,100);
		greet.setFont(fontlabel);
		greet.setForeground(Color.WHITE);
		lastpane.add(greet);
		winamt.setBounds(370,250,600,100);
		winamt.setFont(fontlabel);
		winamt.setForeground(Color.WHITE);
		lastpane.add(winamt);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		System.out.println("value of o "+o);
		for(m=j;m<=k;m++)
		{
			System.out.println("value of m in loop "+m);
			if((m==2)||(m==4) || (m==42) || (m==10)||(m==12)||(m==19)||(m==21)||(m==25)||(m==30)||(m==32)||(m==38))
			{
				System.out.println("value of m in if condition "+m);
				System.out.println("value of option pressed= "+opt[m]);
				if(o==opt[m]) // this condition checks right answer or not
				{
					System.out.println("value of o in loop = "+o);
					opt[m].setBackground(Color.GREEN);
					if(n==0)
					{
						amount=1000;
					p3.add(next[n]);
					p3.add(mssg[n]);
					}
					if(n==1)
					{
						amount=2000;
					p4.add(next[n]);
					p4.add(mssg[n]);
					}
					if(n==2)
					{
						amount=5000;
					p6.add(next[n]);
					p6.add(mssg[n]);
					}
					if(n==3)
					{
						amount=10000;
					p7.add(next[n]);
					p7.add(mssg[n]);
					}
					if(n==4)
					{
						amount=50000;
					p8.add(next[n]);
					p8.add(mssg[n]);
					}
					if(n==5)
					{
						amount=100000;
					p9.add(next[n]);
					p9.add(mssg[n]);
					}
					if(n==6)
					{
						amount=1000000;
					p10.add(next[n]);
					p10.add(mssg[n]);
					}
					if(n==7)
					{
						amount=5000000;
					p11.add(next[n]);
					p11.add(mssg[n]);
					}
					if(n==8)
					{
						amount=10000000;
					p12.add(next[n]);
					p12.add(mssg[n]);
					}
					if(n==9)
					{
						amount=10000000;
						p13.add(next[n]);
						p13.add(mssg[n]);
					}
					if(n==10)
					{
						amount=amt;
					p5.add(next[n]);
					p5.add(mssg[n]);
					}
				}
			}
			else
			{
				if(o==opt[m]) 
				{
					opt[m].setBackground(Color.RED);
					if(n==0)
					{
						p3.add(show[n]);
					}
					if(n==1)
					{
						p4.add(show[n]);
					}
					if(n==2)
					{
						p6.add(show[n]);
					}
					if(n==3)
					{
						p7.add(show[n]);
					}
					if(n==4)
					{
						p8.add(show[n]);
					}
					if(n==5)
					{
						p9.add(show[n]);
					}
					if(n==6)
					{
						p10.add(show[n]);
					}
					if(n==7)
					{
						p11	.add(show[n]);
					}
					if(n==8)
					{
						p12.add(show[n]);
					}
					if(n==10)
					{
						p5.add(show[n]);
					}	
				}
			}
			if(o==show[n])// when a user press show button then answer will show through this logic
			{
				if((m==2)||(m==4) || (m==42) || (m==10)||(m==12)||(m==19)||(m==21)||(m==25)||(m==30)||(m==32)||(m==38))
				{
					opt[m].setBackground(Color.GREEN);
					show[n].setBackground(Color.RED);
				}
			}
			
		}
			
		
	}

	public void mouseEntered(MouseEvent e1)
	{
		if(e1.getSource()==nextpage)
		{
		nextpage.setBackground(Color.GREEN);
		nextpage.setBounds(1130,340,180,50);
		}
		for(int i=san;i<=ban;i++)
		{
			if(e1.getSource()==next[i])
			{
			next[i].setBackground(Color.GREEN);
			next[i].setBounds(1120,290,190,50);
			}
		}
	}
	public void mouseExited(MouseEvent e1)
	{
		if(e1.getSource()==nextpage)
		{
		nextpage.setBackground(Color.CYAN);
		nextpage.setBounds(1130,350,180,50);
		}
		for(int i=san;i<=ban;i++)
		{
			if(e1.getSource()==next[i])
			{
			next[i].setBackground(Color.CYAN);
			next[i].setBounds(1130,300,180,50);  
			}
		}
	}
	public void mouseReleased(MouseEvent e1)
	{

	}
	public void mousePressed(MouseEvent e1)
	{

	}
	public void mouseClicked(MouseEvent e1)
	{
		Object check=e1.getSource();
		if(check==nextpage)
		{
		f.remove(p2);
		this.Page1();
		}
		if(check==next[0])
		{
			f.remove(p3);
			this.Page2();
		}
		if(check==next[1])
		{
			f.remove(p4);
			this.Page3();
		}
		if(check==next[2])
		{
			f.remove(p6);
			this.Page4();
		}
		if(check==next[3])
		{
			f.remove(p7);
			this.Page5();
		}
		if(check==next[4])
		{
			f.remove(p8);
			this.Page6();
		}
		if(check==next[5])
		{
			f.remove(p9);
			this.Page7();
		}
		if(check==next[6])
		{
			f.remove(p10);
			this.Page8();
		}
		if(check==next[7])
		{
			f.remove(p11);
			this.Page9();
		}
		if(check==next[8])
		{
			f.remove(p12);
			this.Page10();
		}
		if(check==next[9])
		{
			f.remove(p13);
			greet=new Label("Congratulations you become a Crorepati");
			winamt=new Label("Your Winning Amount is 20000000");
			this.lastPage();
		}

		if(check==next[10])
		{	
			System.out.println("swap logic enter");
			j=0;k=0;
			//check=next[10];	   // whenever you click next button in swap page- 
			if(pointer==1)		   // then which page comes to you. this process is-
			{					   // decided by this if condition and pointer variable.
				f.remove(p5);
				this.Page2();
				System.out.println("swap logic for page 2");
			}
			else if(pointer==2)
			{
				f.remove(p5);
				this.Page3();
				System.out.println("swap logic for page 3");
 			}
			else if(pointer==3)
			{
				f.remove(p5);
				this.Page4();
				System.out.println("swap logic for page 4");
			}
			else if(pointer==4)
			{
				f.remove(p5);
				this.Page5();
				System.out.println("swap logic for page 5");
			}
			else if(pointer==5)
			{
				f.remove(p5);
				this.Page6();
			}
			else if(pointer==6)
			{
				f.remove(p5);
				this.Page7();
			}
			else if(pointer==7)
			{
				f.remove(p5);
				this.Page8();
			}
			else if(pointer==8)
			{
				f.remove(p5);
				this.Page9();
			}
			else if(pointer==9)
			{
				f.remove(p5);
			}
			else if(pointer==10)
			{
				f.remove(p5);
			}
		}

		//  50-50 option perform
		for(int z=san;z<=ban;z++)					//loop runs at once
		{
			if(check==fifty[z] && stop==0)
			{
				fifty[z].setForeground(Color.RED);
				if(n==0)							//if condition  checks Question no.
				{
					p3.remove(opt[0]);
					p3.remove(opt[1]);		//here stop is a static int variable
					stop=1;				 //which works to stop performance of 50-50 for futher use


				}
				if(n==1)
				{
					p4.remove(opt[5]);
					p4.remove(opt[6]);
					stop=1;
				}
				if(n==2)
				{
					p6.remove(opt[8]);
					p6.remove(opt[9]);
					stop=1;
				}
				if(n==3)
				{
					p7.remove(opt[14]);
					p7.remove(opt[15]);
					stop=1;
				}
				if(n==4)
				{
					p8.remove(opt[16]);
					p8.remove(opt[17]);
					stop=1;
				}
				if(n==5)
				{
					p9.remove(opt[22]);
					p9.remove(opt[23]);
					stop=1;
				}
				if(n==6)
				{
					p10.remove(opt[24]);
					p10.remove(opt[26]);
					stop=1;
				}
				if(n==7)
				{
					p11.remove(opt[28]);
					p11.remove(opt[31]);
					stop=1;
				}
				if(n==8)
				{
					p12.remove(opt[34]);
					p12.remove(opt[35]);
					stop=1;
				}
				if(n==9)
				{
					p13.remove(opt[36]);
					p13.remove(opt[39]);
					stop=1;
				}
				if(n==10)
				{
					p5.remove(opt[41]);
					p5.remove(opt[43]);
					stop=1;
				}	
			}

			//swap question part

			if(check==swap[z] && swapstop==0)				//    swaping condition
			{
				if(n==0)
				{
					f.remove(p3);
				}
					
				
				if(n==1)
				{
					f.remove(p4);
				}
				if(n==2)
				{
					f.remove(p6);
				}
				if(n==3)
				{
					f.remove(p7);
				}
				if(n==4)
				{
					f.remove(p8);
				}
				if(n==5)
				{
					f.remove(p9);
				}
				if(n==6)
				{
					f.remove(p10);
				}
				if(n==7)
				{
					f.remove(p11);
				}
				if(n==8)
				{
					f.remove(p12);
				}
				if(n==9)
				{
					f.remove(p13);
				}
					swapstop=1;
					this.Swap();
					swap[z].setForeground(Color.RED);
								
			}

			// quit option clicked
		if(check==quit[z])
		{
			if(pointer==1)
			{ 
				greet=new Label("Thanks for playing,But you lost the game");
				winamt=new Label("         Your winning Amt is 0");
			}
			else
			{
				greet=new Label("Thanks for playing,you played very well");
				winamt=new Label("         Your winning Amt is "+value);
			}
			
			//removing previous panel
				if(pointer==1)
				{
					f.remove(p3);
				}
					
				
				if(pointer==2)
				{
					f.remove(p4);
				}
				if(pointer==3)
				{
					f.remove(p6); 
				}
				if(pointer==4)
				{
					f.remove(p7);
				}
				if(pointer==5)
				{
					f.remove(p8);
				}
				if(pointer==6)
				{
					f.remove(p9);
				}
				if(pointer==7)
				{
					f.remove(p10);
				}
				if(pointer==8)
				{
					f.remove(p11);
				}
				if(pointer==9)
				{
					f.remove(p12);
				}
				if(pointer==10)
				{
					f.remove(p13);
				}
				if(pointer==11)
				{
					f.remove(p5);
				}
			this.lastPage();
		}
			 
		}

		
		

	}
}
class RunKbc
{
	public static void main(String a[])
	{
		Kbc ka=new Kbc();  
		ka.infopage();
	}
}




