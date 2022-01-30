package com.java2blog.output.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BattleFieldTests {

  private static int[][] battleField = {{1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                                        {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                                        {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                                        {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                                        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                                        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

  private static int[][] battleField1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
									     {0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, 
									     {0, 0, 1, 0, 0, 0, 0, 1, 0, 0}, 
									     {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 
									     {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
									     {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}, 
									     {0, 1, 0, 0, 0, 0, 1, 0, 0, 1}, 
									     {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, 
									     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
									     {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}};
  
  private static int[][] battleField2 = {{1, 0, 0, 0, 0, 1, 1, 0, 0, 0}, 
										 {1, 0, 1, 0, 0, 0, 0, 0, 1, 0}, 
										 {1, 0, 1, 0, 1, 1, 1, 0, 1, 0}, 
										 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
										 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, 
										 {0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, 
										 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, 
										 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
										 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 
										 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
  private static int[][] battleField3 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
		  {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, 
		  {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, 
		  {1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
		  {1, 0, 0, 1, 1, 0, 0, 0, 0, 0}, 
		  {1, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 
		  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
		  {0, 0, 0, 1, 0, 0, 0, 1, 1, 1}, 
		  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
		  {0, 0, 1, 1, 0, 0, 0, 0, 0, 0}};
    @Test
    public void SampleTest() {
        assertEquals(true, BattleField.fieldValidator(battleField));
        //assertEquals(false, BattleField.fieldValidator(battleField1));
        //assertEquals(true, BattleField.fieldValidator(battleField2));
        assertEquals(false, BattleField.fieldValidator(battleField3));
    }
}
