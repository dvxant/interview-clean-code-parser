**task for Java developer interview** 

Inspired by Yegor Bugaenko:)

What could be corrected in the code:

1) comment: "This class is thread-safe" 
It doesn't give much information to the user and is misleads since not all the methods are thread-safe
_solution: edit or delete comment_ 

2) SRP - Single Responsibility Principle is broken
Parser class can parse and save content 
_solution: create own class for "saveContent" method_

3) DRY - Don't Repeat Yourself Principle is broken
We have the same code in "parseContent" and "parseContentWithoutUnicode" methods
_solution: move duplicated code to a separate private method 
or combine two methods and add a flag_

4) Bad naming - for example, in the variables "FileInputStream i" or "FileOutputStream o" 
_solution: change name for more informative_

5) Magic numbers - in "parseContentWithoutUnicode" method we have the value "0x80"
It does not give any useful information and it is not clear what does it mean
_solution: add comment 
or more suitable choice is to add a variable to the method with more informative name_

6) Output/input streams are not closed
_solution: close streams_ 

Optional: 
1) handle exceptions with "try" and "catch" and add logging
2) bad text formatting - improve it

