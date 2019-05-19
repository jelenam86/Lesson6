package optional;

public class Candidate {

//	/** Constructs a new Candidate object */
//	 public Candidate(int idNumber, String position, double interviewScore)
//	 { /* implementation not shown */ }
//	 
//	 /** @return the position for which the candidate is applying */
//	 public String getPosition()
//	 { /* implementation not shown */ }
//	 
//	 /** @return the candidate's interview score */
//	 public double getInterviewScore()
//	 { /* implementation not shown */ }
//	 
//	 // There may be instance variables, constructors, and methods that are not shown.

	private int idNumber;
	private String position;
	private double interviewScore;

	/** Constructs a new Candidate object */
	public Candidate(int idNumber, String position, double interviewScore) {
		this.idNumber = idNumber;
		this.position = position;
		this.interviewScore = interviewScore;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/** @return the position for which the candidate is applying */
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	/** @return the candidate's interview score */
	public double getInterviewScore() {
		return interviewScore;
	}

	public void setInterviewScore(double interviewScore) {
		this.interviewScore = interviewScore;
	}

	@Override
	public String toString() {

		return "Candidate ID: " + getIdNumber() + ", @position: " + getPosition() + ", score: " + getInterviewScore();
	}
}
