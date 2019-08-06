package co.grandcircus.consume.model;

import java.util.Collections;
import java.util.List;

public class CompleteResponse {
	
	private List<Complete> complete;

	public List<Complete> getComplete() {
		Collections.sort(complete);
		return complete;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
}
