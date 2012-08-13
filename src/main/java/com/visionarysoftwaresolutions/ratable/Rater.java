package com.visionarysoftwaresolutions.ratable;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public abstract class Rater implements Reviewer {
	@Override
	public Review review(Reviewable toReview, String description){
		return rate(toReview, description, null);
	}
	
	public RatedReview rate(Reviewable toRate, String description, Enum<?> rating){
		return review(toRate, description,rating);
	}
	
	public RatedReview review(Reviewable toRate, String description, Enum<?> rating){
		return new RatingFactory().create(this, toRate, description, rating);
	}
}
