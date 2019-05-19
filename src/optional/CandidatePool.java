package optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CandidatePool {

	/** The list of all candidates */
	private List<Candidate> pool;

	/** Constructs a new CandidatePool object */
	public CandidatePool() {
		pool = new ArrayList<Candidate>();
	}

	/**
	 * Adds candidate to the pool
	 * 
	 * @param candidate the candidate to add to the pool
	 */
	public void addCandidate(Candidate candidate) {
		pool.add(candidate);
	}

	/**
	 * Returns a list of candidates from the pool that have the same position as
	 * position
	 * 
	 * @param position the position of candidates to return
	 * @return a list of candidates that have the desired position
	 */
	public List<Candidate> getCandidatesForPosition(String position) {
		List<Candidate> forPosition = new ArrayList<Candidate>();
		for (Candidate c : pool) {
			if (c.getPosition().equals(position))
				forPosition.add(c);
		}
		return forPosition;
	}

	private List<Candidate> candidatesWithScoreOnPosition(double score, String position) {
		List<Candidate> list = getCandidatesForPosition(position);
		List<Candidate> scoreList = new ArrayList<Candidate>();
		for (Candidate c : list) {
			if (c.getInterviewScore() == score)
				scoreList.add(c);
		}
		return scoreList;
	}

	/**
	 * Returns the candidate from the pool with the highest interview score that has
	 * the same position as position or null if position does not match the position
	 * of any candidate.
	 * 
	 * @param position the position of the candidate to return
	 * @return the candidate for position with the highest interview score or null
	 */
	public Candidate getBestCandidate(String position) {
		List<Candidate> forPosition = getCandidatesForPosition(position);
		if (forPosition.isEmpty())
			return null;

		forPosition.sort(new Comparator<Candidate>() {
			@Override
			public int compare(Candidate o1, Candidate o2) {
				return Double.compare(o1.getInterviewScore(), o2.getInterviewScore());
			}
		});

		List<Candidate> scoreList = candidatesWithScoreOnPosition(
				forPosition.get(forPosition.size() - 1).getInterviewScore(), position);
		if (scoreList.size() > 1) {
			System.out.println("There is more than one candidate with the same (best) interview score for the position "
					+ position + ":");
			System.out.println(toString(scoreList));
			System.out.println("Random best candidate is:");
			return scoreList.get(new Random().nextInt(scoreList.size()));
		} else
			return forPosition.get(forPosition.size() - 1);
	}

	/**
	 * Removes all candidates from the pool that have the same position as position.
	 * 
	 * @param position the position of candidates to remove from the pool
	 * @return the number of candidates removed from the pool
	 */
	public int removeCandidatesForPosition(String position) {
//		int count = 0;

//		for (int i = 0; i < pool.size(); i++) {
//			if (pool.get(i).getPosition().equals(position)) {
//				pool.remove(i);
//				count++;
//				i--;
//			}
//		}

		int count = getCandidatesForPosition(position).size();
		pool.removeAll(getCandidatesForPosition(position));

//		Iterator<Candidate> candidateIterator = pool.iterator();
//		while(candidateIterator.hasNext()) {
//			Candidate c = candidateIterator.next();
//			if(c.getPosition().equals(position)) {
//				count++;
//				candidateIterator.remove();
//			}
//		}

		return count;
	}

	@Override
	public String toString() {
		String a = "";
		for (Candidate c : pool)
			a += c.toString() + "\n";

		if (a.equals(""))
			return "Empty pool";
		else
			return a;
	}

	public String toString(List<Candidate> list) {
		String a = "";
		for (Candidate c : list) {
			a += c.toString() + "\n";
		}
		if (a.equals(""))
			return "Empty list";
		else
			return a;
	}

}
