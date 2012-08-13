package com.visionarysoftwaresolutions.ratable;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

class BasicReview implements Review{
	
	private final Rater rater;
	private final Reviewable reviewed;
	private final String description;
	
	BasicReview(Rater r, Reviewable re, String des){
		rater = r;
		reviewed= re;
		description = des;
	}
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Reviewer getReviewer() {
		return rater;
	}

	@Override
	public Reviewable getReviewed() {
		return reviewed;
	}
}