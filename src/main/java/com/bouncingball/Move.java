package com.bouncingball;

public enum Move {
    LEFT {
        @Override
        public Point nextPosition(Ball ball) {
            return ball.left();
        }

        @Override
        public Point moveBall(Ball ball) {
            return ball.moveLeft();
        }
    }, RIGHT {
        @Override
        public Point nextPosition(Ball ball) {
            return ball.right();
        }

        @Override
        public Point moveBall(Ball ball) {
            return ball.moveRight();
        }
    }, FORWARD {
        @Override
        public Point nextPosition(Ball ball) {
            return ball.forward();
        }

        @Override
        public Point moveBall(Ball ball) {
            return ball.moveForward();
        }
    }, BACK {
        @Override
        public Point nextPosition(Ball ball) {
            return ball.back();
        }

        @Override
        public Point moveBall(Ball ball) {
            return ball.moveBackward();
        }
    };

    abstract public Point nextPosition(Ball ball);

    public abstract Point moveBall(Ball ball);
}
