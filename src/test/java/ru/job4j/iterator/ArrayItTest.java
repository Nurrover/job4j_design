package ru.job4j.iterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayItTest {

    @Test
    void whenMultiCallHasNextThenTrue() {
        ArrayIt arrayIt = new ArrayIt(
            new int[] {1, 2, 3}
        );
        boolean result = arrayIt.hasNext();
        assertThat(result).isTrue();
        assertThat(arrayIt.hasNext()).isTrue();
    }

    @Test
    void whenReadSequence() {
        ArrayIt arrayIt = new ArrayIt(
                new int[] {1, 2, 3}
        );
        assertThat(arrayIt.next()).isEqualTo(1);
        assertThat(arrayIt.next()).isEqualTo(2);
        assertThat(arrayIt.next()).isEqualTo(3);
    }
}