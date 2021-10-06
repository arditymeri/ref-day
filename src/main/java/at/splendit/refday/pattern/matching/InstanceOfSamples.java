package at.splendit.refday.pattern.matching;

import at.splendit.refday.model.User;

public class InstanceOfSamples {
	
	public void sample1(Object o) {
		if(o instanceof User user) {
			award(user);
		}
	}
	
	
	public void sample2(Object o) {
		if(!(o instanceof User user)) {
			noAward();
		} else {
			award(user);
		}
	}
	
	

	private void noAward() {
		
	}


	private void award(User user) {
		
	}

}
