package com.packs.app;

/*
-- Actor extends Sprite

int x;
int y;
int radius;

-- initActor() method
-   loadImage("src/resources/alien.png");
-   getImageDimensions();

-- move()
-   neighbors[] =               findNeighbors()
-   int[] neighborsDistance =   

-- findNeighbors(Actor... actorsList)
// look for object within the radius
-   declare Actor[] withinRadius;       (alternative initializer list with actorList, and remove all outside radius)
-   loop actorsList
-   get actor.x and actor.y
-   if actor position it within the radius
-   add to withinRadius list
-   return withinRadius list

-- neighborDistance(int x1, int y1, int x2, int y2)
// Calculate the distance between 2 vector points
-   return (float)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 

-- sortNeighbors(Actor[] neighbors) ????????????????
// Create a 2D Actors list, sorted by distance 
-   declare 2D actorsDistanceList
-   for(Actor n : neighbors)
-   neighborDistance(x, y, n.x, n.y);
-   add to list
-   sort list
-   return list
        
--  Separation
// calculate best direction, based on neighbors distance and direction

*/

public class Actor extends Sprite {

    private final int INITIAL_X = 400;

    public Actor(int x, int y) {
        super(x, y);
        System.out.println("constructor:" +x);
        initActor();
    }



    private void initActor() {

        loadImage("src/resources/star.png");
        getImageDimensions();
    }

    public void move() {

        // target position
        int tx = 300;
        int ty = 200;

        // Reset if crosses west boundary
        if (x < 0) {
            x = INITIAL_X;
        }

        // Move Actor Horizontal
        if (x==tx) { 
            System.out.println("finish_X: " +x);
        } else if (x < 0) {
            x-=1;
            System.out.println("west    " +x);
        } else {
            x+=1;
            System.out.println("east    " +x);
        }

        // Move Actor Vertical
        if (y==ty) { 
            System.out.println("finish_Y: " +y);
        } else if (y < 0) {
            y-=1;
            System.out.println("north    " +y);
        } else {
            y+=1;
            System.out.println("south    " +y);
        }

    }
}