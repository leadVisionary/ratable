package com.visionarysoftwaresolutions.ratable

import com.visionarysoftwaresolutions.reviewable.Review
import com.visionarysoftwaresolutions.reviewable.Reviewable;


class RatingTest extends spock.lang.Specification {
	Rater nick
	Reviewable food
	
	public void setup(){
		given: "we have a user named nick"
			nick = new User("nick")
		and: "some beer named Guinness"
			food = new Beer(name:"Guinness")
	}
	
	def "when no rating is given, a review can still be made"(){
		when: "I try to have a rater review a reviewable"
			Review result = nick.review(food, "delicious")
		then: "the review should be saved"
			result.description == "delicious"
		and: "the reviewer should be nick"
			result.reviewer == nick
		and: "the reviewed should be beer" 
			result.reviewed == food
	}
	
	def "default reviews from factories should not be rated"(){
		when: "we create a review from the factory"
			def result = new RatingFactory().create(nick, food, "no taste")
		and: "we try to make a rating from it"
			def rated = (RatedReview) result
		then: "it should have no rating set"
			rated.rating == NoRatingScale.NONE.toString()
	}
	
	def "can make a rated review"(){
		when: "I have the Reviewer rate the Reviewable"
			RatedReview result = nick.rate(food,
					"It is so creamy and delicious!",
					FiveStarRatingScale.FIVE);
		then: "it has nick as the reviewer"
			result.reviewer == nick
		and: "guiness as the food"
			result.reviewed == food
		and:"creamy and delicious as the description"	
			result.description == "It is so creamy and delicious!"
		and: "it is rated"
			result.rating == FiveStarRatingScale.FIVE.toString()
	}
}
