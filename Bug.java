public class Bug {

    // Instance Variables

    int positionX; // - X position of bug
    int positionY; // - Y positon of bug

    /** Constructor of Bug Object
     * @param positionX - x position of bug
     * @param positionY - y position of bug
     */
    public Bug(int positionX,int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /** Returns the x position of bug Object
     * @return - returns int value of positionX
     */
    public int getPositonX(){
        return positionX;
    }

    /** Returns the y position of bug Object
     * @return - returns int value of positionY
     */
    public int getPositionY(){
        return positionY;
    }

    /** Changes the value of positionX, adds movementX to positionX value
     * @param movementX - amount user want to move bug in X axis
     */
    public void moveX(int movementX){
        positionX += movementX;
    }

    /** Changes the value of positiony, adds movementY to positiony value
     * @param movementY - amount user wants to move bug in Y axis
     */
    public void moveY(int movementY){
        positionY += movementY;
    }


}
