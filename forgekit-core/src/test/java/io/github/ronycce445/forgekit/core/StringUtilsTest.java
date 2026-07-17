package io.github.ronycce445.forgekit.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void reverseShouldReverseCharacters(){
        //Arrange
        String input = "forge";
        //Act
        String result = StringUtils.reverse(input);
        //Assert
        assertEquals("egrof",result);

    }
    @Test
    void capitalizeShouldCapitalizeFirstLetter(){
        String input  = "forge";
        String result = StringUtils.capitalize(input);
        assertEquals("Forge",result);
    }
    @Test
    void isPalindromeShouldReturnTrueForPalindrome(){

        assertTrue(StringUtils.isPalindrome("madam"));
    }
    @Test
    void isPalindromeShouldReturnFalseForNonPalindrome(){

        assertFalse(StringUtils.isPalindrome("forge"));


    }
    @Test
    void wordCountShouldReturnCorrectCount(){
        String input = "Hello World!";
        int result = StringUtils.wordCount(input);
        assertEquals(2,result);

    }
    }


