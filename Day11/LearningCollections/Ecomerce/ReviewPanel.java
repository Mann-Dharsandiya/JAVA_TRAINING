package Day11.LearningCollections.Ecomerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReviewPanel {
    List<Review> reviewList = new ArrayList<>();

    public void addReview(Review review) {
        reviewList.add(review);
    }

    public void removeReview(int reviewId) {
        for (Review rv : reviewList) {
            if (rv.getReviewId() == reviewId) {
                reviewList.remove(rv);
            }
        }
    }

    // Search reviews by Product name
    public List<Review> searchReviewByProductName(String productName) {
        List<Review> result = new ArrayList<>();
        for (Review review : reviewList) {
            if (review.getPr().getProductName().equalsIgnoreCase(productName)) {
                result.add(review);
            }
        }
        return result;
    }

    // Update a comment by reviewId
    public boolean updateCommentByReviewId(int reviewId, String newComment) {
        for (Review review : reviewList) {
            if (review.getReviewId() == reviewId) {
                review.setComments(newComment);
                return true;
            }
        }
        return false;
    }

    // Sort review list by reviewId
    public void sortReviewListByReviewId() {
        Collections.sort(reviewList);
    }

    // Display all reviews
    public void displayAllReviews() {
        for (Review review : reviewList) {
            System.out.println(review);
        }
    }

    // public List<Review> getReviewList() {
    // return reviewList;
    // }
}
