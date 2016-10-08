import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.CardLayout;

class Participants {

	private String participantorg = null;
	private String participantname = null;
	private String participantaddress = null;
	private String participantpnumber = null;
	private String participantemail = null;

	public String temp = null;

	public String getParticipantorg() {
		temp = participantorg;
		return temp;
	}

	public void setParticipantorg(String participantorg) {
		this.participantorg = participantorg;
	}

	public String getParticipantname() {
		temp = participantname;
		return temp;
	}

	public void setParticipantname(String participantname) {
		this.participantname = participantname;
	}

	public String getParticipantaddress() {
		temp = participantaddress;
		return temp;
	}

	public void setParticipantaddress(String participantaddress) {
		this.participantaddress = participantaddress;
	}

	public String getParticipantemail() {
		return participantemail;
	}

	public void setParticipantemail(String participantemail) {
		this.participantemail = participantemail;
	}

	public String getParticipantpnumber() {
		temp = participantpnumber;
		return temp;
	}

	public void setParticipantpnumber(String participantpnumber) {
		this.participantpnumber = participantpnumber;
	}
}

class Faculty {

	private String department = null;
	private String facultyname = null;
	private String facultyaddress = null;
	private String facultypnumber = null;
	private String facultyemail = null;

	public String temp1 = null;

	public String getDepartment() {
		temp1 = department;
		return temp1;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFacultyname() {
		temp1 = facultyname;
		return temp1;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public String getFacultyaddress() {
		temp1 = facultyaddress;
		return temp1;
	}

	public void setFacultyaddress(String facultyaddress) {
		this.facultyaddress = facultyaddress;
	}

	public String getFacultypnumber() {
		temp1 = facultypnumber;
		return temp1;
	}

	public void setFacultypnumber(String facultypnumber) {
		this.facultypnumber = facultypnumber;
	}

	public String getFacultyemail() {
		temp1 = facultyemail;
		return temp1;
	}

	public void setFacultyemail(String facultyemail) {
		this.facultyemail = facultyemail;
	}
}

// Course class

class Course {
	private String coursename = null;
	private String coursefee = null;
	private Date startdate = null;
	private int duration;

	public ArrayList<Participants> pants = new ArrayList<Participants>(5);
	Faculty coursecoordinator = new Faculty();
	ArrayList<Faculty> fulty = new ArrayList<Faculty>(5);

	private int pcount = 0;
	private int fcount = 0;
	public String temp2 = null;

	public int q;

	public String getCoursename() {
		temp2 = coursename;
		return temp2;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursefee() {
		temp2 = coursefee;
		return temp2;
	}

	public void setCoursefee(String coursefee) {
		this.coursefee = coursefee;
	}

	public Date getStartdate() {
		Date temp3 = startdate;
		return temp3;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public int getDuration() {
		q = duration;
		return q;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPcount() {
		q = pcount;
		return q;
	}

	public void setPcount(int pcount) {
		this.pcount = pcount;
	}

	public int getFcount() {
		q = fcount;
		return q;
	}

	public void setFcount(int fcount) {
		this.fcount = fcount;
	}

}



class CourseListFinal  {

    private final JFrame frame=new JFrame();
    
	private static final boolean EOF = false;
	private final JPanel Data = new JPanel();
	private final JPanel Parts = new JPanel();

	public static void main(String[] args) throws IOException,ParseException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseListFinal window = new CourseListFinal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	String output = null;
	String qwe = null;
	String rty = null;
	String uio = null;
	String asd = null;
	String bnm = null;
	String cvb = null;

	SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	Date somedate = null;
	Date nowdate = new Date();
	String date = null;
	String tempo = null;
	int i = 1, l, m = 0, rj, switchme, q1, w, h = 0, new_ten = 0, j = 0, k = 0, checkp, p = 0;
	int q;
	String jkl;
	ArrayList<Course> coursea = new ArrayList<Course>();
	String rs = null;
	String rs1 = null;
	String xoxo = null;
	String fn = null;
	long x;
	long SECOND = 1000;
	long MINUTE = 60 * SECOND;
	long HOUR = 60 * MINUTE;
	long DAY = 24 * HOUR;

	File file = new File("input1.txt");
	String line = null;

	
	Scanner scanme1;
	ActionListener readmefilelistener = new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			Data.setVisible(false);
			Parts.setVisible(false);
			try {
				FileReader freader = new FileReader(file.getAbsoluteFile());
			
				Scanner scanme1 = new Scanner(freader);

				int b = Integer.parseInt(scanme1.nextLine());
				while (b > 0) {
					Course check = new Course();

					check.setCoursename(scanme1.nextLine());

					check.setCoursefee(scanme1.nextLine());

					date = scanme1.nextLine();
					somedate = format.parse(date);
					check.setStartdate(somedate);
					p = Integer.parseInt(scanme1.nextLine());
					
					check.setDuration(p);

					q = Integer.parseInt(scanme1.nextLine());
					q1 = Integer.parseInt(scanme1.nextLine());

					while (scanme1.hasNext() != EOF) {
						check.coursecoordinator.setDepartment(scanme1.nextLine());

						check.coursecoordinator.setFacultyname(scanme1.nextLine());

						check.coursecoordinator.setFacultyaddress(scanme1.nextLine());

						check.coursecoordinator.setFacultypnumber(scanme1.nextLine());

						check.coursecoordinator.setFacultyemail(scanme1.nextLine());
					}

					for (w = 0; w < q; w++) {

						check.fulty.get(w).setDepartment(scanme1.nextLine());

						check.fulty.get(w).setFacultyname(scanme1.nextLine());

						check.fulty.get(w).setFacultyaddress(scanme1.nextLine());

						check.fulty.get(w).setFacultypnumber(scanme1.nextLine());

						check.fulty.get(w).setFacultyemail(scanme1.nextLine());

					}

					for (w = 0; w < q1; w++) {

						check.pants.get(w).setParticipantorg(scanme1.nextLine());

						check.pants.get(w).setParticipantname(scanme1.nextLine());

						check.pants.get(w).setParticipantaddress(scanme1.nextLine());

						check.pants.get(w).setParticipantpnumber(scanme1.nextLine());

						check.pants.get(w).setParticipantemail(scanme1.nextLine());
					}

					coursea.add(check);
					b--;
				}
				scanme1.close();
				JOptionPane.showMessageDialog(frame, "Data is read");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(frame, "File not found ");
			}

			frame.setVisible(true);
			Data.setVisible(false);
			Parts.setVisible(true);
		}

	};
	

	/**
	 * Create the applet.
	 */
	public CourseListFinal() {
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
	    
		
		frame.getContentPane().add(Data, "name_175815259230734");
		Data.setLayout(null);

		JButton btnNewButton = new JButton("Old Data");
		btnNewButton.addActionListener(readmefilelistener);
		btnNewButton.setBounds(166, 71, 97, 25);
		Data.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				Data.setVisible(false);
				Parts.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(166, 152, 97, 25);
		Data.add(btnNewButton_1);

		
		frame.getContentPane().add(Parts, "name_175815273861270");
		Parts.setLayout(null);

		JButton btnCreateCourse = new JButton("Create Course");
		btnCreateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);

				Course check = new Course();

				check.setCoursename(JOptionPane.showInputDialog("Enter name"));

				check.setCoursefee(JOptionPane.showInputDialog("Enter fee"));

				date=JOptionPane.showInputDialog("Enter date");
				try {
					somedate = format.parse(date);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				check.setStartdate(somedate);
				jkl=JOptionPane.showInputDialog("Duration");
				p = Integer.parseInt(jkl);
			

				check.setDuration(p);
				if (check.getDuration() > 14) {
					JOptionPane.showMessageDialog(frame, "Duration is more thna 14 days");
					Runtime.getRuntime().exit(0);
				}
				coursea.add(check);

				Data.setVisible(false);
				Parts.setVisible(true);
				frame.setVisible(true);
			}

			private void date(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void jkl(String showInputDialog) {
				// TODO Auto-generated method stub

			}

		});
		btnCreateCourse.setBounds(144, 0, 170, 25);
		Parts.add(btnCreateCourse);

		JButton btnNewButton_2 = new JButton("Create Participant");
		btnNewButton_2.setBounds(144, 38, 170, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				rs1=(JOptionPane.showInputDialog("Give the course name in which the participant has to be added"));
				for (j = 0; j < coursea.size(); j++) {
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() < 5)) {
						Participants fifa1 = new Participants();
						coursea.get(j).pants.add(fifa1);

						coursea.get(j).pants.get(coursea.get(j).getPcount())
								.setParticipantorg(JOptionPane.showInputDialog("Participant Organisation"));

						coursea.get(j).pants.get(coursea.get(j).getPcount())
								.setParticipantname(JOptionPane.showInputDialog("Participant Name"));

						coursea.get(j).pants.get(coursea.get(j).getPcount())
								.setParticipantaddress(JOptionPane.showInputDialog("Participant Address"));

						coursea.get(j).pants.get(coursea.get(j).getPcount())
								.setParticipantpnumber(JOptionPane.showInputDialog("Participant number"));

						coursea.get(j).pants.get(coursea.get(j).getPcount())
								.setParticipantemail(JOptionPane.showInputDialog("Participant email"));
						coursea.get(j).setPcount(coursea.get(j).getPcount() + 1);
						break;
					}
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() == 5)) {
						JOptionPane.showMessageDialog(frame, "No slots left.Participants are filled!!!");
						break;
					}
				}

				Data.setVisible(false);
				Parts.setVisible(true);
				frame.setVisible(true);
			}

			private void rs1(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		Parts.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Create Faculty");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				rs=(JOptionPane.showInputDialog("Give the course name in which faculty has to be added"));
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {

						fn(JOptionPane.showInputDialog(
								"Enter a choice 1:to give details of course coord 2: to give instructor details"));
						if ((fn .compareTo("1")==0) && (coursea.get(j).coursecoordinator.getFacultyname() == null)) {

							coursea.get(j).coursecoordinator.setDepartment(JOptionPane.showInputDialog("Department"));

							coursea.get(j).coursecoordinator.setFacultyname(JOptionPane.showInputDialog("Name"));

							coursea.get(j).coursecoordinator.setFacultyaddress(JOptionPane.showInputDialog("Address"));

							coursea.get(j).coursecoordinator.setFacultypnumber(JOptionPane.showInputDialog("Number"));

							coursea.get(j).coursecoordinator.setFacultyemail(JOptionPane.showInputDialog("Email"));

						}
						if ((fn .compareTo("2")==0) && (coursea.get(j).getFcount() < 5)) {

							Faculty fifa = new Faculty();
							coursea.get(j).fulty.add(fifa);
							coursea.get(j).fulty.get(coursea.get(j).getFcount())
									.setDepartment(JOptionPane.showInputDialog("Department"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount())
									.setFacultyname(JOptionPane.showInputDialog("Name"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount())
									.setFacultyaddress(JOptionPane.showInputDialog("Address"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount())
									.setFacultypnumber(JOptionPane.showInputDialog("Mobile"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount())
									.setFacultyemail(JOptionPane.showInputDialog("Email"));
							coursea.get(j).setFcount(coursea.get(j).getFcount() + 1);
							break;
						}
					}
				}

				Data.setVisible(false);
				Parts.setVisible(true);
				frame.setVisible(true);
			}

			private void fn(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void rs(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton_3.setBounds(144, 76, 170, 25);
		Parts.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Delete/Alter course");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);

				fn=(JOptionPane.showInputDialog("Enter a choice 1:Delete the course 2:Alter the course"));

				if (fn .compareTo("1")==0) {

					rs=(JOptionPane.showInputDialog("Enter the course name to be deleted"));

					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
							coursea.remove(j);
							JOptionPane.showMessageDialog(frame, "Successfully deleted");
							break;
						}
					}

				} else if (fn .compareTo("2")==0) {

					rs=(JOptionPane.showInputDialog("Enter the course name to be altered"));
					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs) == 0) {

							coursea.get(j).setCoursename(JOptionPane.showInputDialog("Course name"));

							coursea.get(j).setCoursefee(JOptionPane.showInputDialog("Course fee"));

							date(JOptionPane.showInputDialog("Date in dd/mm/yyyy format"));
							try {
								somedate = format.parse(date);
							} catch (ParseException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							coursea.get(j).setStartdate(somedate);
							jkl=JOptionPane.showInputDialog("Duration");
							p = Integer.parseInt(jkl);
							

							coursea.get(j).setDuration(p);

							if (coursea.get(j).getDuration() > 14) {
								JOptionPane.showMessageDialog(frame, "duration is more than 14 days");
								Runtime.getRuntime().exit(0);
							}
							JOptionPane.showMessageDialog(frame, "Successfully altered");
							break;
						}
					}
				} else
					JOptionPane.showMessageDialog(frame, "wrong option entered");

				frame.setVisible(true);
				Data.setVisible(false);
				Parts.setVisible(true);
			}

			private void jkl(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void date(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void rs(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void fn(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton_4.setBounds(144, 114, 170, 25);
		Parts.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Delete/Alter participant");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);

				rs=JOptionPane.showInputDialog("Give the course name in which changes have to be made  ");
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						jkl=JOptionPane.showInputDialog("1:Delete 2:Alter participant details");

						if (jkl .compareTo("1")==0) {
							rs=JOptionPane.showInputDialog("Name of the participant to be  deleted");
							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {
									coursea.get(j).pants.remove(coursea.get(j).pants.get(k));
									coursea.get(j).setPcount(coursea.get(j).getPcount() - 1);
								}
							}

						} else if (jkl .compareTo("2")==0) {
							rs1=(JOptionPane
									.showInputDialog("Give the participant name in which changes have to be made  "));

							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {

									coursea.get(j).pants.get(k)
											.setParticipantorg(JOptionPane.showInputDialog("Organisation"));

									coursea.get(j).pants.get(k).setParticipantname(JOptionPane.showInputDialog("Name"));

									coursea.get(j).pants.get(k)
											.setParticipantpnumber(JOptionPane.showInputDialog("Mobile"));

									coursea.get(j).pants.get(k)
											.setParticipantemail(JOptionPane.showInputDialog("Email"));

									coursea.get(j).pants.get(k)
											.setParticipantaddress(JOptionPane.showInputDialog("Address"));
								}
							}
						} else
							break;
					}
				}

				frame.setVisible(true);
				Data.setVisible(false);
				Parts.setVisible(true);
			}

			private void rs1(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void jkl(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void rs(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton_5.setBounds(144, 152, 170, 25);
		Parts.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Delete/Alter faculty");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Parts.setVisible(false);
				Data.setVisible(false);

				rs=(JOptionPane.showInputDialog("Give the course name in which faculty has to be deleted or altered"));
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {

						jkl=(JOptionPane.showInputDialog("1:Delete course coord" + "2:Alter course coord"
								+ "3:delete instructor" + "4:Alter instructor"));
						if (jkl .compareTo("1")==0) {
							coursea.get(j).coursecoordinator = null;

							JOptionPane.showMessageDialog(frame, "successfully deleted");
							break;
						} else if (jkl .compareTo("2")==0) {

							coursea.get(j).coursecoordinator.setDepartment(JOptionPane.showInputDialog("Department"));

							coursea.get(j).coursecoordinator.setFacultyname(JOptionPane.showInputDialog("Name"));

							coursea.get(j).coursecoordinator.setFacultyaddress(JOptionPane.showInputDialog("Address"));

							coursea.get(j).coursecoordinator.setFacultypnumber(JOptionPane.showInputDialog("mobile"));

							coursea.get(j).coursecoordinator.setFacultyemail(JOptionPane.showInputDialog("email"));
							break;
						} else if (jkl .compareTo("3")==0) {

							rs1=(JOptionPane.showInputDialog("Give instructor name to be deleted"));

							for (k = 0; (k < coursea.get(j).fulty.size()); k++) {
								if (coursea.get(j).fulty.get(k).getFacultyname().compareTo(rs1) == 0) {
									coursea.get(j).fulty.remove(coursea.get(j).fulty.get(k));
									coursea.get(j).setFcount(coursea.get(j).getFcount() - 1);
									JOptionPane.showMessageDialog(frame, "successfully deleted");
									break;
								}
							}

						} else if (jkl .compareTo("4")==0) {
							rs1=(JOptionPane.showInputDialog("Give instructor name to be altered"));
							for (k = 0; k < coursea.get(j).fulty.size(); k++) {
								if (coursea.get(j).fulty.get(k).getFacultyname().compareTo(rs1) == 0) {
									System.out.println("Instructor department:");
									coursea.get(j).fulty.get(k)
											.setDepartment(JOptionPane.showInputDialog("Department"));

									System.out.println("Instructor name:");
									coursea.get(j).fulty.get(k).setFacultyname(JOptionPane.showInputDialog("Name"));

									System.out.println("Instructor mobile:");
									coursea.get(j).fulty.get(k)
											.setFacultypnumber(JOptionPane.showInputDialog("Mobile"));

									System.out.println("Instructor email:");
									coursea.get(j).fulty.get(k).setFacultyemail(JOptionPane.showInputDialog("email"));

									System.out.println("Instructor address:");
									coursea.get(j).fulty.get(k)
											.setFacultyaddress(JOptionPane.showInputDialog("Address"));
									break;
								}
							}
						} else
							break;
					}
				}

				frame.setVisible(true);
				Parts.setVisible(true);
				Data.setVisible(false);
			}

			private void rs1(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void jkl(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void rs(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton_6.setBounds(144, 190, 170, 25);
		Parts.add(btnNewButton_6);

		
		JButton btnNewButton_7 = new JButton("Display");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Parts.setVisible(false);
				Data.setVisible(false);

				rs=(JOptionPane.showInputDialog(
						"1:Display courses 2:Display Faculty 3:Dispaly participant 4:Display all for 5 years"));
				if (rs.compareTo("1")==0) {
					for (j = 0; j < coursea.size(); j++) {
						qwe = ("Course" + (j + 1) + ":");
						rty = ("Coursename:" + coursea.get(j).getCoursename());
						uio = ("Coursefee :" + coursea.get(j).getCoursefee());
						asd = ("Startdate :" + coursea.get(j).getStartdate());
						bnm = ("Duration  :" + coursea.get(j).getDuration());
						output = output + "\n" + qwe + "\n" + rty + "\n" + uio + "\n" + asd + "\n" + bnm + "\n";
					}
					JOptionPane.showMessageDialog(frame, output);
				} else if (rs.compareTo("2")==0) {
					output = null;
					rs1=(JOptionPane
							.showInputDialog("Give the name of the coursename in which faculty has to be displayed "));
					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs1) == 0) {
							if (coursea.get(j).coursecoordinator.getFacultyname() != null) {
								qwe = ("Department:" + coursea.get(j).coursecoordinator.getDepartment());
								rty = ("Name      :" + coursea.get(j).coursecoordinator.getFacultyname());
								uio = ("Address   :" + coursea.get(j).coursecoordinator.getFacultyaddress());
								asd = ("Mobile    :" + coursea.get(j).coursecoordinator.getFacultypnumber());
								bnm = ("Email     :" + coursea.get(j).coursecoordinator.getFacultyemail());
								output = output + "\n" + qwe + "\n" + rty + "\n" + uio + "\n" + asd + "\n" + bnm + "\n";
							}

							for (k = 0; k < coursea.get(j).fulty.size(); k++) {

								qwe = ("Department:" + coursea.get(j).fulty.get(k).getDepartment());
								rty = ("Name      :" + coursea.get(j).fulty.get(k).getFacultyname());
								uio = ("Address   :" + coursea.get(j).fulty.get(k).getFacultyaddress());
								asd = ("Mobile    :" + coursea.get(j).fulty.get(k).getFacultypnumber());
								bnm = ("Email     :" + coursea.get(j).fulty.get(k).getFacultyemail());
								output = output + "\n" + "Faculty"
										+ coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1 + ":" + qwe
										+ "\n" + rty + "\n" + uio + "\n" + asd + "\n" + bnm + "\n";
							}
							JOptionPane.showMessageDialog(frame, output);
						}
					}
				} else if (rs .compareTo("3")==0) {
					output = null;
					rs1=(JOptionPane.showInputDialog(
							"Give the name of the coursename in which participant has to be displayed "));
					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs1) == 0) {
							for (k = 0; k < coursea.get(j).pants.size(); k++) {

								qwe = ("Organisation:" + coursea.get(j).pants.get(k).getParticipantorg());
								rty = ("Name        :" + coursea.get(j).pants.get(k).getParticipantname());
								uio = ("Address     :" + coursea.get(j).pants.get(k).getParticipantaddress());
								asd = ("Mobile      :" + coursea.get(j).pants.get(k).getParticipantpnumber());
								bnm = ("Email       :" + coursea.get(j).pants.get(k).getParticipantemail());
								output = output + "\n"
										+ ("Participant" + coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1
												+ ":")
										+ "\n" + qwe + "\n" + rty + "\n" + uio + "\n" + asd + "\n" + bnm + "\n";
							}
							JOptionPane.showMessageDialog(frame, output);

						}
					}

				} else if (rs .compareTo("4")==0) {
					new_ten = 0;
					output = null;
					for (j = 0; j < coursea.size(); j++) {
						somedate = coursea.get(j).getStartdate();
						x = nowdate.getTime() - somedate.getTime();
						x = x / DAY;
						if (x >= 0 && x < 366) {
							if (new_ten <= 10) {

								uio = Integer.toString(coursea.indexOf(coursea.get(j)) + 1);
								qwe = (coursea.get(j).getCoursename());
								rty = (coursea.get(j).getCoursefee());
								tempo = format.format(coursea.get(j).getStartdate());
								asd = (tempo);
								bnm = Integer.toString(coursea.get(j).getDuration());
								output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;

								for (k = 0; k < coursea.get(j).pants.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
									qwe = (coursea.get(j).pants.get(k).getParticipantorg());
									rty = (coursea.get(j).pants.get(k).getParticipantname());
									asd = (coursea.get(j).pants.get(k).getParticipantaddress());
									bnm = (coursea.get(j).pants.get(k).getParticipantpnumber());
									cvb = (coursea.get(j).pants.get(k).getParticipantemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}

								if (coursea.get(j).coursecoordinator.getDepartment() != null) {
									uio = (coursea.get(j).coursecoordinator.getDepartment());
									qwe = (coursea.get(j).coursecoordinator.getFacultyname());
									rty = (coursea.get(j).coursecoordinator.getFacultyaddress());
									asd = (coursea.get(j).coursecoordinator.getFacultypnumber());
									bnm = (coursea.get(j).coursecoordinator.getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;
								}

								for (k = 0; k < coursea.get(j).fulty.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
									qwe = (coursea.get(j).fulty.get(k).getDepartment());
									rty = (coursea.get(j).fulty.get(k).getFacultyname());
									asd = (coursea.get(j).fulty.get(k).getFacultyaddress());
									bnm = (coursea.get(j).fulty.get(k).getFacultypnumber());
									cvb = (coursea.get(j).fulty.get(k).getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}
								new_ten++;

							}

						}
						new_ten = 0;
						if (x >= 366 && x < 2 * 366) {
							if (new_ten <= 10) {

								uio = Integer.toString(coursea.indexOf(coursea.get(j)) + 1);
								qwe = (coursea.get(j).getCoursename());
								rty = (coursea.get(j).getCoursefee());
								tempo = format.format(coursea.get(j).getStartdate());
								asd = (tempo);
								bnm = Integer.toString(coursea.get(j).getDuration());
								output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;

								for (k = 0; k < coursea.get(j).pants.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
									qwe = (coursea.get(j).pants.get(k).getParticipantorg());
									rty = (coursea.get(j).pants.get(k).getParticipantname());
									asd = (coursea.get(j).pants.get(k).getParticipantaddress());
									bnm = (coursea.get(j).pants.get(k).getParticipantpnumber());
									cvb = (coursea.get(j).pants.get(k).getParticipantemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}

								if (coursea.get(j).coursecoordinator.getDepartment() != null) {
									uio = (coursea.get(j).coursecoordinator.getDepartment());
									qwe = (coursea.get(j).coursecoordinator.getFacultyname());
									rty = (coursea.get(j).coursecoordinator.getFacultyaddress());
									asd = (coursea.get(j).coursecoordinator.getFacultypnumber());
									bnm = (coursea.get(j).coursecoordinator.getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;
								}

								for (k = 0; k < coursea.get(j).fulty.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
									qwe = (coursea.get(j).fulty.get(k).getDepartment());
									rty = (coursea.get(j).fulty.get(k).getFacultyname());
									asd = (coursea.get(j).fulty.get(k).getFacultyaddress());
									bnm = (coursea.get(j).fulty.get(k).getFacultypnumber());
									cvb = (coursea.get(j).fulty.get(k).getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}
								new_ten++;

							}

						}
						new_ten = 0;
						if (x >= 2 * 366 && x < 3 * 366) {
							if (new_ten <= 10) {

								uio = Integer.toString(coursea.indexOf(coursea.get(j)) + 1);
								qwe = (coursea.get(j).getCoursename());
								rty = (coursea.get(j).getCoursefee());
								tempo = format.format(coursea.get(j).getStartdate());
								asd = (tempo);
								bnm = Integer.toString(coursea.get(j).getDuration());
								output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;

								for (k = 0; k < coursea.get(j).pants.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
									qwe = (coursea.get(j).pants.get(k).getParticipantorg());
									rty = (coursea.get(j).pants.get(k).getParticipantname());
									asd = (coursea.get(j).pants.get(k).getParticipantaddress());
									bnm = (coursea.get(j).pants.get(k).getParticipantpnumber());
									cvb = (coursea.get(j).pants.get(k).getParticipantemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}

								if (coursea.get(j).coursecoordinator.getDepartment() != null) {
									uio = (coursea.get(j).coursecoordinator.getDepartment());
									qwe = (coursea.get(j).coursecoordinator.getFacultyname());
									rty = (coursea.get(j).coursecoordinator.getFacultyaddress());
									asd = (coursea.get(j).coursecoordinator.getFacultypnumber());
									bnm = (coursea.get(j).coursecoordinator.getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;
								}

								for (k = 0; k < coursea.get(j).fulty.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
									qwe = (coursea.get(j).fulty.get(k).getDepartment());
									rty = (coursea.get(j).fulty.get(k).getFacultyname());
									asd = (coursea.get(j).fulty.get(k).getFacultyaddress());
									bnm = (coursea.get(j).fulty.get(k).getFacultypnumber());
									cvb = (coursea.get(j).fulty.get(k).getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}
								new_ten++;

							}

						}
						new_ten = 0;
						if (x >= 3 * 366 && x < 4 * 366) {
							if (new_ten <= 10) {

								uio = Integer.toString(coursea.indexOf(coursea.get(j)) + 1);
								qwe = (coursea.get(j).getCoursename());
								rty = (coursea.get(j).getCoursefee());
								tempo = format.format(coursea.get(j).getStartdate());
								asd = (tempo);
								bnm = Integer.toString(coursea.get(j).getDuration());
								output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;

								for (k = 0; k < coursea.get(j).pants.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
									qwe = (coursea.get(j).pants.get(k).getParticipantorg());
									rty = (coursea.get(j).pants.get(k).getParticipantname());
									asd = (coursea.get(j).pants.get(k).getParticipantaddress());
									bnm = (coursea.get(j).pants.get(k).getParticipantpnumber());
									cvb = (coursea.get(j).pants.get(k).getParticipantemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}

								if (coursea.get(j).coursecoordinator.getDepartment() != null) {
									uio = (coursea.get(j).coursecoordinator.getDepartment());
									qwe = (coursea.get(j).coursecoordinator.getFacultyname());
									rty = (coursea.get(j).coursecoordinator.getFacultyaddress());
									asd = (coursea.get(j).coursecoordinator.getFacultypnumber());
									bnm = (coursea.get(j).coursecoordinator.getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;
								}

								for (k = 0; k < coursea.get(j).fulty.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
									qwe = (coursea.get(j).fulty.get(k).getDepartment());
									rty = (coursea.get(j).fulty.get(k).getFacultyname());
									asd = (coursea.get(j).fulty.get(k).getFacultyaddress());
									bnm = (coursea.get(j).fulty.get(k).getFacultypnumber());
									cvb = (coursea.get(j).fulty.get(k).getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}
								new_ten++;

							}

						}
						new_ten = 0;
						if (x >= 4 * 366 && x < 5 * 366) {
							if (new_ten <= 10) {

								uio = Integer.toString(coursea.indexOf(coursea.get(j)) + 1);
								qwe = (coursea.get(j).getCoursename());
								rty = (coursea.get(j).getCoursefee());
								tempo = format.format(coursea.get(j).getStartdate());
								asd = (tempo);
								bnm = Integer.toString(coursea.get(j).getDuration());
								output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;

								for (k = 0; k < coursea.get(j).pants.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
									qwe = (coursea.get(j).pants.get(k).getParticipantorg());
									rty = (coursea.get(j).pants.get(k).getParticipantname());
									asd = (coursea.get(j).pants.get(k).getParticipantaddress());
									bnm = (coursea.get(j).pants.get(k).getParticipantpnumber());
									cvb = (coursea.get(j).pants.get(k).getParticipantemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}

								if (coursea.get(j).coursecoordinator.getDepartment() != null) {
									uio = (coursea.get(j).coursecoordinator.getDepartment());
									qwe = (coursea.get(j).coursecoordinator.getFacultyname());
									rty = (coursea.get(j).coursecoordinator.getFacultyaddress());
									asd = (coursea.get(j).coursecoordinator.getFacultypnumber());
									bnm = (coursea.get(j).coursecoordinator.getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm;
								}

								for (k = 0; k < coursea.get(j).fulty.size(); k++) {
									uio = Integer
											.toString(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
									qwe = (coursea.get(j).fulty.get(k).getDepartment());
									rty = (coursea.get(j).fulty.get(k).getFacultyname());
									asd = (coursea.get(j).fulty.get(k).getFacultyaddress());
									bnm = (coursea.get(j).fulty.get(k).getFacultypnumber());
									cvb = (coursea.get(j).fulty.get(k).getFacultyemail());
									output = output + "\n" + uio + "\n" + qwe + "\n" + rty + "\n" + asd + "\n" + bnm
											+ "\n" + cvb;
								}
								new_ten++;

							}

						}

					}

				} else {
					JOptionPane.showMessageDialog(frame, "Entered Wrong Option");
				}
				
				frame.setVisible(true);
				Parts.setVisible(true);
				Data.setVisible(false);
			
            }

			private void rs1(String showInputDialog) {
				// TODO Auto-generated method stub

			}

			private void rs(String showInputDialog) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton_7.setBounds(144, 230, 170, 25);
		Parts.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Exit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				Parts.setVisible(false);
				Data.setVisible(false);

				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException pe) {
						// TODO Auto-generated catch block
						pe.printStackTrace();
					}
				}
				FileWriter fwriter = null;
				try {
					fwriter = new FileWriter(file.getAbsoluteFile());
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					BufferedWriter bwriter = new BufferedWriter(fwriter);
					bwriter.write(Integer.toString(coursea.size()));
					bwriter.newLine();
					for (i = 0; i < coursea.size(); i++) {

						bwriter.write(coursea.get(i).getCoursename());
						bwriter.newLine();
						bwriter.write(coursea.get(i).getCoursefee());
						bwriter.newLine();
						xoxo = format.format(coursea.get(i).getStartdate());
						bwriter.write(xoxo);
						bwriter.newLine();
						bwriter.write(Integer.toString(coursea.get(i).getDuration()));
						bwriter.newLine();

						bwriter.write(Integer.toString(coursea.get(i).getFcount()));
						bwriter.newLine();
						bwriter.write(Integer.toString(coursea.get(i).getPcount()));
						bwriter.newLine();

						if (coursea.get(i).coursecoordinator.getFacultyname() != null) {

							bwriter.write(coursea.get(i).coursecoordinator.getDepartment());
							bwriter.newLine();
							bwriter.write(coursea.get(i).coursecoordinator.getFacultyname());
							bwriter.newLine();
							bwriter.write(coursea.get(i).coursecoordinator.getFacultyaddress());
							bwriter.newLine();
							bwriter.write(coursea.get(i).coursecoordinator.getFacultypnumber());
							bwriter.newLine();
							bwriter.write(coursea.get(i).coursecoordinator.getFacultyemail());
							bwriter.newLine();
						}

						for (k = 0; k < coursea.get(i).getFcount(); k++) {

							bwriter.write(coursea.get(i).fulty.get(k).getDepartment());
							bwriter.newLine();
							bwriter.write(coursea.get(i).fulty.get(k).getFacultyname());
							bwriter.newLine();
							bwriter.write(coursea.get(i).fulty.get(k).getFacultyaddress());
							bwriter.newLine();
							bwriter.write(coursea.get(i).fulty.get(k).getFacultypnumber());
							bwriter.newLine();
							bwriter.write(coursea.get(i).fulty.get(k).getFacultyemail());
							bwriter.newLine();

						}

						for (k = 0; k < coursea.get(i).getPcount(); k++) {

							bwriter.write(coursea.get(i).pants.get(k).getParticipantorg());
							bwriter.newLine();
							bwriter.write(coursea.get(i).pants.get(k).getParticipantname());
							bwriter.newLine();
							bwriter.write(coursea.get(i).pants.get(k).getParticipantaddress());
							bwriter.newLine();
							bwriter.write(coursea.get(i).pants.get(k).getParticipantemail());
							bwriter.newLine();
							bwriter.write(coursea.get(i).pants.get(k).getParticipantpnumber());
							bwriter.newLine();
						}

						bwriter.close();
						fwriter.close();
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_8.setBounds(144, 268, 170, 25);
		Parts.add(btnNewButton_8);

	}

}