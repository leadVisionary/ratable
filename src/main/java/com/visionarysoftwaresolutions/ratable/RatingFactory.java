package com.visionarysoftwaresolutions.ratable;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.ReviewFactory;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public class RatingFactory implements ReviewFactory {

	@Override
	public Review create(Reviewer reviewer, Reviewable toReview, String description) {
		return create((Rater)reviewer, toReview, description,NoRatingScale.NONE);
	}

	public RatedReview create(Rater rat, Reviewable toReview, String description, Enum<?> rating){
		return new RatedReview(rat, toReview, description, rating);
	}
}
