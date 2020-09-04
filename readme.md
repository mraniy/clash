**Exercice 1:**

1-write all tests defined in the "Ex1.java" based on the information provided above
EX1_Exceptions
  - All the tests were written into two files : 
    - EX1_Exceptions : in this test class , all the tests that should throw some exception are implemented. note that i changed a bit
    the structure of the tests , i removed the try catch with a boolean and changed it to the expteced exception attribute
    in the @Test annotation , used generally for this purpose.
    - EX1_Parametrized: in this test class , i chose to merge all the test cases that do the same computation
    with different values , this is the perfect case to implement a parametrized test.

2 -are all the tests defined enough to cover all cases ?  if not please complete with the missing tests.

  - There were some tests missing regarding the BlackElixirFactory :  
    the case where areBlueElixirAndGemsUnitsNotLogicallyRelated 
    returns true was not covered , i added two test cases in EX1_Exceptions.  
      - when_blue_elixir_1500_and_gems_is_4_throw_invalidquantityexception. 
      - when_blue_elixir_600_and_gems_is_15_throw_invalidquantityexception. 
          
  - BlackElixirFactory  was refactored , because the tests were a bit tough to understand at first sight , so  i chose to give to each test a meaningful name.
    Verifications was created in order to have more focused classes for controls.    
  

**Exercice 2:**

   Based on the information provided above please complete the implementation of the units : Dragon,Bomber,Giant and Miner
  in order to pass all tests included in  "Ex2.java" :
  
  - None of the tests were modified.
  - defensiveHitpoints and offensiveHitpoints were initialized in the default constructor of each Unit , note that i changed 
  the name of the variables , because it didnt respect java conventions , attributes begin with a lowercase letter.
  - as Bomber , Dragon , and all the units have the same structure and behaviour , i chose to add an abstract class 
  as their superclass , and migrate the attributes and their accessors , and even the receiveHit method , is moved to the superclass , as it has 
  the exact same behaviour in all the subclasses (test if the defensiveHitPoint is less than 0 , and if so,  returns an error message).
  
  
**Exercice 3:**  
  
  - For this part , i chose to implement the different behaviours (walk , run ,fly) in interfaces and implement them in the
    default method move.
    
    as the formula of the movement depends on the type of movement , and we can expect that the game can evolve to other type of units
    it's better to add this type of at the abstraction level , rather than the concrete level , as it would be necessary to reimplement
    the move method in all the future units :
    
    Imagine that we need an new unit Eagle , eagle is like a dragon , it can fly , so the eagle class has just to implement
    the Flyiable interface.
      
    
   

