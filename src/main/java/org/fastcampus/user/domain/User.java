package org.fastcampus.user.domain;

import org.fastcampus.common.domain.PositiveIntegerCounter;

import java.util.Objects;

public class User {
    private final Long id;
    private final UserInfo info;
    private final PositiveIntegerCounter followingCount;
    private final PositiveIntegerCounter follwerCounter;

    public User(Long id, UserInfo userInfo) {
        if (userInfo==null){
            throw new IllegalArgumentException();
        }
        this.id=id;
        this.info = userInfo;
        this.followingCount = new PositiveIntegerCounter();
        this.follwerCounter = new PositiveIntegerCounter();
    }

    public void follow(User targetUser){
        if (targetUser.equals(this)) {
            throw new IllegalArgumentException();
        }

        followingCount.increase();
        targetUser.increaseFollowerCount();
    }

    public void unfollow(User targetUser){
        if (this.equals(targetUser)) {
            throw new IllegalArgumentException();
        }

        followingCount.decrease();
        targetUser.decreaseFollowerCount();
    }

    private void increaseFollowerCount(){
        follwerCounter.increase();
    }

    private void decreaseFollowerCount(){
        follwerCounter.decrease();
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }
}
