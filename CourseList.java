
import java.util.*;
import java.io.*;
import java.text.*;

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

@SuppressWarnings("serial")
class MyException extends Exception {
	private int ex;

	MyException(int v) {
		setEx(v);
	}

	public String toString() {
		System.out.println("Duration is more than 14 days");
		Runtime.getRuntime().exit(0);
		return (null);

	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
// Main class

public class CourseList {

	static void sum(int v) throws MyException {
		if (v >= 15) {
			throw new MyException(v);
		}

	}

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date somedate = null;
		Date nowdate = new Date();
		String date = null;
		String tempo = null;

		Scanner scanme = new Scanner(System.in);
		int i = 1, l, m = 0, rj, switchme, q, w;
		ArrayList<Course> coursea = new ArrayList<Course>(10);
		String rs = null, rs1 = null;
		int j = 0, k = 0, checkp, p = 0;
		String xoxo = null;
		long SECOND = 1000;
		long MINUTE = 60 * SECOND;
		long HOUR = 60 * MINUTE;
		long DAY = 24 * HOUR;
		System.out.println("Enter 1 to give new data");
		System.out.println("Enter 2 to take old data from input.txt file");
		checkp = scanme.nextInt();
		scanme.nextLine();

		File file = new File("input1.txt");

		int h = 0;
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Arraylist for storing courses of old data
		if (checkp == 2) {
			FileReader freader = new FileReader(file.getAbsoluteFile());
			@SuppressWarnings("resource")
			Scanner scanme1 = new Scanner(freader);

			int b = Integer.parseInt(scanme1.nextLine());
			while (b > 0) {
				Course check = new Course();

				check.setCoursename(scanme1.nextLine());

				check.setCoursefee(scanme1.nextLine());

				date = scanme1.nextLine();
				somedate = format.parse(date);
				check.setStartdate(somedate);
				try {
					p = scanme1.nextInt();
					scanme1.nextLine();
					sum(p);
				} catch (MyException me) {

				}
				check.setDuration(p);

				q = Integer.parseInt(scanme1.nextLine());

				check.coursecoordinator.setDepartment(scanme1.nextLine());

				check.coursecoordinator.setFacultyname(scanme1.nextLine());

				check.coursecoordinator.setFacultyaddress(scanme1.nextLine());

				check.coursecoordinator.setFacultypnumber(scanme1.nextLine());

				check.coursecoordinator.setFacultyemail(scanme1.nextLine());
				for (w = 0; w < q; w++) {

					check.fulty.get(w).setDepartment(scanme1.nextLine());

					check.fulty.get(w).setFacultyname(scanme1.nextLine());

					check.fulty.get(w).setFacultyaddress(scanme1.nextLine());

					check.fulty.get(w).setFacultypnumber(scanme1.nextLine());

					check.fulty.get(w).setFacultyemail(scanme1.nextLine());

				}
				q = Integer.parseInt(scanme1.nextLine());
				for (w = 0; w < q; w++) {

					check.pants.get(w).setParticipantorg(scanme1.nextLine());

					check.pants.get(w).setParticipantname(scanme1.nextLine());

					check.pants.get(w).setParticipantaddress(scanme1.nextLine());

					check.pants.get(w).setParticipantpnumber(scanme1.nextLine());

					check.pants.get(w).setParticipantemail(scanme1.nextLine());
				}

				coursea.add(check);
				b--;
			}

		}

		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bwriter = new BufferedWriter(fwriter);

		while (i == 1) {
			System.out.println("Enter a number  ");
			System.out.println("Enter 1: Create a course......................  ");
			System.out.println("Enter 2: Delete or alter course...............  ");
			System.out.println("Enter 3: Display course and its details.......  ");
			System.out.println("Enter 4. Create faculty.......................  ");
			System.out.println("Enter 5: Delete or alter faculty..............  ");
			System.out.println("Enter 6. Display faculty and their details....  ");
			System.out.println("Enter 7. Create participant...................  ");
			System.out.println("Enter 8. Delete or alter participant..........  ");
			System.out.println("Enter 9. Display participant and their details  ");
			System.out.println("Enter 10.Display all courses,faculty,participnts");
			System.out.println("Enter 11.Do nothing return back to menu....... ");
			System.out.println("Enter 12.Exit when there is no more input.....  ");
			switchme = scanme.nextInt();
			scanme.nextLine();
			/////////////////////////////////////////////////////////////////////////////////////////////////////////
			// SWITCH STATEMENT
			switch (switchme) {
			case 1: {

				{
					Course check = new Course();

					System.out.println("Course name:");
					check.setCoursename(scanme.nextLine());

					System.out.println("Course fee:");
					check.setCoursefee(scanme.nextLine());

					System.out.println("Start date in [dd/mm/yyyy] format:");
					date = scanme.nextLine();
					somedate = format.parse(date);
					check.setStartdate(somedate);

					System.out.println("Duration in days:");

					try {
						p = scanme.nextInt();
						scanme.nextLine();
						sum(p);
					} catch (MyException me) {

					}

					check.setDuration(p);
					if (check.getDuration() > 14) {
						System.out.println("Duration is more than 14 days");
						Runtime.getRuntime().exit(0);
					}
					coursea.add(check);

					break;
				}
			}

			case 2: {
				System.out.println("Enter 1:To delete a course  ");
				System.out.println("Enter 2:To alter a course  ");
				rj = scanme.nextInt();
				scanme.nextLine();

				if (rj == 1) {
					System.out.println("Give the course name to delete that course  ");
					rs = scanme.nextLine();

					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
							coursea.remove(j);
							System.out.println("Course successfully removed");

							break;
						}
					}

				} else if (rj == 2) {
					System.out.println("Give the course name to alter and new details of the course to be altered   ");
					rs = scanme.nextLine();

					for (j = 0; j < coursea.size(); j++) {
						if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
							System.out.println("Course name:");
							coursea.get(j).setCoursename(scanme.nextLine());

							System.out.println("Course fee:");
							coursea.get(j).setCoursefee(scanme.nextLine());

							System.out.println("Start date in [dd/mm/yyyy] format:");
							date = scanme.nextLine();
							somedate = format.parse(date);
							coursea.get(j).setStartdate(somedate);

							System.out.println("Duration in Days:");
							try {
								p = scanme.nextInt();
								scanme.nextLine();
								sum(p);
							} catch (MyException me) {

							}

							coursea.get(j).setDuration(p);

							if (coursea.get(j).getDuration() > 14) {
								System.out.println("Duration is more than 14 days");
								Runtime.getRuntime().exit(0);
							}
							System.out.println("Course details altered successfully");
							break;
						}
					}
				} else
					break;
				break;

			}

			case 3: {
				for (j = 0; j < coursea.size(); j++) {
					System.out.println("Course" + (j + 1) + ":");
					System.out.println("Coursename:" + coursea.get(j).getCoursename());
					System.out.println("Coursefee :" + coursea.get(j).getCoursefee());
					System.out.println("Startdate :" + coursea.get(j).getStartdate());
					System.out.println("Duration  :" + coursea.get(j).getDuration());
				}
				break;
			}

			case 4: {
				System.out.println("Give the course name to which faculty has to be added ");
				rs = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						if (coursea.get(j).coursecoordinator.getFacultyname() == null)
							System.out.println("Enter 1 to give details of course coord or alter them  ");
						if (coursea.get(j).getFcount() < 5)
							System.out.println("Enter 2 to give details of instructor  ");
						else {
							System.out.println("All slots are filled!!!");
							break;
						}
						l = scanme.nextInt();
						scanme.nextLine();
						if ((l == 1) && (coursea.get(j).coursecoordinator.getFacultyname() == null)) {
							System.out.println("Give the details of course coordinator   ");

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

						}
						if (l == 2) {

							System.out.println("Give the instructors details  ");

							System.out.println("Instructor department:");
							Faculty fifa = new Faculty();
							coursea.get(j).fulty.add(fifa);
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setDepartment(scanme.nextLine());

							System.out.println("Instructor name:");
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyname(scanme.nextLine());

							System.out.println("Instructor address:");
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyaddress(scanme.nextLine());

							System.out.println("Instructor mobile:");
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultypnumber(scanme.nextLine());

							System.out.println("Instructor email:");
							coursea.get(j).fulty.get(coursea.get(j).getFcount()).setFacultyemail(scanme.nextLine());
							coursea.get(j).setFcount(coursea.get(j).getFcount() + 1);
							break;
						}
					}
				}

				break;
			}

			case 5: {
				System.out.println("Give the course name in which faculty has to be deleted or altered  ");
				rs = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						System.out.println("Enter 1 to delete the course coordinator from the course  ");
						System.out.println("Enter 2 to alter the course coordinator details in the course  ");
						System.out.println("Enter 3 to delete instructor from the course  ");
						System.out.println("Enter 4 to alter instructor details in the course  ");
						l = scanme.nextInt();
						scanme.nextLine();
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
				break;

			}

			case 6: {
				System.out.println("Give the name of the coursename in which faculty has to be displayed   ");
				rs1 = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						if (coursea.get(j).coursecoordinator.getFacultyname() != null) {
							System.out.println("Department:" + coursea.get(j).coursecoordinator.getDepartment());
							System.out.println("Name      :" + coursea.get(j).coursecoordinator.getFacultyname());
							System.out.println("Address   :" + coursea.get(j).coursecoordinator.getFacultyaddress());
							System.out.println("Mobile    :" + coursea.get(j).coursecoordinator.getFacultypnumber());
							System.out.println("Email     :" + coursea.get(j).coursecoordinator.getFacultyemail());
						}
						for (k = 0; k < coursea.get(j).fulty.size(); k++) {
							System.out.println(
									"Faculty" + coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1 + ":");
							System.out.println("Department:" + coursea.get(j).fulty.get(k).getDepartment());
							System.out.println("Name      :" + coursea.get(j).fulty.get(k).getFacultyname());
							System.out.println("Address   :" + coursea.get(j).fulty.get(k).getFacultyaddress());
							System.out.println("Mobile    :" + coursea.get(j).fulty.get(k).getFacultypnumber());
							System.out.println("Email     :" + coursea.get(j).fulty.get(k).getFacultyemail());
						}
					}
				}
				break;
			}

			case 7: {
				System.out.println("Give the name of the course to which participant has to be added  ");
				rs1 = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() < 5)) {
						System.out.println("Give the participants details  ");
						Participants fifa1 = new Participants();
						coursea.get(j).pants.add(fifa1);

						System.out.println("Participant organisation:");
						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantorg(scanme.nextLine());

						System.out.println("Participant name:");
						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantname(scanme.nextLine());

						System.out.println("Participant address:");
						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantaddress(scanme.nextLine());

						System.out.println("Participant number:");
						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantpnumber(scanme.nextLine());

						System.out.println("Participant email:");
						coursea.get(j).pants.get(coursea.get(j).getPcount()).setParticipantemail(scanme.nextLine());
						coursea.get(j).setPcount(coursea.get(j).getPcount() + 1);
						break;
					}
					if ((coursea.get(j).getCoursename().compareTo(rs1) == 0) && (coursea.get(j).getPcount() == 5)) {
						System.out.println("Participants for the course are filled!!!");
						break;
					}
				}
				break;
			}
			case 8: {
				System.out.println("Give the course name in which changes have to be made  ");
				rs = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						System.out.println("Enter 1 to delete the participant from the course  ");
						System.out.println("Enter 2 to alter the participant details in the course  ");
						l = scanme.nextInt();
						scanme.nextLine();
						if (l == 1) {
							System.out.println("Give the name of participant to be deleted in the course   ");
							rs1 = scanme.nextLine();
							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {
									coursea.get(j).pants.remove(coursea.get(j).pants.get(k));
									coursea.get(j).setPcount(coursea.get(j).getPcount() - 1);
								}
							}

						} else if (l == 2) {
							System.out.println("Give the name of the participant to be altered  ");
							rs1 = scanme.nextLine();

							for (k = 0; k < coursea.get(j).pants.size(); k++) {
								if (coursea.get(j).pants.get(k).getParticipantname().compareTo(rs1) == 0) {

									System.out.println("Participant organisation:");
									coursea.get(j).pants.get(k).setParticipantorg(scanme.nextLine());

									System.out.println("Participant name:");
									coursea.get(j).pants.get(k).setParticipantname(scanme.nextLine());

									System.out.println("Participant mobile:");
									coursea.get(j).pants.get(k).setParticipantpnumber(scanme.nextLine());

									System.out.println("Participant email:");
									coursea.get(j).pants.get(k).setParticipantemail(scanme.nextLine());

									System.out.println("Participant address:");
									coursea.get(j).pants.get(k).setParticipantaddress(scanme.nextLine());
								}
							}
						} else
							break;
					}
				}
				break;
			}

			case 9: {
				System.out.println("Give the name of the coursename in which participant has to be displayed   ");
				rs1 = scanme.nextLine();
				for (j = 0; j < coursea.size(); j++) {
					if (coursea.get(j).getCoursename().compareTo(rs) == 0) {
						for (k = 0; k < coursea.get(j).pants.size(); k++) {
							System.out.println("Participant" + coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k))
									+ 1 + ":");
							System.out.println("Organisation:" + coursea.get(j).pants.get(k).getParticipantorg());
							System.out.println("Name        :" + coursea.get(j).pants.get(k).getParticipantname());
							System.out.println("Address     :" + coursea.get(j).pants.get(k).getParticipantaddress());
							System.out.println("Mobile      :" + coursea.get(j).pants.get(k).getParticipantpnumber());
							System.out.println("Email       :" + coursea.get(j).pants.get(k).getParticipantemail());
						}

					}
				}
				break;
			}
			case 10: {
				h = 1;
				break;

			}

			case 11: {
				break;
			}

			case 12: {
				m = 1;
				break;
			}

			default: {
				System.out.println("Wrong entering of number!!!Enter again  ");
				break;
			}

			}
			if (m == 1) {
				System.out.println("Breaking from while loop too.....");
				break;
			}
			if (h == 1)
				break;
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// WRITING DATA
		bwriter = new BufferedWriter(fwriter);
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

			bwriter.write(Integer.toString(coursea.get(i).getPcount()));
			bwriter.newLine();

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
			scanme.close();
			bwriter.close();
			fwriter.close();

		}
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// displaying all courses last one year and future one year
		if (h == 1) {

			long x;

			int old_ten = 0, new_ten = 0;

			for (j = 0; j < coursea.size(); j++) {
				somedate = coursea.get(j).getStartdate();
				x = somedate.getTime() - nowdate.getTime();
				x = x / DAY;
				if (x >= -366 && x <= 0) {
					if (old_ten < 10) {
						System.out.println(coursea.indexOf(coursea.get(j)) + 1);
						System.out.println(coursea.get(j).getCoursename());
						System.out.println(coursea.get(j).getCoursefee());
						tempo = format.format(coursea.get(j).getStartdate());
						System.out.println(tempo);
						System.out.println(coursea.get(j).getDuration());

						System.out.println("Participants in the course:");
						for (k = 0; k < coursea.get(j).pants.size(); k++) {
							System.out.println(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
							System.out.println(coursea.get(j).pants.get(k).getParticipantorg());
							System.out.println(coursea.get(j).pants.get(k).getParticipantname());
							System.out.println(coursea.get(j).pants.get(k).getParticipantaddress());
							System.out.println(coursea.get(j).pants.get(k).getParticipantpnumber());
							System.out.println(coursea.get(j).pants.get(k).getParticipantemail());
						}

						if (coursea.get(j).coursecoordinator.getFacultyname() != null) {
							System.out.println("Course coordinator details:");
							System.out.println(coursea.get(j).coursecoordinator.getDepartment());
							System.out.println(coursea.get(j).coursecoordinator.getFacultyname());
							System.out.println(coursea.get(j).coursecoordinator.getFacultyaddress());
							System.out.println(coursea.get(j).coursecoordinator.getFacultypnumber());
							System.out.println(coursea.get(j).coursecoordinator.getFacultyemail());
						}
						System.out.println("Instructors details:");
						for (k = 0; k < coursea.get(j).fulty.size(); k++) {
							System.out.println(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
							System.out.println(coursea.get(j).fulty.get(k).getDepartment());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyname());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyaddress());
							System.out.println(coursea.get(j).fulty.get(k).getFacultypnumber());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyemail());
						}
						old_ten++;
						System.out.println();
					}

				}
				if (x >= 0 && x < 366) {
					if (new_ten <= 10) {

						System.out.println(coursea.indexOf(coursea.get(j)) + 1);
						System.out.println(coursea.get(j).getCoursename());
						System.out.println(coursea.get(j).getCoursefee());
						tempo = format.format(coursea.get(j).getStartdate());
						System.out.println(tempo);
						System.out.println(coursea.get(j).getDuration());

						System.out.println("Participants in the course:");
						for (k = 0; k < coursea.get(j).pants.size(); k++) {
							System.out.println(coursea.get(j).pants.indexOf(coursea.get(j).pants.get(k)) + 1);
							System.out.println(coursea.get(j).pants.get(k).getParticipantorg());
							System.out.println(coursea.get(j).pants.get(k).getParticipantname());
							System.out.println(coursea.get(j).pants.get(k).getParticipantaddress());
							System.out.println(coursea.get(j).pants.get(k).getParticipantpnumber());
							System.out.println(coursea.get(j).pants.get(k).getParticipantemail());
						}

						System.out.println("Course coordinator details:");
						System.out.println(coursea.get(j).coursecoordinator.getDepartment());
						System.out.println(coursea.get(j).coursecoordinator.getFacultyname());
						System.out.println(coursea.get(j).coursecoordinator.getFacultyaddress());
						System.out.println(coursea.get(j).coursecoordinator.getFacultypnumber());
						System.out.println(coursea.get(j).coursecoordinator.getFacultyemail());

						System.out.println("Instructors details:");
						for (k = 0; k < coursea.get(j).fulty.size(); k++) {
							System.out.println(coursea.get(j).fulty.indexOf(coursea.get(j).fulty.get(k)) + 1);
							System.out.println(coursea.get(j).fulty.get(k).getDepartment());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyname());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyaddress());
							System.out.println(coursea.get(j).fulty.get(k).getFacultypnumber());
							System.out.println(coursea.get(j).fulty.get(k).getFacultyemail());
						}
						new_ten++;
						System.out.println();

					}

				}

			}
			h = 0;
		}

	}
}
