
# Project Title

This project contains solutions to problems presented on the beecrowd platform written in the Java programming language.


## Usage/Examples
The problem statement will be inserted as a comment before the code, and the solution will follow. For example (problem bee1000):
```java
/*
 * Problem Statement:
 * "Your first program in any programming language is usually "Hello World!". In this first problem all you have to do is print this message on the screen.
 * 
 * Input
 * This problem has no input.
 * 
 * Output
 * You must print the message Hello World! and then the endline."
*/

public static void main(String args[]) {
    System.out.println("Hello World!");
}
```
Whenever necessary (for more complex problems), an explanation of what the next line or block does (comment) will be inserted into the code, for a better understanding of the solution. For example (problem bee1016):

```java
/*
 * Problem Statement:
 * "Two cars (X and Y) leave in the same direction. The car X leaves with a constant speed of 60 km/h and the car Y leaves with a constant speed of 90 km / h.
 * 
 * In one hour (60 minutes) the car Y can get a distance of 30 kilometers from the X car, in other words, it can get away one kilometer for each 2 minutes.
 * 
 * Read the distance (in km) and calculate how long it takes (in minutes) for the car Y to take this distance in relation to the other car.
 * 
 * Input
 * The input file contains 1 integer value.
 * 
 * Output
 * Print the necessary time followed by the message "minutos" that means minutes in Portuguese."
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //Creating the data reading variable
        Scanner input = new Scanner(System.in);
        
        //Creating the data receiving variable and the other for the result        
        int distance,minutes;

        //Reading the distance
        distance = input.nextInt();

        //Calculating the result (time)
        minutes = distance * 2;

        //Printing the result
        System.out.println(minutes + " minutos");
    }
}
```
The class name here on GitHub is the same as the file name, as Java requires for full functionality. But in beecrowd, due to its configuration to test your code, the class must be named "Main" to work (as you saw in the examples above). Keep an eye out for this.
I hope this repository can help you with your programming studies. Hugs.

## Authors

- Paulo Matheus [@dukeriulyck](https://www.github.com/dukeriulyck)

