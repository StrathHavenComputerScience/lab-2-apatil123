public class Lab2
{
    public static void cleanSquare()
    {
        Robot.load("square.txt");
        Robot.setDelay(0.1);

        //INSERT CODE HERE
        onerow();
        onerow();
        onerow();
        onerow();
    }

    public static void onerow()
    //pre: Robot is on light block and facing dark block row.
    //post: Robot has made row light and is now facing next row.
    {if (Robot.frontIsClear()){Robot.move();Robot.makeLight();}
        if (Robot.frontIsClear()){Robot.move();Robot.makeLight();}
        if (Robot.frontIsClear()){Robot.move();Robot.makeLight();}
        if (Robot.frontIsClear()){Robot.move();Robot.makeLight();}
        if (Robot.frontIsClear()){Robot.move();Robot.makeLight();}
        if (Robot.frontIsClear()){Robot.move();}
        if (Robot.frontIsClear()){Robot.move();}
        else {Robot.turnLeft();}
    }

    public static void darkenComb()
    {
        Robot.load("comb.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        rowandback();
        rowandback();
        rowandback();
        rowandback();
        rowandback();
    }

    public static void rowandback()
    {
        //pre: Robot is at the beginning of a light row, in the blank collumn, facing upwards.
        //post: Robot is at the beginning of the next row.
        Robot.makeDark(); turnRight(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.makeDark();
        Robot.turnLeft(); Robot.turnLeft();
        Robot.move(); Robot.move(); Robot.move(); Robot.move(); Robot.move(); Robot.move();
        turnRight();
        if (Robot.frontIsClear()){Robot.move(); Robot.makeDark(); Robot.move();}
    }

    public static void turnRight()
    {
        //pre: Robot faces any direction.
        //post: Robot turns left three times, eventually facing the right of the original direction.
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void makeCheckered()
    {
        Robot.load("blank.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        firstchecker();
        secondchecker();
        firstchecker();
        secondchecker();
        firstchecker();
        secondchecker();
        firstchecker();
        secondchecker();
    }

    public static void firstchecker()
    {
        //pre: Robot is facing upwards on an empty collumn. 
        //post: Robot is on top of the now checkered row.
        Robot.makeDark(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move();
    }

    public static void secondchecker()
    {
        //pre: Robot is to the the side of the next row and facing upwards.
        //post: Robot is on the bottom of an empty row, facing upwards.
        turnRight(); Robot.move(); Robot.makeDark(); turnRight(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.move(); Robot.makeDark(); Robot.move(); Robot.turnLeft();
        if (Robot.frontIsClear())
        {
            Robot.move(); Robot.turnLeft();
        }

    }
}