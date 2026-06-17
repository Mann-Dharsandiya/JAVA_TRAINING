package Day11.LearningCollections.Ecomerce;

public class Review implements Comparable<Review> {
    private int reviewId;
    private Product pr;
    private String comments;

    public Review(int reviewId, Product pr, String comments) {
        this.reviewId = reviewId;
        this.pr = pr;
        this.comments = comments;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Product getPr() {
        return pr;
    }

    public void setPr(Product pr) {
        this.pr = pr;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int compareTo(Review other) {
        return Integer.compare(this.reviewId, other.reviewId);
    }

    @Override
    public String toString() {
        return "Review [reviewId=" + reviewId + ", product=" + pr.getProductName() + ", comments=" + comments + "]";
    }
}
