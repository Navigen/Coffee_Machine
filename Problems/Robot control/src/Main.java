class Move {

    public static void orientRobotUp(Robot robot) {
        switch (robot.getDirection()) {
            case DOWN: {
                robot.turnRight();
                robot.turnRight();
                break;
            }
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    public static void orientRobotDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP: {
                robot.turnRight();
                robot.turnRight();
                break;
            }
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    public static void orientRobotLeft(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT: {
                robot.turnRight();
                robot.turnRight();
                break;
            }
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    public static void orientRobotRight(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT: {
                robot.turnRight();
                robot.turnRight();
                break;
            }
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        //the movement along the X axis
        if (toX > robot.getX()) {
            orientRobotRight(robot);
            //rotateRobot(robot, Direction.RIGHT);
        }
        if (toX < robot.getX()) {
            orientRobotLeft(robot);
            //rotateRobot(robot, Direction.LEFT);
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        //the movement along the Y axis
        if (toY > robot.getY()) {
            orientRobotUp(robot);
            //rotateRobot(robot, Direction.UP);
        }
        if (toY < robot.getY()) {
            orientRobotDown(robot);
            //rotateRobot(robot, Direction.DOWN);
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}