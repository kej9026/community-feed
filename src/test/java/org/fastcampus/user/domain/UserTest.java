package org.fastcampus.user.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {

    private final UserInfo userInfo = new UserInfo("test", "");
    private final User user1 =new User(1L, userInfo);
    private final User user2 =new User(2L, userInfo);

    @Test
    void givenTwoUser_whenEqual_thenReturnFalse(){
        // when
        Boolean value = user1.equals(user2);

        // then
        assertFalse(value);
    }
}
