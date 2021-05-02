package kg.megacom;

import java.util.Objects;

public class Status {

    Boolean verified;
    Integer sentCount;
    String feedback;

    public Status() {
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Integer getSentCount() {
        return sentCount;
    }

    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(verified, status.verified) &&
                Objects.equals(sentCount, status.sentCount) &&
                Objects.equals(feedback, status.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verified, sentCount, feedback);
    }
}
