package lab04;

class Student
{
	private String name;
	private int studNum;
	private String major;
	private int year;
	private int credit;
	
	Student(String name, int studNum, String major, int year, int credit)
	{
		setName(name);
		setStudNum(studNum);
		setMajor(major);
		setYear(year);
		setCredit(credit);
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public int getStudNum() { return studNum; }
	public void setStudNum(int studNum) { this.studNum = studNum; }

	public String getMajor() { return major; }
	public void setMajor(String major) { this.major = major; }

	public int getYear() { return year; }
	public void setYear(int year) { this.year = year; }

	public int getCredit() { return credit; }
	public void setCredit(int credit) { this.credit = credit; }
	
	public void print()
	{
		System.out.print( "�̸�: " + name + " �й�: " + studNum + " ����: " + major + " �г�: " + year + " �̼� ����: " + credit);
	}
}

class UnderGraduate extends Student
{
	private String club;

	UnderGraduate(String name, int studNum, String major, int year, int credit, String club)
	{
		super(name, studNum, major, year, credit);
		setClub(club);
	}
	
	public String getClub() { return club; }
	public void setClub(String club) { this.club = club; }
	
	@Override
	public void print()
	{
		super.print();
		System.out.print(" ���Ƹ�: " + club);
	}
}
class Graduate extends Student
{
	private String TAtype;
	private double scholarship;
	
	Graduate(String name, int studNum, String major, int year, int credit, String TAtype, double scholarship)
	{
		super(name, studNum, major, year, credit);
		setTAtype(TAtype);
		setScholarship(scholarship);	
	}

	public String getTAtype() { return TAtype; }
	public void setTAtype(String TAtype) { this.TAtype = TAtype; }

	public double getScholarship() { return scholarship; }
	public void setScholarship(double scholarship) { this.scholarship = scholarship; }
	
	@Override
	public void print()
	{
		super.print();
		System.out.print(" ���� ����: " + TAtype + " ���б�: " + scholarship);
	}	
}
public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student("�����",2020111242,"�����й̵���а�",2,19);
		UnderGraduate s2 = new UnderGraduate("�ڹ���",2019111242,"��п����к�",3,21,"�����");
		Graduate s3 = new Graduate("�̹���",2021111242,"����Ʈ���������а�",1,18,"���� ����",0.7);
		s1.print();
		System.out.println();
		s2.print();
		System.out.println();
		s3.print();
		System.out.println();

	}
}
