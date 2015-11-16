# android-unit-test-kata

This is a simple exercise to demostrate how you can create unit tests in an android application. 

For each step of the kata, there is a branch Checkout step<#> to jump to the step. For each step, there is an answer branch as well. Checkout step<#>-answer for a solution. If you get de-railed with your solution, you can get back on track by stashing and checking out a branch.

##Step 1
In order to perform unit tests, you will need to add a few standard dependencies. Edit the gradle file and add junit, hamcrest, mockito, and power mock.

##Step 2
There is a PasswordValidatorTest. Run it and it should fail. Work on making the tests pass.

##Step 3
There is a new method on the FieldValidator interface. Get more expirence with junit testing with android studio by getting the new test to pass. 

##Step 4
Congrats! If you made it this far then you should be pretty comfortable with android studio and unit testing nuances. 

Let's act like we are doing TDD and now we need to start to implement the more complex logic for our password validator. Again, make the tests pass. Do not use any utility classes for this step, we will get to that in the next step. Solve this with just using methods on a string.

##Step 5
We changed the solution from the previous step to use android.text.TextUtils.isEmpty() instead. Since this is a class in the android library, like Bundle and Intent, we will run into some issues. Use PowerMock to get around these issues.

##Step 6
Apply everything we have learned with the password validator and create an email validator. If you get stuck, you can reference step6-answer branch too see a solution. 
