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
    	BattleField bf1 = new BattleField();
        assertEquals(true, bf1.fieldValidator(battleField));
        //assertEquals(false, BattleField.fieldValidator(battleField1));
        //assertEquals(true, BattleField.fieldValidator(battleField2));
        BattleField bf2 = new BattleField();
        assertEquals(false, bf2.fieldValidator(battleField3));
    }
}
