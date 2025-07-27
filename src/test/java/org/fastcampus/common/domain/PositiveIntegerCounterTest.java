package org.fastcampus.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveIntegerCounterTest {
    @Test
    void givenCreated_whenIncrease_thenCountIsOne(){
        // given
        PositiveIntegerCounter counter =new PositiveIntegerCounter();

        // when
        counter.increase();

        //then
        assertEquals(1, counter.getCount());
    }

    @Test
    void givenCreatedAndIncrease_whenDecrease_thenCountIsZero(){
        // given
        PositiveIntegerCounter counter =new PositiveIntegerCounter();
        counter.increase();

        // when
        counter.decrease();

        //then
        assertEquals(0, counter.getCount());
    }

    @Test
    void givenCreated_whenDecrease_thenCountIsZero(){
        // given
        PositiveIntegerCounter counter =new PositiveIntegerCounter();

        // when
        counter.decrease();

        //then
        assertEquals(0, counter.getCount());
    }
}
