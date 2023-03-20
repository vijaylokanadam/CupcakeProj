MetaData / Blue Print 

class Student
{
	int rno;
	String name;
	String course;
	String phno;
	double marks;
	
	public void setCourse(String c)
	{
		course = c;
	}
	public char calcGrade()
	{
		if(marks>70)  return 'A';
		if(marks>40)  return 'B';
		return 'C';
	}
}


Student s1 = new Student();
double  d;

	s1.rno = 1;
	s1.name = "Pram";
	s1.course = "Oracle";
	s1.phno = "878456456";
	
Student s2 = new Student();

	s2.rno=2;
	s2.name="Chak";
	s2.course="JAva";
	s2.phno="956756756";
	
	3
	Sunny
	JAva
	7657567576
	
	