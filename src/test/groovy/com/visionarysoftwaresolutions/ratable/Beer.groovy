package com.visionarysoftwaresolutions.ratable

import com.visionarysoftwaresolutions.ratable.Rater
import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable
import com.visionarysoftwaresolutions.reviewable.Reviewer;

class Beer implements Reviewable {
	String name
	Review rev	 
    @Override
	public Review getReview(Reviewer reviewer) {
		rev
	}
}
