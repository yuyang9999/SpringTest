package com.springinaction.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangyu on 15/8/17.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}