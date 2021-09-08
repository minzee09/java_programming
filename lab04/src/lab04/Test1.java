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
		System.out.print( "이름: " + name + " 학번: " + studNum + " 전공: " + major + " 학년: " + year + " 이수 학점: " + credit);
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
		System.out.print(" 동아리: " + club);
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
		System.out.print(" 조교 유형: " + TAtype + " 장학금: " + scholarship);
	}	
}
public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student("김민지",2020111242,"디지털미디어학과",2,19);
		UnderGraduate s2 = new UnderGraduate("박민지",2019111242,"언론영상학부",3,21,"디쥬얼");
		Graduate s3 = new Graduate("이민지",2021111242,"소프트웨어융합학과",1,18,"연구 조교",0.7);
		s1.print();
		System.out.println();
		s2.print();
		System.out.println();
		s3.print();
		System.out.println();

	}
}
