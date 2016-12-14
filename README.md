## Final Projects
----
#### This is where all of you needs to submit your source code and report.
----

Here is a short video **[link](https://www.youtube.com/watch?v=XdhuWDdu-rk)** that will show you how to upload your code here. Here is a [list of steps](https://education.github.com/guide/forks#3-completing-assignments) to be followed precsiely.

>
  1. At first, **fork** this repository
  2. Then **Clone** the forked repository from your account to your pc
  3. Then add all your project files and put your report in the README.md file
  4. **Push/Sync** all the changes you made to github
  5. Create a **Pull Request** on the original repository to complete submission

And here is a long video **[link](https://www.youtube.com/watch?v=73I5dRucCds)** in case you want to know more.

Before you commit your project, put your team name, name of all members and matric, project name and class section in README.md file. And put your team name in the description of the commit.

**At least one of your team member needs to have a GitHub account to be able to submit, do create an account.**

> Bring the [[DSA Project: Group Assessment.pdf](https://github.com/iium-dsa-tutorial/final-projects/blob/master/DSA%20Project-Group%20Assessment.pdf )] document with you in the presentation.

#### You have to fill up the following section - 
----

**Team Name:Power Rangers**

**Project Name:Merge Sort Visualization**

**Section:4**

**Members:**

  1. Mohamad Hambali Bin Adenan (1420281)
  
  2. Mohammad Faiz Azhari Bin Mohd Fazil (1429825)
  
  3. Muhammad Aiman Syafiq Bin Mohd Nor (1425979)
  
  4. Muhamad Amirudin Bin Saad (1324963)
  
----

### Report

1)	Extra Features : No extra features.

 2) Language Used : Java + WindowBuilder(Java)

 3) GUI (Graphic User Interface)

Image
4) Short Description (Class)

Public class trymergeascanddesc()

 * Returns value that are sorted in ascending and descending order that 
   Will pass value to another class ; mergelagibuilder()  
 * This method always returns immediately, whether or not the 
 * It will sort value in ascending and descending order. 

Public class mergelagibuilder()

 * This class is for GUI (interface) which supposedly consists of ;

?	Width adjustment
?	Height adjustment
?	FPS(Frame Per Second) adjustment
?	Apply Button (Apply the Adjustment on Graph Bar)
?	Desc Button - Merge Sort in Descending order
?	Rand Button - Merge Sort in Random order
?	Asc Button  - Merge Sort in Ascending order
?	Generate Button - Generate the MergeSort

 * Get value from another class ; trymergeascanddesc()  
 * This method always returns immediately, whether or not the 
 * It will display sort value in ascending and descending order. 



5) Short Description (Function)

1)	Public static void MergeSort ( int [ ] num , int i , int j ) -

Returns value that can then be display on the screen or as output. The num argument must specify an absolute num. The  i and j argument is a specifier that is relative to the num argument.
This method always returns immediately . When this value attempts to display the output on the screen, the data will be loaded.

     2) public void run()  - Launch the application.

     3) public mergelagibuilder() - Create the application.

     4) private void initialize() - Initialize the contents of the frame.

     5) public void actionPerformed(ActionEvent e) - Do Auto-generated method
 
     6) private void baddActionListener(ActionListener actionListener) - 
            Do Auto-generated method




Detail explaination about algorithm

        	In the algorithm part it started with a package name mergelagi. In the package there is a public class name trymergeascanddesc. The codes starts with the initiation of n = 10 then it calls a function MergeSort with parimeter of (num, 0, n-1). The class contains a function MergeSort which contains the merge sort function that sort the data into ascending order. Function merge sort takes the perimeter of an array num, int I and int j. Int I will be declared as low and int j will be declared as high. Next an if statement that states if (low >= high) it will return to the main. If not the function continues to searching for the middle part of the array, int middle is initiate to (low + high )/2 .

        	The function continues with another function call MergeSort with parameter of (num, low, middle). The process repeats to get a new middle which is between the low and the old middle. Next there is another function MergeSort with parameter (num, middle + 1, high).  This parameter was sent to MergeSort function to get the new middle which is between the old middle+1 and the high. The new middle will be initiate to end_low and the middle + 1 will be initiate to start_high. Next, a while loop will be conducted to sort the the array from low to high. Lastly, the output will shown as After Sorting, Ascending Order and Descending order. 



----
