package ai.jobiak.collection;

import java.util.Objects;

public class Course implements Comparable{
	
	private String CourseId;
	private String title;
	private int durationHours;
	private double fees;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courseId, String title, int durationHours, double fees) {
		super();
		CourseId = courseId;
		this.title = title;
		this.durationHours = durationHours;
		this.fees = fees;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationHours() {
		return durationHours;
	}

	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CourseId, durationHours, fees, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(CourseId, other.CourseId) && durationHours == other.durationHours
				&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", title=" + title + ", durationHours=" + durationHours + ", fees="
				+ fees + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Course ref = (Course)o;
		if(this.CourseId.compareTo(ref.getCourseId())<0) {
			return -1;
		} else if(this.CourseId.compareTo(CourseId)==0) {
			return 0;
		}else if(this.CourseId.compareTo(CourseId)>0) {
		return 1;
		}
	return 0;
	
	
	}	
}


