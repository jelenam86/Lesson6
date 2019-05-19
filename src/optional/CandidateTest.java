package optional;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class CandidateTest {
	
//	@Test
//	public void test1() {
//		CandidatePool pool = new CandidatePool();
//		
//		for (int i = 0; i < 10; i++) {
//			pool.addCandidate(new Candidate(i + 1, "a", (double) new Random().nextInt(101)));
//			pool.addCandidate(new Candidate(i + 11, "b", (double) new Random().nextInt(101)));
//			pool.addCandidate(new Candidate(i + 21, "c", (double) new Random().nextInt(101)));
//			pool.addCandidate(new Candidate(i + 31, "d", (double) new Random().nextInt(101)));
//		}
//
//		assertEquals(10, pool.removeCandidatesForPosition("a"));
//
//	}

	public static void main(String[] args) {

		CandidatePool pool = new CandidatePool();
		for (int i = 0; i < 10; i++) {
			pool.addCandidate(new Candidate(i + 1, "a", (double) new Random().nextInt(101)));
			pool.addCandidate(new Candidate(i + 11, "b", (double) new Random().nextInt(101)));
			pool.addCandidate(new Candidate(i + 21, "c", (double) new Random().nextInt(101)));
			pool.addCandidate(new Candidate(i + 31, "a", (double) new Random().nextInt(101)));
		}
		pool.addCandidate(new Candidate(41, "a", 95.23));
		pool.addCandidate(new Candidate(42, "a", 95.23));
		pool.addCandidate(new Candidate(43, "a", 95.2));
		pool.addCandidate(new Candidate(44, "a", 100));
		pool.addCandidate(new Candidate(45, "a", 100));
		pool.addCandidate(new Candidate(46, "a", 100));
		
		//System.out.println(pool);
		System.out.println(pool.toString(pool.getCandidatesForPosition("b")));
		System.out.println(pool.getBestCandidate("b"));
		System.out.println(pool.getBestCandidate("a"));
		System.out.println(pool.removeCandidatesForPosition("c"));
		System.out.println(pool.removeCandidatesForPosition("d"));
		//System.out.println(pool);
		
	}
}
