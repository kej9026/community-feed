package org.fastcampus.user.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserInfoTest {

    @Test
    void givenNameAndProfileImage_whenCreated_thenThrowNothing(){
        // given
        String name= "abcd";
        String profileImageUrl= "";

        // when
        //then
        assertDoesNotThrow(()->new UserInfo(name, profileImageUrl));
    }

    @Test
    void givenBlankNameAndProfileImage_whenCreated_thenThrowError(){
        // given
        String name= "";
        String profileImageUrl= "";

        // when
        //then
        assertThrows(IllegalArgumentException.class, ()->new UserInfo(name, profileImageUrl));
    }
}
