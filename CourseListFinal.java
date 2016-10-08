
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.swing.JPanel;

import sssfile.MyException;

import javax.swing.JApplet;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

public class CourseListFinal extends JApplet {

	private static final boolean EOF = false;
	private final JPanel Data = new JPanel();
	private final JPanel Parts = new JPanel();

	class MyException extends Exception {
		private int ex;

		MyException(int v) {
			setEx(v);
		}

		public String toString() {
			System.out.println("duration is more than 14 days");
			Runtime.getRuntime().exit(0);
			return ("null");

		}

		public int getEx() {
			return ex;
		}

		public void setEx(int ex) {
			this.ex = ex;
		}
	}

	private boolean sum(int v) throws MyException {
		if (v >= 15)
			return true;
		return false;
	}

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
	ActionListener readmefilelistener=new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){setVisible(false);Data.setVisible(false);Parts.setVisible(false);try{FileReader freader=new FileReader(file.getAbsoluteFile());@SuppressWarnings("resource")Scanner scanme1=new Scanner(freader);

	int b=Integer.parseInt(scanme1.nextLine());while(b>0){Course check=new Course();

	check.setCoursename(scanme1.nextLine());

	check.setCoursefee(scanme1.nextLine());

	date=scanme1.nextLine();somedate=format.parse(date);check.setStartdate(somedate);try{p=Integer.parseInt(scanme1.nextLine());

	sum(p);}catch(MyException me){

	}check.setDuration(p);

	q=Integer.parseInt(scanme1.nextLine());q1=Integer.parseInt(scanme1.nextLine());

	while(scanme1.hasNext()!=EOF){check.coursecoordinator.setDepartment(scanme1.nextLine());

	check.coursecoordinator.setFacultyname(scanme1.nextLine());

	check.coursecoordinator.setFacultyaddress(scanme1.nextLine());

	check.coursecoordinator.setFacultypnumber(scanme1.nextLine());

	check.coursecoordinator.setFacultyemail(scanme1.nextLine());}

	for(w=0;w<q;w++){

	check.fulty.get(w).setDepartment(scanme1.nextLine());

	check.fulty.get(w).setFacultyname(scanme1.nextLine());

	check.fulty.get(w).setFacultyaddress(scanme1.nextLine());

	check.fulty.get(w).setFacultypnumber(scanme1.nextLine());

	check.fulty.get(w).setFacultyemail(scanme1.nextLine());

	}

	for(w=0;w<q1;w++){

	check.pants.get(w).setParticipantorg(scanme1.nextLine());

	check.pants.get(w).setParticipantname(scanme1.nextLine());

	check.pants.get(w).setParticipantaddress(scanme1.nextLine());

	check.pants.get(w).setParticipantpnumber(scanme1.nextLine());

	check.pants.get(w).setParticipantemail(scanme1.nextLine());}

	coursea.add(check);b--;}scanme1.close();JOptionPane.showMessageDialog(null,"Data is read");}catch(Exception e){JOptionPane.showMessageDialog(null,"File not found ");}

	setVisible(true);Data.setVisible(false);Parts.setVisible(true);}

	};
	ActionListener createnewdatalistener=new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Data.setVisible(false);Parts.setVisible(true);setVisible(true);}};

	/**
	 * Create the applet.
	 */
	public CourseListFinal() {

		JPanel Data = new JPanel();
		getContentPane().add(Data);
		Data.setLayout(null);

		JButton btnNewButton = new JButton("Old Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(readmefilelistener);
			}
		});
		btnNewButton.setBounds(166, 71, 97, 25);
		Data.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.addActionListener(createnewdatalistener);
			}
		});
		btnNewButton_1.setBounds(166, 152, 97, 25);
		Data.add(btnNewButton_1);

		JPanel Parts = new JPanel();
		getContentPane().add(Parts);
		Parts.setLayout(null);

		JButton btnCreateCourse = new JButton("Create Course");
		btnCreateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				
				Course check = new Course();

				check.setCoursename(JOptionPane.showInputDialog("Enter name"));

				check.setCoursefee(JOptionPane.showInputDialog("Enter fee"));

				date(JOptionPane.showInputDialog("Enter date"));
				try {
					somedate = format.parse(date);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				check.setStartdate(somedate);


				try {
					jkl(JOptionPane.showInputDialog("Duration"));
					p=Integer.parseInt(jkl);
					sum(p);
				} catch (MyException me) {

				}

				check.setDuration(p);
				if (check.getDuration() > 14) {
					JOptionPane.showMessageDialog(null,"Duration is more thna 14 days");
					Runtime.getRuntime().exit(0);
				}
				coursea.add(check);
		
				Data.setVisible(false);
				Parts.setVisible(true);
				setVisible(true);
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
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				rs1(JOptionPane.showInputDialog("Give the course name in which the participant has to be added"));
				for (j = 0; j < coursea.size(); j++) {
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() < 5)) {
						Participants fifa1 = new Participants();
						coursea.get(j).pants.add(fifa1);

						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantorg(JOptionPane.showInputDialog("Participant Organisation"));

						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantname(JOptionPane.showInputDialog("Participant Name"));

						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantaddress(JOptionPane.showInputDialog("Participant Address"));

						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantpnumber(JOptionPane.showInputDialog("Participant number"));

						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantemail(JOptionPane.showInputDialog("Participant email"));
						coursea.get(j).setPcount(coursea.get(j).getPcount() + 1);
						break;
					}
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() == 5)) {
						JOptionPane.showMessageDialog(null, "No slots left.Participants are filled!!!");
						break;
					}
				}
				
				Data.setVisible(false);
				Parts.setVisible(true);
				setVisible(true);
			}

			private void rs1(String showInputDialog) {
				// TODO Auto-generated method stub
				
			}
		});
		Parts.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Create Faculty");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				rs(JOptionPane.showInputDialog("Give the course name in which faculty has to be added"));
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						
						fn(JOptionPane.showInputDialog("Enter a choice 1:to give details of course coord 2: to give instructor details"));
						if ((fn == "1") && (coursea.get(j).coursecoordinator.getFacultyname() == null)) {

							coursea.get(j).coursecoordinator.setDepartment(JOptionPane.showInputDialog("Department"));

							coursea.get(j).coursecoordinator.setFacultyname(JOptionPane.showInputDialog("Name"));

							coursea.get(j).coursecoordinator.setFacultyaddress(JOptionPane.showInputDialog("Address"));

							coursea.get(j).coursecoordinator.setFacultypnumber(JOptionPane.showInputDialog("Number"));

							coursea.get(j).coursecoordinator.setFacultyemail(JOptionPane.showInputDialog("Email"));

						}
						if ((fn == "2")&&(coursea.get(j).getFcount() < 5)) {

							Faculty fifa = new Faculty();
							coursea.get(j).fulty.add(fifa);
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setDepartment(JOptionPane.showInputDialog("Department"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyname(JOptionPane.showInputDialog("Name"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyaddress(JOptionPane.showInputDialog("Address"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultypnumber(JOptionPane.showInputDialog("Mobile"));

							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyemail(JOptionPane.showInputDialog("Email"));
							coursea.get(j).setFcount(coursea.get(j).getFcount() + 1);
							break;
						}
					}
				}
				
				Data.setVisible(false);
				Parts.setVisible(true);
				setVisible(true);
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
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
					
				fn(JOptionPane.showInputDialog("Enter a choice 1:Delete the course 2:Alter the course"));			

				if (fn == "1") {
			
					rs(JOptionPane.showInputDialog("Enter the course name to be deleted"));

					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
							coursea.remove(j);
							JOptionPane.showMessageDialog(null, "Successfully deleted");
							break;
						}
					}

				} else if (fn == "2") {
					
					rs(JOptionPane.showInputDialog("Enter the course name to be altered"));
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

							try {
								jkl(JOptionPane.showInputDialog("Duration"));
								p=Integer.parseInt(jkl);
								sum(p);
							} catch (MyException me) {

							}

							coursea.get(j).setDuration(p);

							if (coursea.get(j).getDuration() > 14) {
								JOptionPane.showMessageDialog(null,"duration is more than 14 days");
								Runtime.getRuntime().exit(0);
							}
							JOptionPane.showMessageDialog(null,"Successfully altered");
							break;
						}
					}
				}else  JOptionPane.showMessageDialog(null,"wrong opton entered");
					
				setVisible(true);
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
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);
				
				rs(JOptionPane.showInputDialog("Give the course name in which changes have to be made  "));
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						jkl(JOptionPane.showInputDialog("1:Delete 2:Alter participant details"));
						
						if (jkl == "1") {
							rs(JOptionPane.showInputDialog("Name of the participant to be  deleted"));
							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {
									coursea.get(j).pants.remove(coursea.get(j).pants.get(k));
									coursea.get(j).setPcount(coursea.get(j).getPcount() - 1);
								}
							}

						} else if (jkl == "2") {
							rs1(JOptionPane.showInputDialog("Give the participant name in which changes have to be made  "));

							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {

									coursea.get(j).pants.get(k).setParticipantorg(JOptionPane.showInputDialog("Organisation"));

									coursea.get(j).pants.get(k).setParticipantname(JOptionPane.showInputDialog("Name"));

									coursea.get(j).pants.get(k).setParticipantpnumber(JOptionPane.showInputDialog("Mobile"));

									coursea.get(j).pants.get(k).setParticipantemail(JOptionPane.showInputDialog("Email"));

									coursea.get(j).pants.get(k).setParticipantaddress(JOptionPane.showInputDialog("Address"));
								}
							}
						} else
							break;
					}
				}
				
				
				setVisible(true);
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
				setVisible(false);
				Parts.setVisible(false);
				Data.setVisible(false);
				
				rs(JOptionPane.showInputDialog("Give the course name in which faculty has to be deleted or altered"));
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						System.out.println("Enter 1 to delete the course coordinator from the course  ");
						System.out.println("Enter 2 to alter the course coordinator details in the course  ");
						System.out.println("Enter 3 to delete instructor from the course  ");
						System.out.println("Enter 4 to alter instructor details in the course  ");
						jkl(JOptionPane.showInputDialog("1:Delete course coord"
								+ "2:Alter course coord"));
						if (l == 1) {
							coursea.get(j).coursecoordinator = null;
							System.out.println("Course coordinator deleted successfully....");

							break;
						} else if (l == 2) {
							System.out.println("Give the new details of course coordinator  ");

							System.out.println("Course coordinator department:");
							coursea.get(j).coursecoordinator.setDepartment(scanme.nextLine());

							System.out.println("Course coordinator name:");
							coursea.get(j).coursecoordinator.setFacultyname(scanme.nextLine());

							System.out.println("Course coordinator address:");
							coursea.get(j).coursecoordinator.setFacultyaddress(scanme.nextLine());

							System.out.println("Course coordinator mobile:");
							coursea.get(j).coursecoordinator.setFacultypnumber(scanme.nextLine());

							System.out.println("Course coordinator email:");
							coursea.get(j).coursecoordinator.setFacultyemail(scanme.nextLine());
							break;
						} else if (l == 3) {
							System.out.println("Give the name of the instructor to be deleted  ");
							rs1 = scanme.nextLine();

							for (k = 0; (k < coursea.get(j).fulty.size()); k++) {
								if (coursea.get(j).fulty.get(k).getFacultyname().compareTo(rs1) == 0) {
									coursea.get(j).fulty.remove(coursea.get(j).fulty.get(k));
									coursea.get(j).setFcount(coursea.get(j).getFcount() - 1);
									System.out.println("Instructor deleted successfully....");
									break;
								}
							}

						} else if (l == 4) {
							System.out.println("Give the name of the instructor to be altered  ");
							rs1 = scanme.nextLine();
							for (k = 0; k < coursea.get(j).fulty.size(); k++) {
								if (coursea.get(j).fulty.get(k).getFacultyname().compareTo(rs1) == 0) {
									System.out.println("Instructor department:");
									coursea.get(j).fulty.get(k).setDepartment(scanme.nextLine());

									System.out.println("Instructor name:");
									coursea.get(j).fulty.get(k).setFacultyname(scanme.nextLine());

									System.out.println("Instructor mobile:");
									coursea.get(j).fulty.get(k).setFacultypnumber(scanme.nextLine());

									System.out.println("Instructor email:");
									coursea.get(j).fulty.get(k).setFacultyemail(scanme.nextLine());

									System.out.println("Instructor address:");
									coursea.get(j).fulty.get(k).setFacultyaddress(scanme.nextLine());
									break;
								}
							}
						} else
							break;
					}
				}
				
				
				setVisible(true);
				Parts.setVisible(true);
				Data.setVisible(false);
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
			}
		});
		btnNewButton_7.setBounds(144, 230, 170, 25);
		Parts.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Exit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

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
				try{
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
				
				
				}
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_8.setBounds(144, 268, 170, 25);
		Parts.add(btnNewButton_8);
		
	}

}
