package kg.megacom;

import java.util.Objects;

public class Post {

          Status status;
          String type;
          Boolean deleted;
          String  _id;
          String user;
          String text;
          Integer __v;
          String source;
          String updatedAt;
          String createdAt;
          Boolean used;

    public Post(Status status, String type, Boolean deleted, String _id, String user, String text, int __v, String source, String updatedAt, String createdAt, Boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
        this.__v = __v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    @Override
    public String toString() {
        return "Post{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", _id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", __v=" + __v +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return __v == post.__v &&
                Objects.equals(status, post.status) &&
                Objects.equals(type, post.type) &&
                Objects.equals(deleted, post.deleted) &&
                Objects.equals(_id, post._id) &&
                Objects.equals(user, post.user) &&
                Objects.equals(text, post.text) &&
                Objects.equals(source, post.source) &&
                Objects.equals(updatedAt, post.updatedAt) &&
                Objects.equals(createdAt, post.createdAt) &&
                Objects.equals(used, post.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, deleted, _id, user, text, __v, source, updatedAt, createdAt, used);
    }

    public Post() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }
}
