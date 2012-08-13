package com.visionarysoftwaresolutions.ratable;

import com.visionarysoftwaresolutions.reviewable.ReviewDecorator;
import com.visionarysoftwaresolutions.reviewable.Reviewable;

/**
 *
 * @author Nicholas Vaidyanathan, Lead Visionary of Visionary Software Solutions
 * @description RatedReview is a simple interface for a review that an entity that 
 * reviews other entities on a scale. 
 * We try to make it as generalizable as possible so it can apply in multiple situations
 * Scenario: A Reviewer creates a RatedReview for a Reviewable with a description, Rating it on a RatingScale
 * Example: Nick creates a RatedReview of YourBody 
 * with a RatingScale of OneToTenRatingScale 
 * with a rating of 10 and a description "It's awesome!" 
 */
public class RatedReview extends ReviewDecorator {
	private Enum<?> rating;
	
	public RatedReview(Rater rater, Reviewable toReview, String description, Enum<?> rating) {
		super(new BasicReview(rater, toReview, description));
		this.rating = rating;
	}
	
	public String getRating(){
		return rating.name();
	}
}